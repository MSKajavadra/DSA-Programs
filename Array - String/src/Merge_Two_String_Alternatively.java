//03-01-2023
//Merge Strings Alternatively
public class Merge_Two_String_Alternatively {
    public static void main(String[] args) {
        String str1="AdZr ru";
        String str2="d eoGop";
        String str="";
        int n1=str1.length();
        int n2=str2.length();
        if(n1 != n2){
            System.out.println("String's Length are Different");
            return;
        }
        for(int i=0;i<n1;i++){
            str=str+str1.charAt(i)+str2.charAt(i);
        }
        System.out.println(str);
    }
}
