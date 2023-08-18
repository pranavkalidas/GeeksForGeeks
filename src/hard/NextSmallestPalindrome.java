package hard;

import java.util.Arrays;
import java.util.Vector;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        int N = 7;
        int[] Num = {1,2,3,4,5,6,7};
        System.out.println(generateNextPalindrome(Num, N));
    }

    static Vector<Integer> generateNextPalindrome(int[] num, int n) {
        Vector<Integer> vector = new Vector<>();
        int i = 0;
        int j = n - 1;
        int m = n % 2 == 0 ? n / 2 - 1 : n / 2; //TODO : Remove
        boolean incr = false;
        int carry = 1;
        while(i <= j){
            if(num[i] > num[j]){
                num[j]=num[i];
                incr = true;
            }
            if(num[i] <num[j]){
                num[j] = num[i];
                incr = false;
            }
            i++;
            j--;
        }
        i--;
        j++;
        System.out.println(incr);
        while(!incr && i>-1){
            if(num[i]+carry==10){
                num[i]=0;
                num[j]=0;
            }
            else{
                if(i==j){
                    num[i]++;
                    incr = true;
                }
                else {
                    num[i]++;
                    num[j]++;
                    incr = true;
                    carry = 0;
                }
            }
            i--;
            j++;
        }
        if(carry==1 && !incr){
            vector.add(carry);
            for(int k=0; k<n-1;k++){
                vector.add(0);
            }
            vector.add(carry);
        }
        else{
            for(int k =0; k<n;k++){
                vector.add(num[k]);
            }
        }
        System.out.println(carry);
        System.out.println(Arrays.toString(num));
        return vector;
    }
}
