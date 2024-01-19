//13-01-2023
//Given an array,left rotate by d positions
public class Array_Left_Rotate_by_d_Positions {
    public static void main(String[] args) {
        int[] arr={3,6,8,9};
        int n=arr.length;
        int d=5;
        d=d%n;
        for(int i=0;i<d;i++){
            int temp=arr[0];
            int j=0;
            while(j<n-1){
                arr[j]=arr[j+1];
                j++;
            }
            arr[n-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
