package java_questions_solved;

import java.util.Arrays;

public class MazeProblem_inAllDirections {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] paths=new int[board.length][board[0].length];
        printAllPath("",board,0,0,paths,1);
    }
    static void allPath(String path,boolean[][] maze, int row, int column){
        if(row== maze.length-1 && column==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(!maze[row][column]){
            return;
        }

        maze[row][column] = false;

        if(row<maze.length-1){
            allPath(path+'D',maze,row+1,column);
        }
        if(column< maze[0].length-1){
            allPath(path+'R',maze, row,column+1);
        }
        if(row>0){
            allPath(path+'U',maze,row-1,column);
        }
        if(column>0){
            allPath(path+'L',maze,row,column-1);
        }

        maze[row][column] = true;
    }

    //printing all the paths with the matrix
    static void printAllPath(String path,boolean[][] maze, int row, int column, int[][] paths, int step){
        if(row== maze.length-1 && column==maze[0].length-1){
            paths[row][column] = step;
            for(int[]arr:paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        if(!maze[row][column]){
            return;
        }

        maze[row][column] = false;
        paths[row][column] = step;
        if(row<maze.length-1){
            printAllPath(path+'D',maze,row+1,column, paths, step+1);
        }
        if(column< maze[0].length-1){
            printAllPath(path+'R',maze, row,column+1, paths, step+1);
        }
        if(row>0){
            printAllPath(path+'U',maze,row-1,column, paths, step+1);
        }
        if(column>0){
            printAllPath(path+'L',maze,row,column-1, paths, step+1);
        }

        maze[row][column] = true;
        paths[row][column] = 0;
    }
}
