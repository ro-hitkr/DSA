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
    public static int ht(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = ht(root.left);
        int rh = ht(root.right);
        return Math.max(lh,rh)+1;


    }
    public boolean isBalanced(TreeNode root) {
       if(root == null){
            return true;
        }
        int rl = ht(root.left);
        int rr = ht(root.right);
        if (Math.abs(rl - rr) > 1) {
            return false;
        }
    boolean rlll = isBalanced(root.left);
    boolean rll = isBalanced(root.right);
    return rlll && rll;
    }
}