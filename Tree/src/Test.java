import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Integer[] levelOrderData = {6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5};
        TreeNode root = LevelOrderBinaryTree.createTree(levelOrderData);

    }

}

class LevelOrderBinaryTree {

    public static TreeNode createTree(Integer[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0 || levelOrder[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while (i < levelOrder.length) {
            TreeNode current = queue.poll();

            if (levelOrder[i] != null) {
                current.left = new TreeNode(levelOrder[i]);
                queue.add(current.left);
            }
            i++;

            if (i < levelOrder.length && levelOrder[i] != null) {
                current.right = new TreeNode(levelOrder[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}

