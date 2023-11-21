package java_questions_solved;

public class sliding_subarray_beauty {
    public static void main(String[] args) {
        class Solution {
            public int[] getSubarrayBeauty(int[] nums, int k, int x) {
                int n = nums.length;
                int[] rslt = new int[n-k+1];

                int[] bucket = new int[101];

                for(int i = 0; i < k; i++){
                    int elem = nums[i];
                    int bktidx = elem + 50;
                    bucket[bktidx]++;
                }

                rslt[0] = getBucket(bucket, x);
                for(int i = k; i < n; i++){
                    int outgoing = nums[i-k];
                    int outbktidx = outgoing + 50;
                    bucket[outbktidx]--;

                    int incoming = nums[i];
                    int inxbktidx = incoming + 50;
                    bucket[inxbktidx]++;

                    rslt[i-k+1] = getBucket(bucket, x);
                }
                return rslt;
            }
            private int getBucket(int[] bucket, int x){
                int cnt = 0;
                for(int i = 0; i < bucket.length; i++){
                    int frqi = bucket[i];
                    if (cnt + frqi >= x){
                        return Math.min(0, i-50);
                    }
                    cnt += frqi;
                }
                return 0;
            }
        }
    }
}
