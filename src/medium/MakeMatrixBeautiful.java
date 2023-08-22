package medium;

/*
    Intuition:
    1. We find the maximum sum between all rows and columns
    2. Simultaneously also find out the sum of each row and column and store in array
    3. Now all we need to do it to find no. of increments required in each row to match the maximum sum
    4. This can be done by subtracting row sum / column sum from maximum sum.
    5. Finally, we can store the difference in the same rowSum/colSum array and the add all the total sum of array simultaneously.
    6. Both rowSum/colSum total sum will be the same as changes made to row also effect column.
     */

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 2, 3}, {3, 2, 1}};
        int N = matrix.length;
        System.out.println(findMinOperation(N, matrix));
    }

    private static int findMinOperation(int N, int[][] matrix) {
        int max = 0;
        int maxSteps = 0;
        int[] rowSum = new int[N];
        int[] colSum = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rowSum[i] = rowSum[i] + matrix[i][j];
                colSum[i] = colSum[i] + matrix[j][i];
            }
            System.out.println(rowSum[i] + " " + colSum[i]);
            max = Integer.max(rowSum[i], Integer.max(colSum[i], max));
        }
        for (int i = 0; i < N; i++) {
            maxSteps = maxSteps + max - rowSum[i];
        }
        return maxSteps;
    }

}
