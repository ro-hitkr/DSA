class Solution {
    static class Info {
        int dia;
        int ht;
        public Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    // 1. MAIN METHOD: LeetCode calls this. It returns the final integer.
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        return helper(root).dia; // Extract just the diameter from our package
    }

    // 2. HELPER METHOD: This does the bottom-up recursion using the Info class.
    private Info helper(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }

        // Call the helper instead of the main method
        Info leftinfo = helper(root.left);
        Info rightinfo = helper(root.right);

        // Fix Math.max and use .dia instead of the object
        int diam = Math.max(Math.max(leftinfo.dia, rightinfo.dia), leftinfo.ht + rightinfo.ht);
        int ht = Math.max(leftinfo.ht, rightinfo.ht) + 1;

        return new Info(diam, ht); // Make sure 'diam' matches your variable name
    }
}
