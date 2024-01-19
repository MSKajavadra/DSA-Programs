//30-12-2022
//Print frequency of all the characters in string.
public class Frequency_of_Char_in_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        int[] arr=new int[128];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            int assci=(char)s.charAt(i);
            arr[assci]+=1;
        }
        for(int i=0;i<128;i++){
            if(arr[i] > 0){
                System.out.println((char)i +":"+arr[i]);
            }
        }
//        int n=s.length();
//        for (int i=0;i<n;i++) {
//            if (s.charAt(i) != ' ') {
//
//                int count = 1;
//
//                for (int j = i + 1; j < n; j++) {
//                    if (s.charAt(i) == s.charAt(j)) {
//                        count++;
//                    }
//                }
//                int k = i + 1;
//                while (k<n) {
//                    if(s.charAt(i) == s.charAt(k)) {
//                        char[] arr = s.toCharArray();
//                        arr[k] = ' ';
//                        s = new String(arr);
//                    }
//                    k++;
//                }
//                System.out.println(s.charAt(i) + ":" + count);
//            }
//        }
    }
}
