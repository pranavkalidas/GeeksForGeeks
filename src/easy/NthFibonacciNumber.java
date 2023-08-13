package easy;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int n = 14521;
        System.out.println(nthFibonacci(n));
    }

    public static long nthFibonacci(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<=n; i++){
            arr[i] = (arr[i-2] + arr[i-1])%1000000007;
        }
        return arr[n];
    }
}
