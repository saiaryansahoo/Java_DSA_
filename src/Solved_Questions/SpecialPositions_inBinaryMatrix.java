package Solved_Questions;

public class SpecialPositions_inBinaryMatrix {
    public static void main(String[] args) {
        Sol result=new Sol();
        int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(result.numSpecial(matrix));
    }
}

class Sol {
    public int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int res = 0;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1)
                    res++;

        return res;
    }
}
