//15-12-2022
//Find Duplicate number from 1 to n numbers.
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n= sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            System.out.print("Enter:");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum += arr[i];
        }
        sum -= (n*(n+1))/2;
        System.out.println("Duplicate Value is:" + sum);
    }
}

