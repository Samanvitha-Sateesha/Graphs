import java.io.*;
import java.util.*;
class dfs {
    private int V;
    private LinkedList<Integer> adj[];
    @SuppressWarnings("unchecked") dfs(int v){
        V=v;
        adj = new LinkedList[v];
        for(int i = 0;i<v;i++)
            adj[i] = new LinkedList<>();
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    void DFSUtil(int v)
        
}
