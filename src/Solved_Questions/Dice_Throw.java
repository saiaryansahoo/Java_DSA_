package Solved_Questions;

public class Dice_Throw {
    public static void main(String[] args) {
        dice("",7);
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p+1,target-1);
        }
    }
}