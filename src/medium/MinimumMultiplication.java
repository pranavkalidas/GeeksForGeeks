package medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplication {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7};
        int start = 3, end = 30;
        System.out.println(minimumMultiplications(arr,start,end));
    }

    public  static int minimumMultiplications(int[] arr, int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int[] visited = new int[100000];
        Arrays.fill(visited,-1);
        visited[start]=0;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            int stepCount = visited[temp];
            for (int j : arr) {
                int prod = (temp * j) % 100000;
                if(visited[prod]== -1){
                    queue.add(prod);
                    visited[prod]=stepCount+1;
                }
                if(prod==end)
                    return visited[temp];
            }
        }
        return -1;
    }
}

