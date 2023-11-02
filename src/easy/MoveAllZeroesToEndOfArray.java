package easy;

public class MoveAllZeroesToEndOfArray {
    void pushZerosToEnd(int[] arr, int n) {
        int  j = 0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0 && arr[j]==0){
                arr[j] = arr[i];
                arr[i] = 0;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
}
