public class Height_of_Tree {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = Build_Tree.BinaryTree.buildTree(nodes);
        System.out.println(height(root));
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight= height(root.left);
        int rightHeight= height(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }
}
