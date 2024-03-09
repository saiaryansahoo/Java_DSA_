package HashSetAndMap.Questions;

import java.util.HashMap;

public class SubArraySumEqualK {
    public static void main(String[] args) {
        int[] arr={1,4,8,13};
        int k=5;

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int length= arr.length;
        int ans=0;
        int sum=0;
        for (int j = 0; j < length; j++) {
            sum += arr[j];

            if(map.containsKey(sum-k)){
                ans +=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        System.out.print(ans);
    }
}
