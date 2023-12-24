package contests.top150.n124_binary_tree_max_path_sum;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Solution {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        max = Math.max(max, node.val + left + right);
        return Math.max(left, right) + node.val;
    }
}
