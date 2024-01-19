import java.util.HashSet;
public class Duplicate_in_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,3,2,1};

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                ans.add(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }

        System.out.println(ans);
    }
}
