import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compute {
	// Create a new keyboard Scanner object.
	  static Scanner keyboard = new Scanner(System.in);


	public static void main(String[] args) 
	{
		String fileName = null;
	    String[] line = null;
	    String[] line2 = null;

	    int num;
	    int source;
	    int dest;
	    int weight;
	    QueueBilotto graph = new QueueBilotto();
	    int verCount = 0;
	    int edgeCount = 0;
	    NodeBilotto edgeNode = new NodeBilotto();
	    SSP path = new SSP();
	    NodeBilotto firstVer = new NodeBilotto();
	    ArrayList<Spice> spices = new ArrayList<Spice>();
	    ArrayList <Knapsack> knapsack = new ArrayList<Knapsack>();

	   
	    try
	    { 
	      fileName = "test.txt";
	     
	      File theFile = new File(fileName);   
	      
	      Scanner input = new Scanner(theFile);
	      
	      //this will read the file together with the code below         
	      
	      while(input.hasNext())
	      {
	    	  line = input.nextLine().replaceAll("  ", " ").split(" ");
	    	  //System.out.println(Arrays.toString(line));
	    	  
	    	  if (line[0].equalsIgnoreCase("new"))
	    	  {
	    		  //System.out.println(Arrays.toString(line));
	    		  graph = new QueueBilotto();
	    		  verCount = 0;
	    		  edgeCount = 0;
	    		  num = 0;
	    		  
	    	  }
	    	  
	    	  else if (line[0].equalsIgnoreCase("add"))
	    	  {
	    		  if (line[1].substring(0,1).equalsIgnoreCase("v"))
	    		  {
	    			  //System.out.println(Arrays.toString(line));
	    			  num = Integer.parseInt(line[2]);
	    			 
	    			  if (graph.isEmpty())
	    			  {
	    				  firstVer.setData(num);
	    			  }
	    			  graph.enqueue(num);
	    			  verCount++;
	    		  }
	    		  else
	    		  {
	    			  //System.out.println(Arrays.toString(line));
	    			  
	    			  source = Integer.parseInt(line[2]);
	    			  dest = Integer.parseInt(line[4]);
	    			  weight = Integer.parseInt(line[5]);
	    			  
	    			  NodeBilotto srcNode = graph.search(source);
	    			  NodeBilotto destNode = graph.search(dest);
	    			  
	    			  Edge edge = new Edge(srcNode, destNode, weight);
	    			  
	    			  firstVer.edge.add(edge);
	    			  
	    			  
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
	    
	    try
	    { 
	      fileName = "spice.txt";
	     
	      File theFile = new File(fileName);   
	      
	      Scanner input = new Scanner(theFile);
	      
	      //this will read the file together with the code below         
	      
	      while(input.hasNext())
	      {
	    	  line = input.nextLine().replaceAll("\\s+", " ").split(";");
	    	  line2 = line[0].split(" ");
	    	  
	    	  System.out.println(Arrays.toString(line2));
	    	  int price;
	    	  int qty;
	    	  
	    	  if (line[0].equalsIgnoreCase("spice"))
	    	  {
	    		  
	    		  Spice spice = new Spice();
	    		  
	    		  spice.name = line[3];
	    		  
	    		  price = Integer.parseInt(line[6]);

	    		  qty = Integer.parseInt(line[9]);
	    		  spice.price = price;
	    		  spice.qty = qty;
	    		  
	    		  spice.unitPrice = (price/qty);
	    		  spices.add(spice);
	    		  
	    	  }
	    	  
	    	  else if (line[0].equalsIgnoreCase("knapsack"))
	    	  {
	    		
	    		 Knapsack sack = new Knapsack();
	    		 int capacity = Integer.parseInt(line[3]);
	    		 sack.qty = capacity;
	    		 knapsack.add(sack);
	    	  }
	    	  
	    	  
	    	  for (int c = 0; c < spices.size(); c++)
	    	  {
	    		  System.out.println(spices.get(c));
	    	  }
	    	  
	      }//while
	     
	      
	   
	      input.close();
	      keyboard.close();
	    }//try
	    
	    catch(Exception ex)
	    {
	      System.out.println("Oops, something went wrong!");
	    }//catch
	    
	    */
	    
	    
	    
	    //Prints out the graph!! (well at least the vertices!)
	    
	    
	    /*
	    for (int i = 0; i < edgeNode.edge.size(); i++)
	    {
	    	System.out.println(edgeNode.edge.get(i).getSource().getData());
	    	System.out.println(edgeNode.edge.get(i).getDest().getData());
	    	System.out.println(edgeNode.edge.get(i).getWeight());
	    }
	    //Prints out the edges
	    */
	    
	    /*
	    path.bellman(graph, edgeNode, verCount, edgeCount);
	    path.print(graph, graph.head, verCount);
	    System.out.println();
	    */
	    
	  //System.out.println(firstVer.getData());
	  //path.initSS(graph, firstVer, verCount);
	  path.bellman(graph, firstVer, verCount, edgeCount);
	  path.print(graph, firstVer, verCount);
	  
	    
	    /*  
	 for (int f = 0; f < 10; f++)
	 {
		 System.out.println(firstVer.edge.get(f).getSource().getData()); 
		 System.out.println(firstVer.edge.get(f).getDest().getData());  
		 System.out.println(firstVer.edge.get(f).getWeight());
	 }
	 */
	
	    //System.out.println(firstVer.edge.size());
	    
	  }//main
	
	
	

}//Compute
