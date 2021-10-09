import java.io.*;
import java.util.*;

public class AllSorts
{
  // Create a new keyboard Scanner object.
  static Scanner keyboard = new Scanner(System.in);
  static int size = 666;
  
  //this main method prints out the number of comparisons from all the sorts
  //it reads in the array from magic items after every sort as well
  public static void main(String[] args)
  {
	  String[] list = new String[size];
	  file(list);
	  selectSort(list);
	  file(list);
	  insertSort(list);
	  file(list);
	  System.out.println("Merge sort comparisons:" + MergeSort.sort(list));
	  file(list);
	  System.out.println("Quick sort comparisons:" + QuickSort.sort(list, 0, list.length -1));
    
  }//main
  
  //this is basically the same file as lab 1, all it does is read in the items from magic items.
  public static void file(String[] items)
  {
	  String fileName = null;
	  String line = null;
	    
	    try
	    { 
	      fileName = "magicitems.txt";
	     
	      File theFile = new File(fileName);   
	      
	      Scanner input = new Scanner(theFile);
	    		 
	      for (int i = 0; i<size; i++)
	      {
	    	  line = input.nextLine().toLowerCase();
	    	  items[i] = line;
	      }
	   
	      input.close();
	      keyboard.close();
	    }//try
	    
	    catch(Exception ex)
	    {
	      System.out.println("Oops, something went wrong!");
	    }//catch
	    
	    //this sends back a message if something goes wrong in importing the text into the array from magic items
  }//file
  
  public static void selectSort(String[] items)
  {
	  int n = items.length;
	  int compare = 0;
	  for (int i = 0; i < n - 1; i++)
	  {
		  int smallPos = i;
		  for (int j = smallPos + 1; j < n; j++)
		  {
			  compare++;
			  if (items[j].compareTo(items[smallPos]) < 0)
			  {
				  smallPos = j;
			  }
		  }
		  String swap = items[i];
		  items[i] = items[smallPos];
		  items[smallPos] = swap;
	  }
	  System.out.println("Selection sort comparisons:" + compare);
  }//SS
  
  public static void insertSort(String[] items)
  {
	  int n = items.length;
	  int compare = 0;
	  
	  for (int i = 1; i < n ; i++)
	  {
		  String key = items[i];
		  int j = i - 1;
		  while ((j > -1) && (items[j].compareTo(key) > 0))
		  {
			  compare++;
			  items[j + 1] = items [j];
			  j--;
		  }
		  items[j+1] = key;
	  }
	  
	  System.out.println("Insert sort comparisons:" + compare);
  }//IS
  
  
} //palindrome