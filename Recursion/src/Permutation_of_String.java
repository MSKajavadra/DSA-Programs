public class Permutation_of_String {
    public static void main(String[] args) {
        String str="abc";
        printPermutations(str,"");
    }
    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newString= str.substring(0,i) + str.substring(i+1);
            printPermutations(newString,permutation+str.charAt(i));
        }
    }
}
