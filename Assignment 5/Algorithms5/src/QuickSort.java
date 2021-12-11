public class QuickSort 
{
	
	public static void sort(int begin, int end)
	{
		if (begin < end)
		{
			int partitionInd = partition( begin, end);
			
			sort(begin, partitionInd - 1);
			sort(partitionInd + 1, end);
		}

	}
	
	public static void partition(String[] array, int begin, int end)
	{
		String pivot = array[end];
		int i = (begin - 1);
		
		for (int j = begin; j < end; j++)
		{
			if (array[j].compareTo(pivot) < 0)
			{
				i++;
				String swap = array[i];
				array[i] = array[j];
				array[j] = swap;
			}

		}
		
		String swapTwo = array[i + 1];
		array[i+1] = array[end];
		array[end] = swapTwo;
		
	}//partition
}
