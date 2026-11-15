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
    public TreeNode invertTree(TreeNode root) {

        

      
        if(root == null){
            return null;
        }
            
      
            
       

        TreeNode newTree = root;
        TreeNode newTreeOldLeft = root.left;
        newTree.left = invertTree(newTree.right);
        newTree.right = invertTree(newTreeOldLeft);

        return newTree;
    }
}
