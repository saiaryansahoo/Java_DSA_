package java_questions_solved;

public class MazeProblem_inAllDirections {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {false,false,true},
                {true,true,false},
        };
        allPath("",board,0,0);
    }
    static void allPath(String path,boolean[][] maze, int row, int column){
        if(row== maze.length-1 && column==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(!maze[row][column]){
            return;
        }

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
            allPath(path+'D',maze,row,column-1);
        }
    }
}
