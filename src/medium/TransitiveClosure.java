package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TransitiveClosure {
    public static void main(String[] args) {
        int[][] graph = {{1, 1, 0, 1},
                        {0, 1, 1, 0},
                        {0, 0, 1, 1},
                        {0, 0, 0, 1}};

        System.out.println(transitiveClosure(graph.length,graph));
    }

    /* Warshall's algorithm */
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int[][] graph)
    {
        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i==k || j==k){
                        continue;
                    }
                    if(graph[i][j]==1 || (graph[i][k] & graph[k][j]) == 1){
                        graph[i][j]=1;
                    }
                }
            }
        }
        return arrayToList(graph);
    }

    public static ArrayList<ArrayList<Integer>> arrayToList(int[][] graph){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int[] arr: graph){
            ArrayList<Integer> newList = new ArrayList<>();
            for(int i : arr){
                newList.add(i);
            }
            list.add(newList);
        }
        return list;
    }
}


