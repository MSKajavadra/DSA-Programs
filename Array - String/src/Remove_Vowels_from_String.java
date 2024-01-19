//30-12-2022
//Remove Vowels from a String
public class Remove_Vowels_from_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        s = s.trim();
        int n=s.length();
        String newStr = "";
        for(int i=0;i<n;i++){
            if((s.charAt(i)=='A') || (s.charAt(i)=='a') || (s.charAt(i)=='E') || (s.charAt(i)=='e') ||
                    (s.charAt(i)=='I') || (s.charAt(i)=='i') || (s.charAt(i)=='O') || (s.charAt(i)=='o')
                    || (s.charAt(i)=='U') || (s.charAt(i)=='u')){
                continue;
            }else {
                newStr= newStr + s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
