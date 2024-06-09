package Solved_Questions;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
//        write driver code for testcases
        Scanner sc=new Scanner(System.in);
        String postfix="534*+";

        System.out.println(expresssion(postfix.toString());
    }
    public static int expresssion(String postfix){
        Stack<Integer> s=new Stack<>();
        int val1,val2;
        for (int i = 0; i < postfix.length(); i++) {
            char ch=postfix.charAt(i);
            if(Character.isDigit(ch)){
                s.push(ch - '0');
            }else{
                val1=s.pop();
                val2=s.pop();
                switch (ch) {
                    case '+':
                        s.push(val1 + val2);
                        break;
                    case '-':
                        s.push(val2 - val1);
                        break;
                    case '*':
                        s.push(val1 * val2);
                        break;
                    case '/':
                        s.push(val2 / val1);
                        break;
                }
            }
        }
        return s.pop();
    }
}
