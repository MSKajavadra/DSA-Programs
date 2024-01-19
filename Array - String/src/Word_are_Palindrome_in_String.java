//30-12-2022
//Check if all words are palindrome
public class Word_are_Palindrome_in_String {
    public static void main(String[] args) {
        String s="abcba efgfe";
        int left=0,right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                right=i-1;
                if(!check(s,left,right)){
                    System.out.println("Words of String is Not Palindrom");
                    return;
                }
                left=i+1;
            }
        }
        right=s.length()-1;
        if(!check(s,left,right)){
            System.out.println("Words of String is Not Palindrom");
            return;
        }
        System.out.println("Words of String is Palindrom");
    }

    private static boolean check(String s, int left, int right) {
        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
