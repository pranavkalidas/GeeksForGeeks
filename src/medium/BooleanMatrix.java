package medium;

import java.util.Arrays;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        int[][] temp = Arrays.stream(matrix)
                .map(int[]::clone)
                .toArray(int[][]::new);
        int[] visited = new int[matrix.length + matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(temp[i][j]==1){
                    if(visited[i]==0){
                        visited[i]=1;
                        throw new ArithmeticException("Hel");
                        //sideTraversal(matrix, i, 0);
                    }
                    if(visited[j+matrix.length]==0){
                        visited[j+matrix.length]=1;
                        downTraversal(matrix, 0, j);
                    }
                }
            }
        }
        Arrays.stream(matrix).forEach(System.out::println);
    }

    static void downTraversal(int matrix[][], int i, int j){
        if(i+1 < matrix.length){
            downTraversal(matrix,i+1, j);
            matrix[i][j]=1;
        }
        matrix[i][j]=1;

        for(int[] arr : matrix){
            for(int a : arr){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void sideTraversal(int matrix[][], int i, int j){
        if(j+1 < matrix[0].length){
            sideTraversal(matrix,i, j+1);
            matrix[i][j]=1;
        }
        matrix[i][j]=1;
        for(int[] arr : matrix){
            for(int a : arr){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
