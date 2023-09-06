package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MotherVertex {
    public static void main(String[] args) {
        //int[][] arr = {{2,3,{0},{1,3},{4},{}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.add(new ArrayList<>(List.of(4)));
        adj.add(new ArrayList<>());
        int V = 5;
        //System.out.println(findMotherVertex(V, adj));

    }

    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int v = -1;
        int[] visited = new int[V];
        for(int i=0; i<V; i++){
            if(visited[i]==0){
                dfsTraversal(i,adj,visited);
                v = i;
            }
        }
        visited = new int[V];
        dfsTraversal(v,adj,visited);
        for(int i: visited){
            if(i==0)
                return -1;
        }
        return v;
    }

    public void dfsTraversal(int v, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[v]=1;
        for(int a : adj.get(v)){
            if(visited[a]==0){
                dfsTraversal(a,adj,visited);
            }
        }
    }
}

