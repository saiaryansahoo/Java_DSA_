package Solved_Questions;

public class SumofProducts {

}
class sum {
    static long pairAndSum(int n, long arr[]) {
        long sum = 0;
        for (int i = 0; i < 32; i++) {
            long count = 0;
            for (long j : arr) {
                if ((j & (1L << i)) != 0) {
                    count++;
                }
            }
            sum += count * (count - 1) / 2 * (1L << i);
        }
        return sum;
    }
}
