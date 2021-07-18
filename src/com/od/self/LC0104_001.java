package com.od.self;

public class LC0104_001 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.left = left;
        root.right = right;
        left.left = null;
        left.right = null;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        LC0104_001 solution = new LC0104_001();
        System.out.println(solution.maxDepth(root));
    }
}
