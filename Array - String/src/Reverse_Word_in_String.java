//30-12-2022
// Reverse Words in a String
public class Reverse_Word_in_String {
    public static void main(String[] args) {
        String s="Add Zero Group";
        char[] arr = s.toCharArray();
        int n= arr.length;
        int left=0,right=0;
        for(int i=0;i<n;i++){
            if(arr[i]==' '){
                right=i-1;
                reverse(arr,left,right);
                left=i+1;
            }
        }
        right= n-1;
        reverse(arr,left,right);
        s=new String(arr);
        System.out.println(s);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

}
