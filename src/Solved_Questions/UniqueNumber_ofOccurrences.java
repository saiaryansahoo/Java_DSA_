package Solved_Questions;

public class UniqueNumber_ofOccurrences {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        Solution19 solution=new Solution19();
        System.out.println(solution.uniqueOccurrences(arr));
    }
}
class Solution19 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] numberOfOccurrences = new int[2001];
        boolean[] used = new boolean[1001];

        for (int i : arr) {
            numberOfOccurrences[1000 + i]++;
        }

        for (int i : arr) {
            int count = numberOfOccurrences[1000 + i]; // идем по исходному массиву
            numberOfOccurrences[1000 + i] = 0; // достаем кол-во повторений и зануляем его
            if (count > 0) {
                if (used[count]) return false;
                else used[count] = true;
            }
        }
        return true;
    }
}