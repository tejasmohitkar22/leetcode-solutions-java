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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTrav(root, list);
        return list;
    }

    public void inorderTrav(TreeNode root, List<Integer> list){
        if (root == null) {
            return;
        }
        inorderTrav(root.left, list);
        list.add(root.val);
        inorderTrav(root.right, list);

    }
}