package com.od.self;

public class LC0098_001 {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return root.left != null && root.left.val < root.val && root.right != null && root.right.val > root.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        LC0098_001 solution = new LC0098_001();
        System.out.println(solution.isValidBST(root));
    }
}
