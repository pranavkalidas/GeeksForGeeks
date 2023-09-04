package medium;

import java.util.Stack;

public class ReplaceOWithX {
}
class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        for(int j=0; j<a[0].length; ++j){
            if(a[0][j]=='O'){
                dfsTraversal(a,0,j,new int[a.length][a[0].length]);
            }
        }
        for(int j=0; j<a[0].length; ++j){
            if(a[a.length-1][j]=='O'){
                dfsTraversal(a,a.length-1,j,new int[a.length][a[0].length]);
            }
        }
        for(int i=0; i<a.length; ++i){
            if(a[i][0]=='O'){
                dfsTraversal(a,i,0,new int[a.length][a[0].length]);
            }
        }
        for(int i=0; i<a.length; ++i){
            if(a[i][a[0].length-1]=='O'){
                dfsTraversal(a,i,a[0].length-1,new int[a.length][a[0].length]);
            }
        }
        for(int i=0; i<a.length; ++i){
            for(int j=0; j<a[0].length; ++j){
                if(a[i][j]=='A'){
                    a[i][j]='O';
                }
                else if(a[i][j]=='O'){
                    a[i][j]='X';
                }
            }
        }
        return a;
    }

    private static void dfsTraversal(char[][] graph, int i, int j, int[][] visited){
        visited[i][j]=1;
        if(i+1<graph.length && graph[i+1][j]=='O' && visited[i+1][j]!=1){
            dfsTraversal(graph,i+1,j,visited);
            graph[i+1][j]='A';
        }
        if(j+1<graph[0].length && graph[i][j+1]=='O' && visited[i][j+1]!=1){
            dfsTraversal(graph,i,j+1,visited);
            graph[i][j+1]='A';
        }
        if(i-1>=0 && graph[i-1][j]=='O' && visited[i-1][j]!=1){
            dfsTraversal(graph,i-1,j,visited);
            graph[i-1][j]='A';
        }
        if(j-1>=0 && graph[i][j-1]=='O' && visited[i][j-1]!=1){
            dfsTraversal(graph,i,j-1,visited);
            graph[i][j-1]='A';
        }
        graph[i][j]='A';
    }
}

