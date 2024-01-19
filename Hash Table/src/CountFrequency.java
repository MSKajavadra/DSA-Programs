import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,2,1,6,3,7,8};

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ":=>" + e.getValue());
        }
    }
}
