public class SubSequences_of_String {
    public static void main(String[] args) {
        String str="abc";
        subSequences(str,0,"");
    }
    public static void subSequences(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);  //in Unique subsequence we can use HashSet to print unique value
            return;
        }

        subSequences(str,idx+1,newString+str.charAt(idx));
        subSequences(str,idx+1,newString);
    }
}
