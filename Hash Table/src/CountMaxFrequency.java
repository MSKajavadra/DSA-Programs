import java.util.HashMap;
import java.util.Map;

public class CountMaxFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,2,1,6,3,7,8,7};

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int max=0;
        int key=0;
        for (Map.Entry<Integer,Integer> e:map.entrySet()) {
            if(e.getValue() > max){
                max=e.getValue();
                key=e.getKey();
            }
        }
        System.out.println("Most Frequented Value: " + key);
    }
}
