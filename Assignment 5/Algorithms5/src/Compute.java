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
	    		  System.out.println(Arrays.toString(line));
	    		  graph = new QueueBilotto();
	    		  verCount = 0;
	    		  edgeCount = 0;
	    		  num = 0;
	    		  
	    	  }
	    	  
	    	  else if (line[0].equalsIgnoreCase("add"))
	    	  {
	    		  if (line[1].substring(0,1).equalsIgnoreCase("v"))
	    		  {
	    			  System.out.println(Arrays.toString(line));
	    			  NodeBilotto vert = new NodeBilotto();
	    			  num = Integer.parseInt(line[2]);
	    			  vert.ver = num;
	    			  graph.enqueue(vert);
	    			  verCount++;
	    		  }
	    		  else
	    		  {
	    			  System.out.println(Arrays.toString(line));
	    			  
	    			  source = Integer.parseInt(line[2]);
	    			  dest = Integer.parseInt(line[4]);
	    			  weight = Integer.parseInt(line[5]);
	    			  

	    			  //NodeBilotto srcNode = graph.search(source);
	    			  //NodeBilotto destNode = graph.search(dest);
	    			  
	    			  
	    			  //Edge edge = new Edge(destNode, weight);
	    			  
	    			  //srcNode.edge.add(edge);
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
	    	  line = input.nextLine().replaceAll("\\s+", " ").split(" ");
	    	  System.out.println(Arrays.toString(line));
	    	  int price;
	    	  int qty;
	    	  
	    	  if (line[0].equalsIgnoreCase("spice"))
	    	  {
	    		  ArrayList<Spice> spices = new ArrayList<Spice>();
	    		  Spice spice = new Spice();
	    		  spice.name = line[3];
	    		  price = Integer.parseInt(line[6]);
	    		  qty = Integer.parseInt(line[9]);
	    		  spice.price = price;
	    		  spice.qty = qty;
	    		  spice.unitPrice.add(price/qty);
	    		  spices.add(spice);
	    		  selectSort(spice.unitPrice);
	    		  
	    	  }
	    	  
	    	  else if (line[0].equalsIgnoreCase("knapsack"))
	    	  {
	    		 int scoops = 0;
	    		 int capacity = Integer.parseInt(line[3]);
	    		 
	    		 if (capacity > 0)
	    		 {
	    			 
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
	    
	    
	  }//main
	
	
	public static void selectSort(ArrayList<Integer> items)
	  {
		  for (int i = 0; i < items.size(); i++)
		  {
			  int smallPos = i;
			  for (int j = i; j < items.size(); j++)
			  {
				  if (items.get(j) < items.get(smallPos))
				  {
					  smallPos = j;
				  }
			  }
			  int swap = items.get(smallPos);
			  items.set(smallPos, items.get(i));
			  items.set(i, swap);
		  }

	  }//SS

}//Compute
