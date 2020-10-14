package com.od.self;

public class Self_LC0098_002 {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    public boolean helper(TreeNode node,Integer lower,Integer upper){
        if(node == null){
            return true;
        }

        int val = node.val;
        if(lower!=null && val <= lower){
            return false;
        }
        if(upper!=null && val >= upper){
            return false;
        }

        if(!helper(node.left,lower,val)){
            return false;
        }

        if(!helper(node.right,val,upper)){
            return false;
        }
        return true;
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
        Self_LC0098_002 solution = new Self_LC0098_002();
        System.out.println(solution.isValidBST(root));
    }
}
