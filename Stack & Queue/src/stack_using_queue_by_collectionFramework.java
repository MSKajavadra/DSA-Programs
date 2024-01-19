import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stack_using_queue_by_collectionFramework {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int ch=0;
        do {
            System.out.print("\n0.Exit  \n1.insert (at last) \n2.delete (at last) \n3.display \nEnter your choice:");
            ch=new Scanner(System.in).nextInt();

            switch (ch){
                case 0:
                    break;
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("\nWrong choice..!!");
            }
        }while (ch != 0);
    }

    private static void delete(Queue<Integer> queue) {
        int n=queue.size();
        if (n==0){
            System.out.println("Stack is Empty..!!");
            return;
        }
        Queue<Integer> queue2 = new LinkedList<>();
        for (int i=0;i<n-1;i++){
            queue2.add(queue.poll());
        }
        queue.poll();
        while (!queue2.isEmpty()){
            queue.add(queue2.poll());
        }
        display(queue);
    }

    private static void display(Queue<Integer> queue) {
        System.out.println(queue);
    }

    private static void insert(Queue<Integer> queue) {
        System.out.print("\nEnter value: ");
        int val=new Scanner(System.in).nextInt();
        queue.add(val);
    }
}
