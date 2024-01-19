import java.util.Scanner;

public class Find_Min_Using_Stack {
    public static void main(String[] args) {
        int[] stack=new int[10];
        int[] minStack=new int[10];
        int top=-1;
        int minTop=-1;

        Scanner sc=new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n" +
                    "0.Exit\n" +
                    "1.push\n" +
                    "2.pop\n" +
                    "3.min");
            System.out.print("Enter Choice: ");
            ch=sc.nextInt();

            switch (ch){
                case 0:
                    break;
                case 1:
                    System.out.print("\nEnter Value: ");
                    int value=sc.nextInt();
                    top=push(stack,top,value);
                    if(minTop==-1 || peek(minStack,minTop) > value){
                        minTop=push(minStack,minTop,value);
                    }
                    break;
                case 2:
                    if(minTop!=-1 && peek(minStack,minTop)==peek(stack,top)){
                        minTop=pop(minTop);
                    }
                    top=pop(top);
                    break;
                case 3:
                    if(minTop == -1){
                        System.out.println("Stack is empty..!!");
                        break;
                    }
                    minInStack(minStack,minTop);
                    break;
                default:
                    System.out.println("Wrong choice..!!");
            }
        }while (ch != 0);
    }

    public static void minInStack(int[] minStack,int minTop){
        System.out.println(minStack[minTop]);
    }
    public static int peek(int stack[],int top){
        return stack[top];
    }
    public static int push(int[] stack,int top,int value){
        stack[++top]=value;
        return top;
    }
    public static int pop(int top){
        return --top;
    }
}
