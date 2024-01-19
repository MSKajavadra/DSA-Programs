//30-12-2022
//Update a character in a string (without using updateAt() function)
public class Update_Char_in_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        s = update(s,'d','t');
        System.out.println(s);
    }

    private static String update(String s, char old, char new1) {
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == old){
                arr[i] = new1;
            }
        }
        s =new String(arr);
        return s;
    }
}
