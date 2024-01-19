public class Diameter_of_Tree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(6);

        System.out.println(diameter(root));
    }

    public static int diameter(TreeNode root){  // o(n^2)
        if(root==null){
            return 0;
        }

        int dim1=diameter(root.left);
        int dim2=diameter(root.right);
        int dim3=Height_of_Tree.height(root.left) + Height_of_Tree.height(root.right) + 1;

        return Math.max(dim3,Math.max(dim1,dim2));
    }
}
