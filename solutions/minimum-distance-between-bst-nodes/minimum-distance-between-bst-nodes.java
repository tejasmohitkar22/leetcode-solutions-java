/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        int diff = Integer.MAX_VALUE;
        preOrder(root, list);
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(diff > Math.abs(list.get(i) - list.get(j))){
                    diff = Math.abs(list.get(i) - list.get(j));
                }
            }
        }
        return diff;
    }

    public static void preOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}