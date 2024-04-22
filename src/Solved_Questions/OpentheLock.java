package Solved_Questions;
import java.util.*;

public class OpentheLock {
    public static void main(String[] args) {

    }
}
class openLock {
    public int openLock(String[] deadends, String target) {
        int[] deadSet = new int[10000];
        for (String dead : deadends) {
            int num = Integer.parseInt(dead);
            deadSet[num] = -1;
        }

        if (deadSet[0] == -1) return -1;

        int targetNum = Integer.parseInt(target);
        if (targetNum == 0) return 0;

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(0);
        visited.add(0);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == targetNum) return depth;
                if (deadSet[current] == -1) continue;

                for (int j = 1; j <= 1000; j *= 10) {
                    int digit = (current / j) % 10;
                    int up = current + ((digit + 1) % 10 - digit) * j;
                    int down = current + ((digit + 9) % 10 - digit) * j;

                    if (!visited.contains(up) && deadSet[up] != -1) {
                        queue.offer(up);
                        visited.add(up);
                    }
                    if (!visited.contains(down) && deadSet[down] != -1) {
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            depth++;
        }
        return -1;
    }
}
