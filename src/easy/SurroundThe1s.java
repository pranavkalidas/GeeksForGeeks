package easy;

public class SurroundThe1s {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{1,1,0},{0,1,0}};
        System.out.println(Count(arr));
    }

    public static int Count(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int oneS = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(matrix[i][j]==1){
                    int count = 0;
                    //right
                    if(j+1<columns && matrix[i][j+1]==0){
                        count++;
                    }
                    //left
                    if(j-1>-1 && matrix[i][j-1]==0){
                        count++;
                    }
                    //top
                    if(i+1<rows && matrix[i+1][j]==0){
                        count++;
                    }
                    //bottom
                    if(i-1>-1 && matrix[i-1][j]==0){
                        count++;
                    }
                    //top right
                    if(i-1>-1 && j+1<columns && matrix[i-1][j+1]==0){
                        count++;
                    }
                    //bottom left
                    if(i+1<rows && j-1>-1 && matrix[i+1][j-1]==0){
                        count++;
                    }
                    //bottom right
                    if(i+1<rows && j+1<columns && matrix[i+1][j+1]==0){
                        count++;
                    }
                    //top left
                    if(i-1>-1 && j-1>-1 && matrix[i-1][j-1]==0){
                        count++;
                    }
                    if(count%2==0 && count > 0){
                        oneS++;
                    }
                }
            }
        }
        return oneS;
    }
}
