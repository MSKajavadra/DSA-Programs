public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr={1,4,6,3,7,5};

        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];

        int i=low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i;
    }
}
