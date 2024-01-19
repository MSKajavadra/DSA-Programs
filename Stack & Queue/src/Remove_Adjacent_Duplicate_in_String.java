import java.util.Stack;

public class Remove_Adjacent_Duplicate_in_String {
    public static void main(String[] args) {
        String str="abbaca";
        String newStr="";

        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            }else if(stack.peek()==str.charAt(i)){
                stack.pop();
            }else {
                stack.push(str.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            newStr=stack.pop()+newStr;
        }
        System.out.println(newStr);
    }
}
