import java.io.*;
import java.util.*;

public class Search {
	// Create a new keyboard Scanner object.
	  static Scanner keyboard = new Scanner(System.in);

	  
	  public static void main(String[] args) 
	{
		String fileName = null;
	    String line = null;
	    int size = 666;
	    String[] list = new String[size];
		String[] ft = new String[42];
		float bcompare = 0;
		float hcompare = 0;
		
		HashMap hMap = new HashMap();
		
		try
	    { 
	      fileName = "magicitems.txt";
	     
	      File theFile = new File(fileName);   
	      
	      Scanner input = new Scanner(theFile);
	    		 
	      for (int i = 0; i<size; i++)
	      {
	    	  line = input.nextLine().toLowerCase();
	    	  list[i] = line;
	      }
	   
	      input.close();
	      keyboard.close();
	    }//try
	    
	    catch(Exception ex)
	    {
	      System.out.println("Oops, something went wrong!");
	    }//catch
	    
	    //this sends back a message if something goes wrong in importing the text into the array from magic items
		
		for (int k = 0; k < 42; k++)
		{
			line = list[k];
	    	ft[k] = line;
		}
		
		QuickSort.sort(list, 0, list.length -1);

		System.out.println("linear search: " + linear(list, ft));
		for (int j = 0; j < 42; j++)
		{
			binary(list, ft, j);
			bcompare += binary(list, ft, j);
		}
		System.out.println("binary search: " + bcompare/42);
        
        
        
        for (int w = 0; w < size; w++)
		{
			hMap.add(list[w]);
		}
        
        for (int p = 0; p < 42; p++)
        {
        	String want = list[p];
        	hcompare += hMap.lookup(want);
        }
        
        System.out.println("Hash Map: " + hcompare);


	}//main
	  
	public static float linear (String[] items, String[] ft)
	{
		QueueBilotto que = new QueueBilotto();
		float compare = 0;
		
		String want = null;
		for (int i = 0; i < items.length; i++)
	      {
	    	  que.enqueue(items[i]);
	      }
		
		
		for (int k = 0; k < 42; k++)
		{
			NodeBilotto curr = que.head;
			want = ft[k];
			while ((curr != null) && (curr.getData() != want))
			{
				curr = curr.getNext();
				compare++;
			}
		}//for
		
		return (compare/42);
	}//linear 
	
	public static float binary(String[] items, String[] ft, int times)
	{
		int low = 0;
		int high = items.length;
		int mid;
		String want;
		float compare = 0;
		
			want = ft[times];
			while (low <= high)
			{
				mid = (low + high) / 2;
				
				if (items[mid].compareToIgnoreCase(want) < 0)
				{
					low = mid + 1;
					compare++;
				}
				else if (items[mid].compareToIgnoreCase(want) > 0)
				{
					high = mid - 1;
					compare++;
					
				}
				else 
				{
					return compare;
				}
			}//while
		
		return -1;
	}//binary
	
}//search
