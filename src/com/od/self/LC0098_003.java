package com.od.self;

import java.util.LinkedList;

public class LC0098_003 {
    LinkedList<TreeNode> stack = new LinkedList<>();
    LinkedList<Integer> uppers = new LinkedList<>();
    LinkedList<Integer> lowers = new LinkedList<>();

    public boolean isValidBST(TreeNode root) {
        Integer lower = null, upper = null, val;
        update(root, lower, upper);

        while (!stack.isEmpty()) {
            root = stack.poll();
            lower = lowers.poll();
            upper = uppers.poll();

            if (root == null) continue;
            val = root.val;
            if (lower != null && val <= lower) return false;
            if (upper != null && val >= upper) return false;
            update(root.right,val,upper);
            update(root.left,lower,val);
        }
        return true;
    }

    public void update(TreeNode root, Integer lower, Integer upper) {
        stack.add(root);
        lowers.add(lower);
        uppers.add(upper);
    }

    public static void main(String[] args) {
        //5,1,4,null,null,3,6
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        LC0098_003 solution = new LC0098_003();
        System.out.println(solution.isValidBST(root));
    }
}
