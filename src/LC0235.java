public class LC0235 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.right == p && root.left == q){
            return root;
        }
        if((root == p && root.right == q )|| (root.left == p || root == q)){
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        LC0235 solution = new LC0235();
        TreeNode root = new TreeNode(6);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(4);
        node1.left = node3;
        node1.right = node4;
        node3.left = null;
        node3.right = null;
        node4.left = new TreeNode(3);
        node4.right = new TreeNode(5);

        node2.left = new TreeNode(7);
        node2.right = new TreeNode(9);
        System.out.println(solution.lowestCommonAncestor(root,node1,node2).val);
    }
}
