import java.util.*;

class bfs{
    public static void main(String[] args) {
        int[] queue={1,2,4,3,5};
        for(int i=0;i<queue.length;i++){
            System.out.println(queue[i]);
        }
    }
    public static void bfs(List<List<Integer>> graph,int src){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.size()];

        q.add(src);
        vis[src]=true;

        //processing the remaining nodes
        while(q.size()>0){
            int rem=q.remove();
            System.out.println(rem);

            //processing the neighbors
            List<Integer> neighbors=graph.get(rem);
            for(int n:neighbors){
                if(!vis[n]){
                    q.add(n);
                    vis[n]=true;
                }
            }
        }
    }
}