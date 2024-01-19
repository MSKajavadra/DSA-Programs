import java.util.Scanner;
import java.util.Stack;

public class Queue_using_Stack_by_Collection_Framework {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int ch=0;
        do {
            System.out.print("\n0.Exit  \n1.insert (at last) \n2.delete (at first) \n3.display \nEnter your choice:");
            ch=new Scanner(System.in).nextInt();

            switch (ch){
                case 0:
                    break;
                case 1:
                    insert(stack);
                    break;
                case 2:
                    delete(stack);
                    break;
                case 3:
                    display(stack);
                    break;
                default:
                    System.out.println("\nWrong choice..!!");
            }
        }while (ch != 0);
    }

    private static void delete(Stack<Integer> stack) {
        int n=stack.size();
        if (n==0){
            System.out.println("Queue is Empty..!!");
            return;
        }
        Stack<Integer> stack2 = new Stack<>();
        for (int i=0;i<n-1;i++){
            stack2.push(stack.pop());
        }
        stack.pop();
        n=stack2.size();
        for (int i=0;i<n;i++){
            stack.add(stack2.pop());
        }
        display(stack);
    }

    private static void display(Stack<Integer> stack) {
        System.out.println(stack);
    }

    private static void insert(Stack<Integer> stack) {
        System.out.print("\nEnter value: ");
        int val=new Scanner(System.in).nextInt();
        stack.push(val);
    }
}
