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
    public static int maxsum;
    public int maxPathSum(TreeNode root) {
        maxsum=Integer.MIN_VALUE;
        gainfromsubtree(root);
        return maxsum;
    }
    public static int gainfromsubtree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftgain=Math.max(0,gainfromsubtree(root.left));
        int rightgain=Math.max(0,gainfromsubtree(root.right));
        int currsum=root.val+leftgain+rightgain;
        maxsum=Math.max(currsum,maxsum);
        return root.val+Math.max(leftgain,rightgain);
    }
}