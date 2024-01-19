import java.util.HashSet;
import java.util.Set;

public class SubsetOfArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={2,5,70};

        Set<Integer> set=new HashSet<>();
        for(int i=0;i< arr1.length;i++){
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(!set.contains(arr2[i])){
                System.out.println("Not Subset");
                return;
            }
        }
        System.out.println("Subset");
    }
}
