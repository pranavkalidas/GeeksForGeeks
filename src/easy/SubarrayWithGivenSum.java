package easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayWithGivenSum {
    public static void main(String[] args) throws IOException {
        int N = 4;
        int S = 0;
        int[] arr = {1,2,3,4};
        //int[] arr = readFromFile();
        subarraySum(arr,N,S).forEach(System.out::println);
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int N, int S){
            ArrayList<Integer> window = new ArrayList<Integer>();
            int left = 0;
            int right = 0;
            int currentSum = 0;
            while(right < N && S>0){
                currentSum = currentSum + arr[right++];
                while(left <  right && currentSum > S) {
                    currentSum = currentSum - arr[left++];
                }
                if(currentSum == S){
                    window.add(++left);
                    window.add(right);
                    return window;
                }
            }
            window.add(-1);
            return window;
    }

    public static int[] readFromFile() throws IOException {
        String path="/home/hunter/Downloads/fileInput.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String[] s = reader.readLine().split(" ");
        return Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
    }
}
