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
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode inors = FIS(root.left);
        TreeNode inorp = FIP(root.right);

        if (inors != null && inors.val >= root.val) {
            return false;
        }

        if (inorp != null && inorp.val <= root.val) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }

    public TreeNode FIS(TreeNode root) {
        while (root != null && root.right != null) {
            root = root.right;
        }
        return root;
    }

    public TreeNode FIP(TreeNode root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }
}