//30-12-2022
// Count number of words in a String
public class Number_of_word_in_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        if(s.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        s=s.trim();
        int n = s.length() - 1;
        int count = 0;
        int i=0;
        while(i<n){
            if (s.charAt(i) == ' ') {
                count++;
                while(s.charAt(i) == ' '){
                    i++;
                }
            }
            i++;
        }
        count++;
        System.out.println(count);
    }
}
