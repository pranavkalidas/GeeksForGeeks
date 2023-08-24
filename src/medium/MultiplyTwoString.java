package medium;

import java.math.BigInteger;

public class MultiplyTwoString {
    public static void main(String[] args) {
        String s1 = "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333";
        String s2 = "02";
        System.out.println(multiplyStrings(s1,s2));
    }

    private static String multiplyStrings(String s1, String s2) {
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        BigInteger prod = num1.multiply(num2);
        return new BigInteger(s1).multiply(new BigInteger(s2)).toString();
        //return  prod.toString();
    }
}
