package Solved_Questions;

public class ZigzagConversion {
    public static void main(String[] args) {
        Solution4 res=new Solution4();
        String s="PAYPALISHIRING";
        int row=3;
        System.out.println(res.convert(s,row));
    }
}
class Solution4 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int n = s.length(), incr = 2*(numRows-1), ind = 0, zig = incr;
        char ch[] = new char[n];

        for(int i = 0; i<numRows; i++) {
            for(int j = i; j<s.length(); j += incr) {
                ch[ind++] = s.charAt(j);
                if(i != 0 && i != numRows-1 && j + zig < s.length())
                    ch[ind++] = s.charAt(j + zig);
            }
            zig-=2;
        }

        return new String(ch);

    }
}