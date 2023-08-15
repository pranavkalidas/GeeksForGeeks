package easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(arr,N));
    }

    private static int missingNumber(int[] arr, int n) {
        Arrays.sort(arr);
        int i = 1;
        while(i <= arr.length){
            if(arr[i-1]!=i){
                return i;
            }
            i++;
        }
        return i;
    }
}
