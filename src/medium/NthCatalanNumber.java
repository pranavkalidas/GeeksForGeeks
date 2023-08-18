package medium;

public class NthCatalanNumber {
    public static void main(String[] args) {
        int n = 175;
        System.out.println(findCatalan(n));
    }

    public static int findCatalan(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++) {
            int j = 0;
            int k = i - 1;
            int sum = 0;
            while(j<i && k >= 0){
                sum = (sum + dp[j]*dp[k]) % 1000000007;
                j++;
                k--;
            }
            dp[i]=sum;
        }
        return dp[n];
    }
}
