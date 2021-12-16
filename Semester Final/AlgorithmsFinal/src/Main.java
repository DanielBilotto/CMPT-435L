import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int size = 1000;
		double theSize = size;
		double infectSize = size * .02;
		boolean[] pool = new boolean[size];
		int testNums = 0;
		int count = 0;
		double caseOne = 0;
		double caseTwo = 0;
		double caseThree = 0;
		double onePer = 0;
		double twoPer = 0;
		double threePer = 0;
		
		
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
						caseTwo++;
						//System.out.println("hi2");
					}
						
					
				}
				
				if (testTwo.contains(true))
				{
					for (int t = 0; t < 4; t++)
					{
						testNums++;
						caseTwo++;
						//System.out.println("hi3");
					}
				}
				
				if (testOne.contains(true) && testTwo.contains(true))
				{
					for (int t = 0; t < 4; t++)
					{
						caseThree++;
					}
				}
				
			}//if
			
			else
			{
				testNums++;
				caseOne++;
				//System.out.println("hi4");
				
			}
			
			
			
		}
		onePer = caseOne/theSize;
		twoPer = caseTwo/theSize;
		threePer = caseThree/theSize;
		
		System.out.println("Expected:");
		System.out.println("Case 1: 125 x 0.8500 = 106.25 instances requiring 107 tests (since there are no partial tests)");
		System.out.println("Case 2: 125 × 0.1496 = 18.70 instances requiring 131 tests");
		System.out.println("Case 3: 125 × 0.0004 = 0.05 round up to 1 instance requiring 11 tests");
		System.out.println("That's 249 tests to screen a population of 1000 people for a disease with an infection rate of 2%.");
		System.out.println();
		System.out.println("Actual:");
		System.out.println("Case 1: " + size/8 + " x " + onePer + " = " + ((size/3) * (onePer)) + " instances requiring " + caseOne + " tests (since there are no partial tests)");
		System.out.println("Case 2: " + size/8 + " x " + twoPer + " = " + ((size/3) * (twoPer)) + " instances requiring " + caseTwo + " tests");
		System.out.println("Case 3: " + size/8 + " x " + threePer + " = " + ((size/3) * (threePer)) + " instances requiring " + caseThree + " tests");
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
