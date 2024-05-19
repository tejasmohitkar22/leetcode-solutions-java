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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<Integer>();
        preOrder(root, list, low, high);
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void preOrder(TreeNode root, List<Integer> list, int low, int high){
        if(root == null){
            return;
        }
        if(root.val >= low && root.val <= high){
            list.add(root.val);
        }
        preOrder(root.left, list, low, high);
        preOrder(root.right, list, low, high);
    }
}