public class GraphMatrix 
{
	private boolean matrix[][];
	private int vertex;
	
	//Initialize
	
	public GraphMatrix(int incoming)
	{
		vertex = incoming;
		matrix = new boolean[incoming][incoming];
	}
	
	public void addEdge(int source, int dest)
	{
		matrix[source][dest] = true;
		matrix[dest][source] = true;
	}
	
	public void print()
	{
		System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
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
}
