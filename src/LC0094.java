import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC0094 {
    public class TreeNode {
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

/*    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    private void dfs(List<Integer> res, TreeNode root) {
        if (root == null) return;
        dfs(res, root.left);
        res.add(root.val);
        dfs(res, root.right);
    }*/

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (stack.size() > 0 || root != null) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
                res.add(temp.val);
                root = temp.right;
            }
        }
        return res;
    }
}
