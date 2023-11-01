package easy;

import java.util.Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        int N = 5;
        int P = 5;
        frequencyCount1(arr,N,P);
        System.out.println(Arrays.toString(arr));
    }

    static void frequencyCount1(int[] arr, int N, int P) {
        // code here
        int rem = 1 + Math.max(N, P);
        for (int i = 0; i < N; i++) {
            if ((arr[i] % rem) > N) continue;
            arr[(arr[i] % rem) - 1] += rem;
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < N; i++)
            arr[i] = arr[i] / rem;
    }

    public static void frequencyCount(int arr[], int N, int P)
    {
        int[] map = new int[P+1];
        for(int i=0; i<N; i++){
            int a = arr[i];
            map[a]= map[a] + 1;
        }
        for(int i=0; i<N; i++){
            if(i+1>P || map[i+1]==0){
                arr[i]=0;
            }
            else{
                arr[i]=map[i+1];
            }
        }
    }
}
