package medium;

import java.util.Arrays;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 0, 0},
                        {1, 0, 1, 0},
                        {0, 1, 1, 0},
                        {0, 0, 0, 0}};
        int[][] visited = new int[grid.length][grid[0].length];

        //top array
        for(int j=0; j< grid[0].length; j++) {
            if(grid[0][j]==1)
                dfsTraversal(grid, visited, 0, j);
        }
        //left array
        for(int i=0; i<grid.length; i++){
            if(grid[i][0]==1)
                dfsTraversal(grid,visited,i,0);
        }
        //bottom array
        for(int j=0; j<grid[0].length; j++){
            if(grid[grid.length-1][j]==1)
                dfsTraversal(grid,visited, grid.length-1, j);
        }
        for(int i=0; i<grid.length; i++){
            if(grid[i][grid[0].length-1]==1)
                dfsTraversal(grid,visited,i, grid[0].length-1);
        }
        int count = 0;
        for(int[] a : grid){
            for(int b : a){
                if(b==1)
                    count++;
                //System.out.print(b+" ");
            }
            //System.out.println();
        }
        System.out.println(count);
        //return count;
    }

    static void dfsTraversal(int[][] grid, int[][] visited, int i, int j){
        visited[i][j]=1;
        //left
        if(j-1 > 0 && grid[i][j-1]==1 && visited[i][j-1]==0){
            dfsTraversal(grid,visited,i,j-1);
            grid[i][j-1]=8;
        }
        //right
        if(j+1 < grid[0].length && grid[i][j+1]==1 && visited[i][j+1]==0){
            dfsTraversal(grid,visited,i,j+1);
            grid[i][j+1]=8;
        }
        //top
        if(i-1 > 0 && grid[i-1][j]==1 && visited[i-1][j]==0){
            dfsTraversal(grid,visited,i-1,j);
            grid[i-1][j]=8;
        }
        //bottom
        if(i+1 < grid.length && grid[i+1][j]==1 && visited[i+1][j]==0){
            dfsTraversal(grid,visited,i+1,j);
            grid[i+1][j]=8;
        }
        grid[i][j]=8;
        for(int[] a : grid){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
