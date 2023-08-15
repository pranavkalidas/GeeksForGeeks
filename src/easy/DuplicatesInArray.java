package easy;

import java.util.*;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int N = 10;
        int[] a = {7, 6, 8, 4, 9, 8, 4, 7, 4, 4};
        System.out.println(duplicates(a, N));
    }

    private static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> dupList = new ArrayList<Integer>();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
//        if(dupList.isEmpty()){
//            dupList.add(-1);
//            return dupList;
//        }
        boolean isAdded = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] && !isAdded) {
                dupList.add(arr[i]);
                isAdded = true;
            }
            if(arr[i]!=arr[i-1]){
                isAdded = false;
            }
        }
        if (dupList.isEmpty()) {
            dupList.add(-1);
            return dupList;
        }
        return dupList;
    }
}
