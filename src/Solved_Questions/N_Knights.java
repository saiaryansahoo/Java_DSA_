package Solved_Questions;

public class N_Knights {
    public static void main(String[] args) {

    }
    static void knight(int[][] board, int row, int col, int knights){
        if(knights==0){
            display(board);
        }
        private static void display(boolean[][] board) {
            for (boolean[] row : board) {
                for (boolean element : row) {
                    if (element) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
        }
    }
}
