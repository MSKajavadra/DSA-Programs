import java.util.LinkedList;
import java.util.Queue;

public class Build_Tree {
    static class BinaryTree{
        static int idx=-1;
        public static TreeNode buildTree(int[] nodes){   //preorder tree
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = BinaryTree.buildTree(nodes);
//        preorder(root);
//        inorder(root);
//        postorder(root);
        levelOrder(root);
    }

    private static void levelOrder(TreeNode root) {
        if(root==null){
            return;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            TreeNode currNode=queue.remove();
            if(currNode==null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }else {
                    queue.add(null);
                }
            }else {
                System.out.print(currNode.val + " ");
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }
    }

    private static void postorder(TreeNode root) {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
