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
    public int maxPathSum(TreeNode root) {

        int[]  maxi = {Integer.MIN_VALUE};
        findMaxSum(root,maxi);
        return maxi[0];
    }

    private int findMaxSum(TreeNode root, int[] maxi){
        if(root == null) return 0;

        int leftPath = Math.max(0,findMaxSum(root.left,maxi));
        int rightPath = Math.max(0,findMaxSum(root.right,maxi));

        maxi[0]= Math.max(maxi[0], leftPath+rightPath+root.val);

        return Math.max(leftPath, rightPath) + root.val;
    }
}