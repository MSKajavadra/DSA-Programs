import java.util.HashSet;

public class Array_Equal {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,5,4,3};

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        if(set1.equals(set2)){
            System.out.println("Array is Equals");
        }else {
            System.out.println("Array is Not Equals");
        }
    }
}
