import java.util.LinkedList;
public class AdjList 
{
	int ver;
	LinkedList<Integer> list[];
	
	
	public AdjList(int vertex) 
	{
		 ver = vertex;
		 list = new LinkedList[vertex];
		 for (int i = 0; i <vertex ; i++) {
		 list[i] = new LinkedList<>();
		 }
	}
	
	
	public void addEdge(int source, int dest)
	{
		list[source].addFirst(dest);
	}
	
	public void printGraph(){
		 for (int i = 0; i < ver ; i++) {
		 if(list[i].size()>0) {
		 System.out.print("Vertex " + i + " is connected to: ");
		 for (int j = 0; j < list[i].size(); j++) {
		 System.out.print(list[i].get(j) + " ");
		 }
		 System.out.println();
		 }
		 }
		 }
}
