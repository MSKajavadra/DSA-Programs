import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal_of_Tree {
    public static void main(String[] args) {
        BTree bt = new BTree();
        bt.root = new Node(10);
        bt.root.l = new Node(20);
        bt.root.r = new Node(30);
        bt.root.l.l = new Node(40);
        bt.root.l.r = new Node(50);
        bt.root.r.l = new Node(60);
        bt.root.r.r = new Node(70);



        System.out.print("Level Order Traversal : ");
        bt.levelOrderTraversal();
        System.out.println();
        System.out.print("In Order Traversal : ");
        bt.inOrderTraversal(bt.root);
        System.out.println();
        System.out.print("Pre Order Traversal : ");
        bt.preOrderTraversal(bt.root);
        System.out.println();
        System.out.print("Post Order Traversal : ");
        bt.postOrderTraversal(bt.root);
        System.out.println();
        System.out.print("Spiral Level Order : ");
        bt.SpiralLevelOrder();
        System.out.println();
        System.out.println("Max Depth Or Height : " + bt.maxDepthOrHeight(bt.root));
        System.out.println("Min Depth Or Height : " + bt.minDepthOrHeight(bt.root));
    }
}
class BTree{
    Node root;

    public void levelOrderTraversal() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node n = queue.poll();
            System.out.print(n.data+" ");
            if (n.l != null){
                queue.add(n.l);
            }
            if (n.r != null){
                queue.add(n.r);
            }
        }
    }

    public void inOrderTraversal(Node root){
        if (root == null)   return;
        inOrderTraversal(root.l);
        System.out.print(root.data+" ");
        inOrderTraversal(root.r);
    }

    public void preOrderTraversal(Node root){
        if (root == null)   return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.l);
        preOrderTraversal(root.r);
    }

    public void postOrderTraversal(Node root){
        if (root == null)   return;
        postOrderTraversal(root.l);
        postOrderTraversal(root.r);
        System.out.print(root.data+" ");
    }


    public void SpiralLevelOrder() {
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean isRev = false;
        while (!queue.isEmpty()){
            int n = queue.size();
            if (!isRev){
                while (n-- > 0){
                    Node node = queue.getFirst();
                    System.out.print(node.data+" ");
                    if (node.l != null) queue.addLast(node.l);
                    if (node.r != null) queue.addLast(node.r);
                    queue.removeFirst();
                }
            }else {
                while (n-- > 0){
                    Node node = queue.getLast();
                    System.out.print(node.data+" ");
                    if (node.r != null) queue.addFirst(node.r);
                    if (node.l != null) queue.addFirst(node.l);
                    queue.removeLast();
                }
            }
//            System.out.println();
            isRev = !isRev;
        }
    }


    public int maxDepthOrHeight(Node root) {
        if (root == null){
            return 0;
        }else {
            int lH = maxDepthOrHeight(root.l);
            int rH = maxDepthOrHeight(root.r);
            if (lH > rH){
                return 1+lH;
            }else {
                return 1+rH;
            }
        }
    }

    public int minDepthOrHeight(Node root) {
        if (root == null){
            return 0;
        }else {
            int lH = minDepthOrHeight(root.l);
            int rH = minDepthOrHeight(root.r);
            if (lH > rH){
                if (rH == 0)    return 1+lH;
                return 1+rH;
            }else {
                if (lH == 0)    return 1+rH;
                return 1+lH;
            }
        }
    }


}
class Node{
    int data;
    Node l,r;
    Node(int data){
        this.data = data;
    }
}
