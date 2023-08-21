package easy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayWithGivenSum {
    public static void main(String[] args) throws IOException {
        int N = 5;
        int S = 12;
        int[] arr = {1,2,3,7,5};
        //int[] arr = readFromFile();
        subarraySum(arr,N,S).forEach(System.out::println);
        System.out.println("***");
        demo(arr,N,S).forEach(System.out::print);
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
    public static ArrayList<Integer> demo(int[] arr, int N, int S){
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right<=N && left<=right){
            if(sum == S){
                list.add(++left);
                list.add(right);
                return list;
            }
            if(sum > S){
                sum = sum - arr[left++];
            }
            else{
                sum = sum + arr[right++];
            }

        }
        list.add(-1);
        return list;
    }

    public static int[] readFromFile() throws IOException {
        String path="/home/hunter/Downloads/fileInput.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String[] s = reader.readLine().split(" ");
        return Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
    }
}
