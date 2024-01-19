import java.util.Stack;

public class Min_Stack_Using_Single_Stack {
    static int min = Integer.MAX_VALUE;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        push(10);
        push(9);
        //pop();
        push(45);
        push(5);
        pop();
        System.out.println(getMin());
    }
    public static void push(int val) {
        if(val <= min){
            stack.add(min);
            min = val;
        }
        stack.add(val);
    }

    public static void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }
     public static int getMin() {
        return min;
    }
}