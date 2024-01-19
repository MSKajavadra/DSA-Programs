public class sumOfNodes {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = Build_Tree.BinaryTree.buildTree(nodes);
        System.out.println(sumNodes(root));
    }
    public static int sumNodes(TreeNode root){
        if (root==null){
            return 0;
        }

        return sumNodes(root.left)+sumNodes(root.right)+root.val;
    }
}
