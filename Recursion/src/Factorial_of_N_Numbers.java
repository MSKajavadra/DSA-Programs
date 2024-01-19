public class Factorial_of_N_Numbers {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
