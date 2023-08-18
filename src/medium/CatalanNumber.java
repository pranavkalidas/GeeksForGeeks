package medium;

import java.math.BigInteger;

public class CatalanNumber {
    public static void main(String[] args) {
        int n = 175;
        System.out.println(findCatalan(n));
    }

    private static int findCatalan(int n) {
        long num =  findFactorial(2*n);
        long den1 = findFactorial(n);
        long den2 = findFactorial(n + 1);
        long sum =  (num / (den2 * den1));
        System.out.println(sum + " " + num + " " + den1 + " " + den2);
        //return findFactorial(2 * n) / (findFactorial(n) * (findFactorial(n + 1)));
        //return findCatalanBig(n);
        return 0;
    }

    private static long findFactorial(int num) {
        if (num < 2) {
            return num;
        }
        long res = 1;
        for (long i = 2; i <= num; i++) {
            res = (res * i);
            //System.out.println(res);
        }
        return res;
    }

    public static int findCatalanBig(int n) {
        BigInteger b = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        b = b.multiply(b);
        BigInteger d = new BigInteger("1");

        for (int i = 1; i <= 2 * n; i++) {
            d = d.multiply(BigInteger.valueOf(i));
        }

        BigInteger ans = d.divide(b);
        ans = ans.divide(BigInteger.valueOf(n + 1));

        return ans.mod(new BigInteger("1000007")).intValue();
    }
}
