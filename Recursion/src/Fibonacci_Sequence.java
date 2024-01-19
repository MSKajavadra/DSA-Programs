public class Fibonacci_Sequence {
    public static void main(String[] args) {
        int n=7;
        int a=0,b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        fibonacci(a,b,n-2);
    }

    private static void fibonacci(int a, int b, int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c + " ");
        fibonacci(b,c,n-1);
    }
}
