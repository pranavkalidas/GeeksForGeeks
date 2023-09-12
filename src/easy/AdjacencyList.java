package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        Solution s = new Solution();
        int v = 5;
        int[][] edges = {{0, 1}, {0, 4}, {4, 1}, {4, 3}, {1, 3}, {1, 2}, {3, 2}};
        System.out.println(s.printGraph(v, edges));
    }
}

class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; ++i) {
            list.add(i, new ArrayList<>());
        }
        System.out.println(list);
        for (int i = 0; i < edges.length; ++i) {
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
            //list.add(edges[i][1], Collections.singletonList(edges[i][0]));

        }
        return list;
    }
}
