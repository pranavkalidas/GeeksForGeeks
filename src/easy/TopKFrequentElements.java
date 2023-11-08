package easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4};
        int k = 2;
        int[] ans = topK(arr,k);
    }

    static public int[] topK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums) {
            map.merge(i, 1, Integer::sum);
        }
        //Collections.sort(map )
        System.out.println(map);
        return new int[]{};
    }
}
