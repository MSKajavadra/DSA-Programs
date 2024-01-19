//23-12-2022 (Friday)
//Find Highest Sum of any SubArray of Array of Positive and Negative Values.
public class Highest_Sum_of_SubArray {
    public static void main(String[] args) {
        int arr[] = {7,-5,8,-1,6,9,-3,2};
        int n = arr.length;
        int Max=0;
        int MaxTillNow=0;
        for (int i=0;i<n;i++){
            MaxTillNow = MaxTillNow + arr[i];
            if(MaxTillNow > Max){
                Max = MaxTillNow;
            }
            if(MaxTillNow < 0){
                MaxTillNow=0;
            }
        }
        System.out.print("Highest Sum of SubArray: " + Max);
    }
}
