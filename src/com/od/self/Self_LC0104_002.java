package com.od.self;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Self_LC0104_002 {

    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
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

        Self_LC0104_002 solution = new Self_LC0104_002();
        System.out.println(solution.maxDepth(root));
    }
}
