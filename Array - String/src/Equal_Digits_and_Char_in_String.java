//03-01-2023
// Check if string have equal digits and chars
public class Equal_Digits_and_Char_in_String {
    public static void main(String[] args) {
        String s = "A1b2c3d4e5";
        int n=s.length();
        int num=0,chars=0;
        for(int i=0;i<n;i++){
            if((s.charAt(i)=='0') || (s.charAt(i)=='1') || (s.charAt(i)=='2') || (s.charAt(i)=='3') || (s.charAt(i)=='4') || (s.charAt(i)=='5')
                    || (s.charAt(i)=='6') || (s.charAt(i)=='7') || (s.charAt(i)=='8') || (s.charAt(i)=='9')){
                num++;
            }else if (s.charAt(i) != ' '){
                chars++;
            }
        }
        if(num==chars){
            System.out.println("String have Equal Digits and Chars");
        }
        else {
            System.out.println("String have Not Equal Digits and Chars");
        }
    }
}
