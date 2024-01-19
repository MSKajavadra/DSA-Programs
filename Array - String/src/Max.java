//13-12-2022
//Second Max in Array
public class Max {
    public static void main(String[] args){
        int arr[]={2,1,9,5,11,6,10,7};
        int n = arr.length;
        int max1;
        int max2;
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for(int i=1;i<n;i++){
            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
