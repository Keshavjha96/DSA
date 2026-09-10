class Solution {
    
    int result;
    int[] sum(TreeNode root) {
        if(root==null) {
            return new int[]{0, 0};
        }
        int[] left = sum(root.left);
        int[] right = sum(root.right);
        int totalSum =left[0]+right[0] + root.val;
        int count = left[1] + right[1] + 1;

        return new int[]{totalSum, count};
    }
    void solve(TreeNode root) {
        if(root==null) {
            return;
        }
        int[] ans = sum(root);
        int totalSum = ans[0];
        int count = ans[1];
        if (totalSum / count == root.val) {
            result++;
        }
        solve(root.left);
        solve(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        result = 0;
        solve(root);
        return result;
    }
}