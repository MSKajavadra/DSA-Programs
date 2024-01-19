//13-12-2022
//In bubble sort algorithm, array is traversed from first element to last element.
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int n=3;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("\nEnter Value for arr[" + i + "]: ");
            arr[i]= sc.nextInt();
        }

        //Sorting From Starting of Array
//        for (int i=0;i<n-1;i++){
//            for (int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

        //Sorting From Ending of Array
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("\nAfter Sorting Array:");
        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
