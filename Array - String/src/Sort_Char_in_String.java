//30-12-2022
//Sort string of characters
public class Sort_Char_in_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        s = sort(s);
        System.out.println(s);
    }

    private static String sort(String s) {
        char[] arr = s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        s = new String(arr);
        return s;
    }
}
