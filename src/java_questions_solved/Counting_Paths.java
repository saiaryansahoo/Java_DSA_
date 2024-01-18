package java_questions_solved;

public class Counting_Paths {
    public static void main(String[] args) {
        System.out.println(countpaths(3,4));
    }
    static int countpaths(int row, int column){
        if(row==1||column==1){
            return 1;
        }

        int left=countpaths(row-1, column);
        int right=countpaths(row, column-1);
        return left+right;
    }
}
