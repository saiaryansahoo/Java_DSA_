package Solved_Questions;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class floodFill_algorithm {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        System.out.println("Before Flood Fill:");
        printImage(image);

        floodFill(image, sr, sc, color);

        System.out.println("After Flood Fill:");
        printImage(image);
    }

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] visit, int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visit[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }

        image[sr][sc] = color;
        visit[sr][sc] = true;

        helper(image, sr + 1, sc, color, visit, orgColor);
        helper(image, sr - 1, sc, color, visit, orgColor);
        helper(image, sr, sc + 1, color, visit, orgColor);
        helper(image, sr, sc - 1, color, visit, orgColor);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visit = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, visit, image[sr][sc]);
        return image;
    }

    private static void printImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
