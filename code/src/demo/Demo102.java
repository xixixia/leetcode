package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo102 {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        List<TreeNode> l1 = new ArrayList<>();
        List<TreeNode> l2 = new ArrayList<>();
        l1.add(root);
        while (!l1.isEmpty() || !l2.isEmpty()) {
            if (!l1.isEmpty()) {
                List<Integer> result = new ArrayList<>();
                for (TreeNode node : l1) {
                    if (node == null) {
                        continue;
                    }
                    result.add(node.val);
                    l2.add(node.left);
                    l2.add(node.right);
                }
                results.add(result);
            }
            l1.clear();
            if (!l2.isEmpty()) {
                List<Integer> result = new ArrayList<>();
                for (TreeNode node : l2) {
                    if (node == null) {
                        continue;
                    }
                    result.add(node.val);
                    l1.add(node.left);
                    l1.add(node.right);
                }
                results.add(result);
            }
            l2.clear();
        }
        return results;
    }
}
