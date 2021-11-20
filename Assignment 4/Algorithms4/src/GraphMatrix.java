import java.util.ArrayList;
public class GraphMatrix 
{
	ArrayList<ArrayList<Integer>> adjace;
    int ver;
	
	//Initialize
	
	public GraphMatrix(int vertex)
	{
		ver = vertex;
		adjace = new ArrayList<ArrayList<Integer>>(ver);
        for (int i = 0; i < ver; i++)
        	adjace.add(new ArrayList<Integer>());
	}
	
	public void addEdge(int source, int dest)
	{
		adjace.get(source).add(dest);
		adjace.get(dest).add(source);
	}
	
	
	
	public void print()
    {
        for (int i = 0; i < adjace.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adjace.get(i).size(); j++) {
                System.out.print(adjace.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
