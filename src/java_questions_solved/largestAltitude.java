package java_questions_solved;

public class largestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int max=0;
        int current=0;
        for (int i=0; i<gain.length;i++){
            current +=gain[i];
            max=Math.max(current,max);
        }

        return max;
    }
}
