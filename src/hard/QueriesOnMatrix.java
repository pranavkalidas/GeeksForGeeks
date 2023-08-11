package hard;

import java.util.Arrays;

public class QueriesOnMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4,0,5,3}, {0,0,3,4}, {1,2,1,2}, {1,1,2,3}, {0,0,3,1}, {1,0,2,4}};
        int n =6, q=6;
        Arrays.stream(solveQueries(n,arr)).forEach(i -> {
            Arrays.stream(i).forEach(System.out::print);
            System.out.println();
        });
    }

    public static int[][] solveQueries(int n, int[][] Queries) {
        int a, b, c, d;
        int[][] arr = new int[n][n];
        for (int[] query : Queries) {
            a = query[0];
            b = query[1];
            c = query[2];
            d = query[3];
            for (int l = a; l <= c; l++) {
                for (int m = b; m <= d; m++) {
                    arr[l][m]++;
                }
            }
        }
        return arr;
    }
}
