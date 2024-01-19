//23-12-2022
//Merge two sorted Array as Sorted.
public class Merge_2_Sorted_Array {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,6,10};
        int arr2[] = {2,5,7,8,9,11,12};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int n = n1 + n2;
        int arr[] = new int[n];
        int i=0,j=0,k=0;

        while (i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }else {
                arr[k++] = arr2[j++];
            }
        }
        while (i<n1){
            arr[k++] = arr1[i++];
        }
        while(j<n2){
            arr[k++] = arr2[j++];
        }

        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
