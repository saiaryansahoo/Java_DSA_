package Solved_Questions;

import java.util.Stack;

public class removeOuterMostParentheses {
    public static void main(String[] args) {
        String s="(()())(())(()(()))";
        System.out.println(solution(s));
    }
        public static String solution(String s) {
            Stack<Character> stack=new Stack<>();
            StringBuilder sb =new StringBuilder("");
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    if(stack.size()>0)
                        sb.append(s.charAt(i));
                    stack.push(s.charAt(i));
                }
                else{
                    stack.pop();
                    if(stack.size()>0)
                        sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        }
}
