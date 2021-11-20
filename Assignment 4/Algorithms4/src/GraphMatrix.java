import java.util.ArrayList;
public class GraphMatrix 
{
	ArrayList<ArrayList<Integer>> adj;
    int ver;
	
	//Initialize
	
	public GraphMatrix(int vertex)
	{
		ver = vertex;
		adj = new ArrayList<ArrayList<Integer>>(ver);
        for (int i = 0; i < ver; i++)
            adj.add(new ArrayList<Integer>());
	}
	
	public void addEdge(int source, int dest)
	{
		adj.get(source).add(dest);
        adj.get(dest).add(source);
	}
	
	
	
	public void print()
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
