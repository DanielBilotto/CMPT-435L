import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int size = 1000;
		double infectSize = size * .02;
		boolean[] pool = new boolean[size];
		int testNums = 0;
		int count = 0;
		
		
		for (int i = 0; i < size; i++)
		{
			pool[i] = false;
		}
		
		
		for (int k = 0; k < infectSize; k++)
		{
			pool[k] = true;
		}
		
		shuffle(pool);
		
		/*
		for (int j = 0; j < pool.length; j++)
		{
			System.out.println(pool[j]);
		}
		*/
		
		
		
		for (int e = 0; e < size/8; e++)
		{
			Boolean[] test = new Boolean[8];
			
			
			for (int g = 0; g < 8; g++)
			{
				
				//System.out.println(count);
				test[g] = pool[count];
				count++;
				//System.out.println(test[g]);
			}
			
			//System.out.println("hi");
			
			List<Boolean> boolTest = new ArrayList<Boolean>(Arrays.asList(test));
			
			if (boolTest.contains(true))
			{
				int pop = 0;
				Boolean[] one = new Boolean[4];
				Boolean[] two = new Boolean[4];
				for (int t = 0; t < 3; t++)
					testNums++;

				
				for (int b = 0; b < 4; b++)
				{
					one[b] = test[pop];
					two[b] = test[pop + 4];
					
					//System.out.println(Arrays.toString(one));
					//System.out.println(Arrays.toString(two));
					//System.out.println("hi2");
					pop++;
					
					
				}
				
				List<Boolean> testOne = new ArrayList<Boolean>(Arrays.asList(one));
				List<Boolean> testTwo = new ArrayList<Boolean>(Arrays.asList(two));
				
				if (testOne.contains(true))
				{
					for (int o = 0; o < 4; o++)
					{
						testNums++;
						//System.out.println("hi2");
					}
						
					
				}
				
				if (testTwo.contains(true))
				{
					for (int t = 0; t < 4; t++)
					{
						testNums++;
						//System.out.println("hi3");
					}
				}
				
			}//if
			
			else
			{
				testNums++;
				//System.out.println("hi4");
				
			}
			
			
			
		}
		
		System.out.println("That's " + testNums + " tests to screen a population of " + size + " people for a disease with an infection rate of 2%.");
	}//main
	
	
	static boolean[] shuffle(boolean[] array)
	{
		Random random = new Random();
		for (int i = 0; i < array.length; i++)
		{
			int randInt = random.nextInt(array.length);
			boolean temp = array[randInt];
			array[randInt] = array[i];
			array[i] = temp;
		}
		
		return array;
	}//shuffle

}
