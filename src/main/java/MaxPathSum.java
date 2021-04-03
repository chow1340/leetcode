import nodes.TreeNode;

public class MaxPathSum {
    int maxValue;

    public int maxPathSum(TreeNode root) {
        this.maxValue = Integer.MIN_VALUE;
        dfs(root);
        return maxValue;
    }

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));

        this.maxValue = Math.max(left +  right + root.val, maxValue);
        return Math.max(left , right) + root.val;
    }
}
