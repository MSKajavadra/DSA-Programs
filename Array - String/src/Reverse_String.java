//30-12-2022
//Reverse a String
public class Reverse_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        char[] arr = s.toCharArray();
        int i=0;
        int j = arr.length - 1;
        while (i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        s = new String(arr);
        System.out.println(s);
   }
}
