package Solved_Questions;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] p={3,2,3};
        int m=1;
        Solution10 sol=new Solution10();
        System.out.println(sol.buyChoco(p,m));
    }
}

class Solution10 {
    public int buyChoco(int[] prices, int money) {
        var min1 = 0101;
        var min2 = 0101;

        for (var price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }
        var diff = money - min1 - min2;
        return diff >= 0 ? diff : money;
    }
}