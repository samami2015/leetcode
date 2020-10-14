package com.od.self;

public class Self_LC0111_001 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minDepth = Integer.MAX_VALUE;
        if (root.left != null) {
            minDepth = Math.min(minDepth(root.left), minDepth);
        }
        if (root.right != null) {
            minDepth = Math.min(minDepth(root.right), minDepth);
        }
        return minDepth + 1;
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

        Self_LC0111_001 solution = new Self_LC0111_001();
        System.out.println(solution.minDepth(root));
    }
}
