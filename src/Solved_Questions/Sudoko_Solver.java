package Solved_Questions;

public class Sudoko_Solver {
    public static void main(String[] args) {
        int [][]board=new int[][]{
                {3,2,0,0,4,5,0,8,9},
                {0,0,0,3,1,4,6,7,5},
                {0,0,0,6,2,1,0,4,8},
                {0,0,0,7,2,3,0,0,0},
                {0,2,0,0,4,5,0,8,0},
                {0,0,0,6,2,1,0,4,8},
                {0,0,0,7,2,3,0,0,0},
                {0,0,0,3,1,4,6,7,5},
                {0,0,0,7,2,3,0,0,0}
        };
        System.out.println(solve(board));
    }

    static boolean solve(int[][]board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft==false) {
                break;
            }
        }
        if (emptyLeft == true) {
            return true;
        }

        for (int number = 1; number <=9; number++) {
            if(isSafe(board,row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    display(board);
                    return true;
                }
                else{
                    board[row][col] = 0;                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for(int[]row :board){
            for(int num:row){
                System.out.println(num+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int column, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][column] == num) {
                return false;
            }
            for (int[] nums : board) {
                if (nums[column] == num) {
                    return false;
                }
            }
            int sqrt = (int) (Math.sqrt(board.length));
            int rowStart = row - row % sqrt;
            int colStart = column - column % sqrt;

            for (int r = rowStart; r < rowStart + sqrt; r++) {
                for (int c = colStart; c < colStart + sqrt; c++) {
                    if (board[r][c] == num) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
