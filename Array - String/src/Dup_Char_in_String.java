//30-12-2022
//Find duplicate chars from string
public class Dup_Char_in_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        int[] arr=new int[128];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            int ascii=(int)s.charAt(i);
            if(arr[ascii] == 1){
                System.out.print(s.charAt(i)+ " ");
                arr[ascii]=arr[ascii]+1;
            }else {
                arr[ascii]=arr[ascii]+1;
            }
        }


//        int n = s.length();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if ((s.charAt(i) == s.charAt(j)) && (s.charAt(i) != ' ')) {
//                    System.out.print(s.charAt(i) + " ");
//                    s = s.replace(s.charAt(i), ' ');
//                }
//            }
//        }
    }
}

