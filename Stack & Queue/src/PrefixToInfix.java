public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix="+*AB*CD";
        int n=prefix.length();
        String[] stack=new String[n];
        int top=-1;
        for(int i=n-1;i>=0;i--){
            char c=prefix.charAt(i);
            if(isChar(c)){
                top=push(stack,top,c+""); //String.valueOf(c)
            }else {
                String l=peek(stack,top);
                top=pop(top);
                String r=peek(stack,top);
                top=pop(top);

                top=push(stack,top,l+c+r);
            }
        }
        System.out.println(peek(stack,top));
   }
    public static String peek(String stack[],int top){
        return stack[top];
    }
    public static int push(String[] stack,int top,String value){
        stack[++top]=value;
        return top;
    }
    public static int pop(int top){
        return --top;
    }
    private static boolean isChar(char c){
        if (c >= 'a' && c <= 'z' ||
                c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }
}
