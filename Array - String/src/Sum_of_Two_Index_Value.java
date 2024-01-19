//13-12-2022
import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Two_Index_Value {
    public static void main(String[] args){
        int n=5;
        int arr[] = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("\nEnter arr["+ i +"]:");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int l=0,k=n-1;
        while(l<k){
            if((arr[l]+arr[k]) == 12){
                System.out.println("True at position of arr["+l+"] and arr["+k+"]");
                return;
            }
            else if ((arr[l]+arr[k]) > 12) {
                k--;
            }
            else
                l++;
        }
        System.out.println("False");
    }
}
