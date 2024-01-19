public class Sum_of_First_N_Numbers {
    public static void main(String[] args) {
        int n=5;
        totalSum(1,n,0);
    }

    private static void totalSum(int i,int n,int sum) {
        if(n==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        totalSum(i+1,n,sum);
//        System.out.println(i);
    }
}
