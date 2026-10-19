package DSA_practise;
import java.util.*;

class DFS{
    public static void main(String[] args) {
         int[] queue={1,2,4,3,5};
         for(int i=0;i<queue.length;i++){
            System.out.println(queue[i]);
         }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis) {
        System.out.println(src);
        vis[src]=true;

        ArrayList<Integer> neighbors=graph.get(src);
        for(int neighbor:neighbors){
            if(!vis[neighbor]){
                dfs(graph,neighbor,vis);
            }
        }
    }
}