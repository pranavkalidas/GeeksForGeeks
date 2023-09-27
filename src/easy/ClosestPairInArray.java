package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPairInArray {
    public static void main(String[] args) {
        int[] arr = {0,3,5,7};
        int[] brr = {10,20,30,40};
        int X = 32;
        System.out.println(printClosest(arr,brr,arr.length, brr.length,X));
        //System.out.println(Math.abs(-4));
    }

    public static ArrayList<Integer> printClosest (int[] arr, int[] brr, int n, int m, int x) {
        int left = 0;
        int right = m-1;
        int i = 0;
        int j = 0;
        int diff = Integer.MAX_VALUE;
        while(left < n && right >= 0){
            int sum = arr[left] + brr[right];
            if( diff > Math.abs(x-sum) ){
                diff = Math.abs(x-sum);
                i = arr[left];
                j = brr[right];
            }
            if(sum > x){
                right--;
            }
            else{
                left++;
            }
        }
        return new ArrayList<>(Arrays.asList(i,j));
    }
}
