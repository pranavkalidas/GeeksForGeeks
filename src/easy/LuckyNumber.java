package easy;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class LuckyNumber {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isLucky(n));
    }

    public static boolean isLucky(int n){
        int i = 2;
        while(n%i!=0){
            if(i>n){
                return true;
            }
            n = n - n/i;
            i++;
        }
        return false;
    }


}
