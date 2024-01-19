import java.util.HashSet;
import java.util.Set;

public class PairOfSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int sum=13;

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int toCheck=sum-arr[i];
            if(set.contains(toCheck)){
                System.out.println("Pair is present");
                return;
            }else {
                set.add(arr[i]);
            }
        }
        System.out.println("Not Present");
    }
}
