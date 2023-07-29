package java_questions_solved;

import java.util.Stack;

public class EvaluatereversePolishNotation {
    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    static int evalRPN(String[] tokens){
        Stack<Integer> stack= new Stack<>();
        int val1, val2;
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    val1=stack.pop();
                    val2=stack.pop();
                    stack.push(val2-val1);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case"/":
                    val1=stack.pop();
                    val2=stack.pop();
                    stack.push(val2/val1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
