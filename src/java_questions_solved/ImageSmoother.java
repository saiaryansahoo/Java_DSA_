package java_questions_solved;

import java.util.Arrays;


public class ImageSmoother {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[][] res = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] smoothed = sol.imageSmoother(res);

        for (int[] row : smoothed) {
            System.out.println(Arrays.toString(row));
        }
    }
}
class Solution8 {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m=img[0].length;
        int[][] res = new int[n][m];
        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                res[r][c] = smoother(img, r, c);
            }
        }
        return res;
    }

    private int smoother(int[][] img, int row, int col){
        int sum = img[row][col];
        int div = 1;
        if(row>0){
            sum += img[row-1][col];
            div++;
        }
        if(col<img[0].length-1){
            sum += img[row][col+1];
            div++;
        }
        if(col>0){
            sum += img[row][col-1];
            div++;
        }
        if(row<img.length-1){
            sum += img[row+1][col];
            div++;
        }
        if(row>0 && col<img[0].length-1){
            sum += img[row-1][col+1];
            div++;
        }
        if(row>0 && col>0){
            sum += img[row-1][col-1];
            div++;
        }
        if(row<img.length-1 && col>0){
            sum += img[row+1][col-1];
            div++;
        }
        if(row<img.length-1 && col<img[0].length-1){
            sum += img[row+1][col+1];
            div++;
        }
        return sum/div;
    }
}