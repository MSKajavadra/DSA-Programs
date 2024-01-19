//03-01-2023 (Tuesday)
// Remove duplicate chars from string
public class Remove_Dup_Char_from_String {
    public static void main(String[] args) {
        String s = "Add Zero Group";
        String str = "";

        int[] arr=new int[123];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                str+=s.charAt(i);
                continue;
            }
            int ascii=(int) s.charAt(i);
            if(arr[ascii] > 0){
                continue;
            }else{
                arr[ascii]+=1;
                str+=s.charAt(i);
            }
        }

//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                if(str.charAt(str.length()-1) != ' ') {
//                    str += s.charAt(i);
//                }
//                continue;
//            }
//            boolean flag=false;
//            for(int j=0;j<i;j++){
//                if(s.charAt(i) == s.charAt(j)){
//                    flag=true;
//                }
//            }
//            if(!flag){
//                str+=s.charAt(i);
//            }
//        }
        System.out.println(str);
    }
}
