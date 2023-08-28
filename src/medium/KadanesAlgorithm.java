package medium;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }

    private static long maxSubarraySum(int[] arr, int n) {
        long currSum = 0;
        long maxSum = arr[0];
        for(int i : arr){
            currSum += i;
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}

/*
1. To find the maximum sub array sum
2. Keep of adding until currSum goes negative
3. If so reset the currSum and count for new sub-array
4. Also update maxSum for any currSum greater than maxSum
 */
