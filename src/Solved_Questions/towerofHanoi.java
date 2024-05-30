package Solved_Questions;

public class towerofHanoi {
    public static void main(String[] args) {
        int totalMoves =totalWays(3, "S", "H", "D");
        System.out.println("Totals Moves = " + totalMoves);
    }
    public static int totalWays(int n, String s, String h, String d){
        if(n==1){
            System.out.println("Move disk " + n + " from " + s + " to " + d);
            return 1;
        }else {
            int first = totalWays(n - 1, s, d, h);
            System.out.println("Move disk " + n + " from " + s + " to " + d);
            int second = 1;
            int third = totalWays(n - 1, h, s, d);

            return first+second+third;
        }
    }
}
