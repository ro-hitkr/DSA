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
        ArrayList<Integer> result = new ArrayList<>();
         if(root == null){
            return true;
        }
        helper(root,result);

        for(int i=1; i<result.size();i++){
            if(result.get(i) <= result.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public static void helper(TreeNode root,ArrayList<Integer> result){
        if(root == null){
            return;
        }
        helper(root.left,result);
        result.add(root.val);
        helper(root.right,result);
        
    }
}