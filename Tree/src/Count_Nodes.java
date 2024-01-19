public class Count_Nodes {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = Build_Tree.BinaryTree.buildTree(nodes);
        System.out.println(countOfNodes(root));
    }

    public static int countOfNodes(TreeNode root){
        if(root==null){
            return 0;
        }

        return countOfNodes(root.left) + countOfNodes(root.right) + 1;
    }
}
