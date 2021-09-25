import java.io.*;
import java.util.*;

public class PalindromeBilotto
{
  // Create a new keyboard Scanner object.
  static Scanner keyboard = new Scanner(System.in);
    
  public static void main(String[] args)
  {      
    String fileName = null;
    String line = null;
    int size = 666;
    String[] list = new String[size];
    StackBilotto stack = new StackBilotto();
    QueueBilotto queue = new QueueBilotto();
    
    try
    { 
      fileName = "magicitems.txt";
     
      File theFile = new File(fileName);   
      
      Scanner input = new Scanner(theFile);
      
      //this will read the file together with the code below         
      
     for (int i = 0; i<size; i++)
     {
    		 line = input.nextLine().toLowerCase().replaceAll("\\s","");
    		 list[i] = line;
    		 //this adds inputs to an array with a size of 665
    		 
    		 String checkOne = "";
    		 String checkTwo = "";
    		 
    		 for (int j=0; j<list[i].length(); j++)
    		 {
    			 stack.push(list[i].charAt(j));
    			 queue.enqueue(list[i].charAt(j));
    		 }//for
    		 
    		 //this will take each character of a line in magic item and make them into a stack and queue
    		 
    		 for (int k=0; k<list[i].length(); k++)
    		 {
    			 checkOne = checkOne + stack.pop();
    			 checkTwo = checkTwo + queue.dequeue();
    			 
    		 }//for
    		 
    		 //this will pop and dequeue the stack and queue and compare the two lines to see if they match
    		 
    		 if (checkOne.equals(checkTwo))
    			 System.out.println(checkTwo);
    		 
    		 //and if they do it will print out the palindrome

     }//for
   
      input.close();
      keyboard.close();
    }//try
    
    catch(Exception ex)
    {
      System.out.println("Oops, something went wrong!");
    }//catch
    
    //this sends back a message if something goes wrong in importing the text into the array from magic items
    
  }//main
  
} //palindrome