import java.io.File;
import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Arrays;

public class Compute {
	// Create a new keyboard Scanner object.
	  static Scanner keyboard = new Scanner(System.in);


	public static void main(String[] args) 
	{
		String fileName = null;
	    String[] line = null;
	    int num;
	    int source;
	    int dest;
	    int weight;
	    Graph graph = new Graph();
	    int verCount = 0;
	    int edgeCount = 0;
	    NodeBilotto edgeNode = new NodeBilotto();
	    SSP path = new SSP();

	  
	    
	    //ArrayList<String> list = new ArrayList<String>();
	    
	    try
	    { 
	      fileName = "test.txt";
	     
	      File theFile = new File(fileName);   
	      
	      Scanner input = new Scanner(theFile);
	      
	      //this will read the file together with the code below         
	      
	      while(input.hasNext())
	      {
	    	  line = input.nextLine().split(" ");
	    	  //System.out.println(Arrays.toString(line));
	    	  
	    	  if (line[0].equalsIgnoreCase("new"))
	    	  {
	    		  //System.out.println(Arrays.toString(line));
	    		  graph = new Graph();
	    		  verCount = 0;
	    		  edgeCount = 0;
	    		  
	    	  }
	    	  
	    	  else if (line[0].equalsIgnoreCase("add"))
	    	  {
	    		  if (line[1].substring(0,1).equalsIgnoreCase("v"))
	    		  {
	    			  //System.out.println(Arrays.toString(line));
	    			  NodeBilotto vert = new NodeBilotto();
	    			  num = Integer.parseInt(line[2]);
	    			  vert.setData(num);
	    			  //System.out.println(vert.getData());
	    			  graph.vert.add(vert);
	    			  verCount++;
	    		  }
	    		  else
	    		  {
	    			  //System.out.println(Arrays.toString(line));
	    			  NodeBilotto edgeSource = new NodeBilotto();
	    			  NodeBilotto edgeDest = new NodeBilotto();
	    			  source = Integer.parseInt(line[2]);
	    			  dest = Integer.parseInt(line[4]);
	    			  weight = Integer.parseInt(line[5]);
	    			  
	    			  edgeSource.setData(source);
	    			  edgeDest.setData(dest);
	    			  
	    			  Edge edge = new Edge();
	    			  edge.setSource(edgeSource);
	    			  edge.setDest(edgeDest);
	    			  edge.setweight(weight);
	    			  
	    			  edgeNode.edge.add(edge);
	    			  edgeCount++;
	    			  
	    		  }
	    	  } 
	    	  
	    	  
	    	  
	      }//while
	     
	      
	   
	      input.close();
	      keyboard.close();
	    }//try
	    
	    catch(Exception ex)
	    {
	      System.out.println("Oops, something went wrong!");
	    }//catch
	    
	    //this sends back a message if something goes wrong in importing the text into the array from magic items
	    
	    /*
	    for (int i = 0; i < graph.vert.size(); i++)
	    {
	    	System.out.println(graph.vert.get(i).getData());
	    }
	    
	    //Prints out the graph!! (well at least the vertices!)
	    */
	    
	    /*
	    for (int i = 0; i < edgeNode.edge.size(); i++)
	    {
	    	System.out.println(edgeNode.edge.get(i).getSource().getData());
	    	System.out.println(edgeNode.edge.get(i).getDest().getData());
	    	System.out.println(edgeNode.edge.get(i).getWeight());
	    }
	    //Prints out the edges
	    */
	    
	    path.bellman(graph, edgeNode, verCount, edgeCount);
	    path.print(graph, graph.vert.get(0), verCount);
	    System.out.println();
	    
	  }//main

}//Compute
