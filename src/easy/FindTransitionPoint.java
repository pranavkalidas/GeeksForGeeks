package easy;

import java.util.Arrays;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1};
        int ans = transitionPoint(arr,arr.length);
        System.out.println(ans);
    }

    static int transitionPoint(int arr[], int n) {
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
