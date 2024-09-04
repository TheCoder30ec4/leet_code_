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
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    public int dfsHeight(TreeNode root){
        if(root == null){
            return 0;
        }


        int left_height = dfsHeight(root.left);
        if(left_height == -1) return -1;
        int right_height = dfsHeight(root.right);
        if(right_height == -1) return -1;


        if(Math.abs(left_height - right_height) > 1) return -1;

        return Math.max(left_height, right_height)+1;
    }
}