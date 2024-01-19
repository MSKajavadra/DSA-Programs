public class Array_Sorted_or_Not {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int idx) {
        if(idx== arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            //array is sorted till now
            return isSorted(arr,idx+1);
        }else {
            return false;
        }
    }
}
