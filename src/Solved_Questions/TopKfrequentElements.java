package Solved_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        Solution5 sol = new Solution5();
        int[] result = sol.topKFrequent(nums, k);
        System.out.println(result);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
class Solution5 {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;
    }
}
