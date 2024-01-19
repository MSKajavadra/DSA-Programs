//13-12-2022 (Wednesday)
//Sorting by selecting Min or Max value from Array and swap to starting pointer.
//In selection sort algorithm, we search for the lowest element and arrange it to the proper location.
public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = {20,30,10,50,40};
        int n = arr.length;
        System.out.println("Before Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("\n\nAfter Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
