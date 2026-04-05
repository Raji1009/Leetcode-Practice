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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val > key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val < key){
            root.right=deleteNode(root.right,key);
        }
        else{
            //case 1 no child
            if(root.right==null && root.left==null){
                return null;
            }
            
            //case 2 one child
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }

            //case 3 two child
            TreeNode innode=FindInOrder(root.right);
            root.val=innode.val;
            root.right=deleteNode(root.right,innode.val);
        }
        return root;
    }
    public TreeNode FindInOrder(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}