import java.util.Stack;

public class Reverse_Number {
    public static void main(String[] args) {
        int num=12345;
        Stack<Integer> stack=new Stack<>();
        while (num!=0){
            stack.push(num%10);
            num/=10;
        }

        int i=1;
        while (!stack.isEmpty()){
            num=(stack.pop()*i)+num;
            i*=10;
        }

        System.out.println(num);
    }
}
