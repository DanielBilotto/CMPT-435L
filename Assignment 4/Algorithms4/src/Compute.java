import java.io.File;
import java.util.Scanner;

public class Compute {
	// Create a new keyboard Scanner object.
	  static Scanner keyboard = new Scanner(System.in);


	public static void main(String[] args) 
	{
		/*
		int graphSize = 375;
		String fileName = null;
	   
	    try
	    { 
	    	fileName = "graphs.txt";
	    	String gline = null;
	    	File theFile = new File(fileName);
	    	Scanner ginput = new Scanner(theFile);
	    	
			for (int i = 0; i < graphSize; i++)
			{
				if (gline.contains("--"))
				{
					//donothing
				}
				
				else if (gline.contains("new graph"))
				{
					int vernum = 0;
					int firstver = 0;
					boolean first = true;
					int vcount = 0;
					int edge1 = 0;
					int edge2 = 0;
					
					i++;
					
					
					while (gline.contains("add vertex"))
					{
						String vid = gline.replaceAll("[^\\d-]", "");
						vernum = Integer.parseInt(vid);
					
					
					if (first)
					{
						firstver = vernum;
						first = false;
					}
					
					
					vcount++;
					i++;
					}//while
					
					if (firstver == 1)
					{
						vcount++;
					}//if
					
					GraphMatrix g = new GraphMatrix(vcount);
					
					while (gline.contains("add edge"))
					{
						String[] vstring;
						vstring = gline.replaceAll("[^\\d-]", "").split("-");
						
						edge1 = Integer.parseInt(vstring[0]);
						edge2 = Integer.parseInt(vstring[1]);
						
						g.addEdge(edge1 - 1, edge2 - 1);
						
						if(i < graphSize - 1) {
							i++;
						} else {
							break;
						}
						
					}//while
				}
			}
			
			
		      
	    	ginput.close();
	    	keyboard.close();
	    }//try
		    
	    catch(Exception ex)
	    {
	    	System.out.println("Oops, something went wrong!");
	    }//catch
	    
	    */
	    
		
		GraphMatrix matrix = new GraphMatrix(7);
		AdjList adj = new AdjList(7);
		adj.addEdge(0, 1);
		adj.addEdge(0, 4);
		adj.addEdge(0, 5);
		adj.addEdge(1, 2);
		adj.addEdge(1, 4);
		adj.addEdge(1, 5);
		adj.addEdge(2, 3);
		adj.addEdge(3, 4);
		adj.addEdge(4, 5);
		adj.addEdge(4, 6);
		adj.addEdge(5, 6);
		
		matrix.addEdge(0, 1);
		matrix.addEdge(0, 4);
		matrix.addEdge(0, 5);
		matrix.addEdge(1, 2);
		matrix.addEdge(1, 4);
		matrix.addEdge(1, 5);
		matrix.addEdge(2, 3);
		matrix.addEdge(3, 4);
		matrix.addEdge(4, 5);
		matrix.addEdge(4, 6);
		matrix.addEdge(5, 6);
		
		adj.print();
		matrix.print();
		searchTree();
		
	    

	}//main
	
	
	public static void searchTree()
    {
		String fileName = null;
	    String line = null;
	    BST tree = new BST();
	    int size = 666;
	    int size2 = 42;
	    String fileline = null;
	        
	    try
	    { 
	    	fileName = "magicitems.txt";
	    	File theFile = new File(fileName);
	    	Scanner input = new Scanner(theFile);
	                 
	    for (int i = 0; i<size; i++)
	      {
	    	NodeTree item = new NodeTree();
	    	line = input.nextLine();
	    	item.setKey(line);
	    	System.out.println(item.getKey());
	    	tree.insert(tree, item);
	    	
	    	
	      }//for
	    
	    
	    //tree.printTree();
    	//System.out.println("______________________________________________");
	    
	    Scanner fileinput = new Scanner(new File("src/text.txt"));
	    for (int k = 0; k < size2; k++)
	    {
	    	fileline = fileinput.nextLine();
	    	tree.search(fileline);
	    }
	    
	    //tree.search("");
	    
	    
	      input.close();
	      keyboard.close();
	    }//try
	    
	    
	    
	    catch(Exception ex)
	    {
	      System.out.println("Oops, something went wrong!");
	    }//catch
	    
	    
    }

}//Compute
