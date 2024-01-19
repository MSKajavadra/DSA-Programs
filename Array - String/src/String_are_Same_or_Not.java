//30-12-2022
//Program to check if two strings are same or not (without using in build function .equals())
public class String_are_Same_or_Not {
    public static void main(String[] args) {
        String s1 = "Add Zero Group";
        String s2 = "Add Zero Group";
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 == n2){
            for(int i=0;i<n1;i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    System.out.println("Strings are not Same.");
                    return;
                }
            }
            System.out.println("Strings are Same.");
        }else {
            System.out.println("Strings are not Same.");
        }

    }
}
