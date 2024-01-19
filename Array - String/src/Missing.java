//12-12-2022
// missing from 1 to n numbers.
import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n-1;i++){
            System.out.print("Enter:");
            arr[i]=sc.nextInt();
        }
        int sum=(n*(n+1))/2;
        for (int i = 0; i < n-1; i++) {
            sum-=arr[i];
        }
        System.out.println(sum);
    }
}
