package java_questions_solved;

public class triangle_pattern {
    public static void main(String[] args) {
        triangle(5,1);
    }
    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.println("*");
            triangle(r,c+1);
        }
        else {
            System.out.println();
            triangle(r-1,c);
        }
    }
}
