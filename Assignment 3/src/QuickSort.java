public class QuickSort 
{
	static int compare = 0; //take out?
	
	public static int sort(String[] items, int begin, int end)
	{
		if (begin < end)
		{
			int partitionInd = partition(items, begin, end);
			
			sort(items, begin, partitionInd - 1);
			sort(items, partitionInd + 1, end);
		}
		
		return compare;
	}
	
	public static int partition(String[] array, int begin, int end)
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
			compare++;
		}
		
		String swapTwo = array[i + 1];
		array[i+1] = array[end];
		array[end] = swapTwo;
		
		return i + 1;
	}//partition
}
