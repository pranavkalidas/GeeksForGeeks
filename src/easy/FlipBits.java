package easy;

public class FlipBits {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0};
        int n = arr.length;
        System.out.println(maxOnes(arr,n));
    }


    //Kadane's Algorithm to find the largest sub array
    private static int maxOnes(int[] arr, int n) {
        int currentSum = 0;
        int maxSum = 0;
        int numberOfOnes = 0;
        for (int j : arr) {
            if (j == 0) {
                ++currentSum;
            } else {
                numberOfOnes++;
                --currentSum;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0)
                currentSum = 0;
        }
       return maxSum + numberOfOnes;
    }
}
