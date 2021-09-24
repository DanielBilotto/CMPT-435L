// Use import to gain access to all Java utility classes for file input/output.
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
    
    try
    { 
      System.out.print("Enter a filename: ");
      fileName = keyboard.next();
      
     
      File theFile = new File(fileName);   
      
      Scanner input = new Scanner(theFile);
               
      
     for (int i = 0; i<size; i++)
     {
    		 line = input.nextLine();
    		 list[i] = line;
    		 
    		 
    		 //System.out.println(list[i]);
    		 //System.out.println(i);
    		 
    		 
     }//adds the file to an array
     
      
      
      input.close();
      keyboard.close();
    }//try
    catch(Exception ex)
    {
      System.out.println("Oops, something went wrong!");
    }//catch
    
    
    
    
  }//main
  
} //palindrome