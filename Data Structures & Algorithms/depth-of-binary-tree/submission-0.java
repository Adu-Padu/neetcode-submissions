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
    public int maxDepth(TreeNode root) {

        return function1(root, 0);
    }

    public int function1(TreeNode root, int depth){
        if(root == null){
            return depth;
        }

        depth = depth + 1;
        int leftDepth = function1(root.left, depth);
        int rightDepth = function1(root.right, depth);
        
        return Math.max(leftDepth, rightDepth);
    }
}
