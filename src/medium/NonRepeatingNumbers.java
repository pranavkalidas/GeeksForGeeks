package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 2};
        Arrays.stream(singleNumberByBitManipulation(nums)).forEach(System.out::println);
    }

    public static int[] singleNumberByBruteForce(int[] nums){
        int[] arr = new int[2];
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1])
                i=i+2;
            else{
                arr[j++]=nums[i];
                i++;
            }
        }
        if(i== nums.length-1){
            arr[j]=nums[i++];
        }
        return arr;
    }

    public static int[] singleNumberByBitManipulation(int[] nums){
        int[] arr = new int[2];
        int sumOfAllExor = 0;
        for(int i : nums) {
            sumOfAllExor = sumOfAllExor ^ i;
        }
        int rightMostSetBit = sumOfAllExor & (-sumOfAllExor);
        int a =0 , b = 0;
        for(int i : nums){
            if((i & rightMostSetBit) == 0){
                a ^= i;
            }
            else {
                b ^= i;
            }
        }
//        arr[0]=a;
//        arr[1]=b;
//        Arrays.sort(arr);
//        return arr;
        if(a>b){
            return new int[]{b,a};
        }
        return new int[]{a,b};
    }

}
