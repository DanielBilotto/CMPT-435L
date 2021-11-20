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
	
	/*
	public void print()
	{
		System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 0; j <vertex ; j++) {
                if(matrix[i][j]==true){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }	
	}
	*/
	
	public void printAdjacencyList()
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
