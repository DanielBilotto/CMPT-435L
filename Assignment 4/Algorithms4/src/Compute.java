import java.io.File;
import java.util.Scanner;

public class Compute {
	// Create a new keyboard Scanner object.
	  static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int edge1 = 0;
		int edge2 = 0;
		int graphSize = 375;
		String graph;
		String fileName = null;
	    String line = null;
	    try
	    { 
	    	fileName = "graphs.txt";
	    	File theFile = new File(fileName);
	    	Scanner ginput = new Scanner(theFile);
	    	while(ginput.hasNext())
	        {
	      	
	      	line = ginput.nextLine();
	         
	      	if (line.contains("new graph"))
	      		
	     
	      	if (line.contains("add vertex"))
	     
	      	if (line.contains("add edge"))
	      	{
	      		String[] test;
	      		test = line.replaceAll("[^\\d-]", "").split("-");
	      		edge1 = Integer.parseInt(test[0]);
	      		edge2 = Integer.parseInt(test[1]);
	      	}
	      	
	    	
	      	
	        }//while
	    	
		      
	    	ginput.close();
	    	keyboard.close();
	    }//try
		    
	    catch(Exception ex)
	    {
	    	System.out.println("Oops, something went wrong!");
	    }//catch

	}//main
	
	
	public void searchTree()
    {
		String fileName = null;
	    String line = null;
	    BST tree = new BST();
	    int size = 666;
	        
	    try
	    { 
	    	fileName = "magicitems.txt";
	    	File theFile = new File(fileName);
	    	Scanner input = new Scanner(theFile);
	                 
	    for (int i = 0; i<10; i++)
	      {
	    	NodeTree item = new NodeTree();
	    	line = input.nextLine();
	    	item.setKey(line);
	    	System.out.println(item.getKey());
	    	tree.insert(tree, item);
	    	
	    	
	      }//for
	    //tree.printTree();
    	//System.out.println("______________________________________________");
	    
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
