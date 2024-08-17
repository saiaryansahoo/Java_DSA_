package Solved_Questions;

public class MaximumNumberofPointswithCost {
    public long maxPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        long[] prevRow = new long[m];
        for (int i = 0; i < m; i++) {
            prevRow[i] = points[0][i];
        }

        for (int i = 0; i < n - 1; i++) {
            long[] currRow = new long[m];
            long[] maxLeft = new long[m];
            long[] maxRight = new long[m];

            maxLeft[0] = prevRow[0];
            for (int j = 1; j < m; j++) {
                maxLeft[j] = Math.max(maxLeft[j - 1] - 1, prevRow[j]);
            }

            maxRight[m - 1] = prevRow[m - 1];
            for (int j = m - 2; j >= 0; j--) {
                maxRight[j] = Math.max(maxRight[j + 1] - 1, prevRow[j]);
            }

            for (int j = 0; j < m; j++) {
                currRow[j] = points[i + 1][j] + Math.max(maxRight[j], maxLeft[j]);
            }
            prevRow = currRow;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, prevRow[i]);
        }

        return ans;
    }
}
