//12-12-2022
//Store Array in Reverse Order.
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args){
        int[] arr=new int[5];
        int n=5;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Enter:");
            arr[i]= sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++; j--;
        }
        System.out.println();
        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
