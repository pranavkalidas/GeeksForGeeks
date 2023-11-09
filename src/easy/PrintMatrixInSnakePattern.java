package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintMatrixInSnakePattern {
    public static void main(String[] args) {
        int[][] matrix = {{45, 48, 54},{21, 89, 87},{70, 78, 15}};
    }

    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){

            int reverse = matrix[0].length-1;

            for(int j=0; j<matrix[0].length; j++){
                if(i%2 == 0){
                    list.add(matrix[i][j]);
                }
                else{
                    list.add(matrix[i][reverse--]);
                }
            }
        }
        return list;
    }


}
