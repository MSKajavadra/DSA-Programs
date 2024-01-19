//15-12-2022
public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int i=0,mid,value=30;
        int n = arr.length;
        int j = n -1;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid] > value){
                j=mid-1;
            } else if (arr[mid] < value) {
                i=mid+1;
            }
            else {
                System.out.println(value + " is Found");
                return;
            }
        }
        System.out.println(value + " is Not Found");
    }
}