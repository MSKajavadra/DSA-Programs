import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
    public static String decodeString(String s) {
        Stack<String> stack=new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='['){
                String str="";
                while(!stack.peek().equals("]")){
                    str+=stack.pop();
                }
                stack.pop();
                stack.push(str);
            }else{
                stack.push(s.charAt(i)+"");
            }

            if((i==0 || s.charAt(i-1)<'0' || s.charAt(i-1)>'9') && (s.charAt(i)>='0' && s.charAt(i)<='9')){
                String str="";

                while(stack.peek().equals("0") || stack.peek().equals("1") || stack.peek().equals("2") || stack.peek().equals("3") || stack.peek().equals("4") || stack.peek().equals("5") || stack.peek().equals("6") || stack.peek().equals("7") || stack.peek().equals("8") || stack.peek().equals("9")){
                    str+=stack.pop();
                }
                String pop=stack.pop();
                int num=Integer.parseInt(str);
                str="";
                for(int j=0;j<num;j++){
                    str+=pop;
                }
                stack.push(str);
            }
        }

        String str="";
        while(!stack.isEmpty()){
            str+=stack.pop();
        }
        return str;
    }
}
