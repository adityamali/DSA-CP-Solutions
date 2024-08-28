import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 4;
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);
        
        BFS bfs = new BFS();
        ArrayList<Integer> result = bfs.bfsOfGraph(V, adj);
        for(int i: result){
            System.out.print(i + " ");
        }
    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        
        queue.add(0);
        set.add(0);
        
        while(!queue.isEmpty()){
            int n = queue.poll();
            result.add(n);
            for(int i: adj.get(n)){
                if(!set.contains(i)){
                    queue.add(i); 
                    set.add(i);
                }
            }
        }
        
        return result;
    }
}
