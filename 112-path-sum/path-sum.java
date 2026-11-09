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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }
   if(root.left == null && root.right == null){
    return root.val == targetSum;
   }
   int remain = targetSum - root.val;
   return hasPathSum(root.left,remain) || hasPathSum(root.right, remain);

       /*  ArrayList<Integer> arr = new ArrayList<>();
       sum(root,arr);
       if(arr == targetSum){
        return true;
       }
       return false;
    }
    public int sum(TreeNode root,ArrayList<Integer> arr){
        if(root == null){
            return 0;
        }
        int left = sum(root.left,arr);
        int right = sum(root.right,arr);
        
        return arr.add(root.left.val+root.right.val); */
    }
}