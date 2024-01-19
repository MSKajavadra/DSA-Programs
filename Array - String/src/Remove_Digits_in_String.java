//02-01-2023
//Remove All Digits in String
public class Remove_Digits_in_String {
    public static void main(String[] args) {
        String s = "Ad8d Z6er4o G9r0ou1p0";
        s = s.trim();
        int n=s.length();
        String newStr = "";
        for(int i=0;i<n;i++){
            if((s.charAt(i)=='0') || (s.charAt(i)=='1') || (s.charAt(i)=='2') || (s.charAt(i)=='3') || (s.charAt(i)=='4') || (s.charAt(i)=='5')
                    || (s.charAt(i)=='6') || (s.charAt(i)=='7') || (s.charAt(i)=='8') || (s.charAt(i)=='9')){
                continue;
            }else {
                newStr= newStr + s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
