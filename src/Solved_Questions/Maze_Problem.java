package Solved_Questions;

import java.util.ArrayList;

public class Maze_Problem {
    public static void main(String[] args) {
        System.out.println(countpaths(3,3));

        printpath("",3,3);

        System.out.println(returnPath("",3,3));

        System.out.println(diagonalPaths("",3,3));

        boolean[][] board={
                {true,true,true},
                {false,false,true},
                {true,true,false},
        };
        obstaclesPath("",board,0,0);
    }
    //counting paths
    static int countpaths(int row, int column){
        if(row==1||column==1){
            return 1;
        }

        int left=countpaths(row-1, column);
        int right=countpaths(row, column-1);
        return left+right;
    }

    //printing paths
    static void printpath(String path, int row, int column){
        if(row==1 && column==1){
            System.out.println(path);
            return;
        }

        if(row>1){
            printpath(path+'D',row-1,column);
        }
        if(column>1){
            printpath(path+'R',row,column-1);
        }
    }

    //returning ArrayList of Path
    static ArrayList<String> returnPath(String path, int row, int column){
        if(row==1 && column==1){
            ArrayList<String> list=new  ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(row>1){
            list.addAll(returnPath(path+'D',row-1,column));
        }
        if(column>1){
            list.addAll(returnPath(path+'R',row,column-1));
        }
        return list;
    }

    //Diagonal Paths
    static ArrayList<String> diagonalPaths(String path, int row, int column){
        if(row==1 && column==1){
            ArrayList<String> list=new  ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(row>1 && column>1){
            list.addAll(diagonalPaths(path+'D',row-1,column-1));
        }

        if(row>1){
            list.addAll(diagonalPaths(path+'V',row-1,column));
        }
        if(column>1){
            list.addAll(diagonalPaths(path+'H',row,column-1));
        }
        return list;
    }

    //path with obstacles
    static void obstaclesPath(String path,boolean[][] maze, int row, int column){
        if(row== maze.length-1 && column==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(!maze[row][column]){
            return;
        }

        if(row<maze.length-1){
            obstaclesPath(path+'D',maze,row+1,column);
        }
        if(column< maze[0].length-1){
            obstaclesPath(path+'R',maze, row,column+1);
        }
    }
}
