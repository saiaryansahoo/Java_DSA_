package Solved_Questions;

import java.util.Arrays;
import java.util.TreeMap;

public class MaximumProfit_InJobScheduling {
    public static void main(String[] args) {
        int[] start={1,2,3,4,6};
        int[] end={3,5,10,6,9};
        int[] profit={20,20,100,70,60};
        Solution17 sol=new Solution17();
        System.out.println(sol.jobScheduling(start,end,profit));
    }
}
class Solution17 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;

        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a.end, b.end));

        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);

        for (Job job : jobs) {
            Integer prevJobEnd = dp.floorKey(job.start);

            int newProfit = dp.get(prevJobEnd) + job.profit;

            int maxProfit = Math.max(newProfit, dp.lastEntry().getValue());
            dp.put(job.end, maxProfit);
        }

        return dp.lastEntry().getValue();
    }
}

class Job {
    int start;
    int end;
    int profit;

    public Job(int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}