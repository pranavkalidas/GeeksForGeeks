package jobathon21;

import java.util.Arrays;

public class GeeksJourney {
    public static void main(String[] args) {
        int n = 2;
        int[] geeksTown = {2, 2};
        int m = 6;
        int[] journey = {2, 2, 2, 2, 2, 2};
        int q = 3;
        int[][] queries = {{0, 2},{1, 4},{0, 5}};
        int[] ans = geeksJourney(geeksTown,n,journey,m,queries,q);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] geeksJourney(int[] geeksTown, int n, int[] journey, int m, int[][] queries, int q){
        int[] ans = new int[queries.length];
        StringBuilder str = new StringBuilder();
        for(int i: journey){
            str.append(i);
        }

        String pattern = "";
        for(int i: geeksTown){
            pattern = pattern + i;
        }

        for(int i=0; i<queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int count = 0;
            while(left <= right){
                int index = str.substring(left,right+1).indexOf(pattern);
                if(index == -1){
                    ans[i] = count;
                    break;
                }
                else{
                    count++;
                    left = left + index + 1;
                }
            }
        }

        return ans;
    }
}