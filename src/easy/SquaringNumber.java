package easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SquaringNumber {
    public static void main(String[] args) {
        int n = 2;
        int pow = 6;
        int result = 1;

        while(pow > 0){
            if((pow & 1) > 0)       //True if odd else even
                result = (result * n);
            pow = pow >> 1;     //Divide by 2
            n = (n * n);
        }
        System.out.println(result);
        List<Integer> list = new ArrayList<Integer>();
        BigInteger sumB = new BigInteger(String.valueOf(list.stream().mapToInt(Integer::intValue).sum()));
    }

    /*
    Square and Multiply Exponentiation
    x^6 = x^2 * x^2 * x * x
    If pow = 1; return x;
    If pow is odd and > 1: Square, power / 2;
    If pow is even: Square, (power - 1) / 2;
     */
}
