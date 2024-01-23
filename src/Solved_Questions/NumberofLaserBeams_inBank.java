package Solved_Questions;

public class NumberofLaserBeams_inBank {
    public static void main(String[] args) {
        String[] num={"011001","000000","010100","001000"};
        Solution13 sol=new Solution13();
        System.out.println(sol.numberOfBeams(num));
    }
}
class Solution13 {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int ans = 0;
        for(String str : bank) {
            int curr = 0;
            for(char ch : str.toCharArray()) {
                if(ch=='1') {
                    curr++;
                }
            }
            if(curr > 0) {
                ans += prev * curr;
                prev = curr;
            }
        }
        return ans;
    }
}
