//30-12-2022
// Check if a String is Palindrome?
public class Palindrome_String {
    public static void main(String[] args) {
        String s = "ABCDCBA";
        char[] arr = s.toCharArray();
        int i=0;
        int j = arr.length - 1;
        while (i<j){
            if(arr[i] != arr[j]){
                System.out.println("String is Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is Palindrome");
    }
}
