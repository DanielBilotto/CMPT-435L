public class MergeSort 
{
	static int compare = 0;
	public static int sort(int[] items)
	{
		if (items.length > 1)
		{
			int[] left = new int[items.length / 2];
			int[] right = new int[items.length - items.length / 2];
			
			for (int i = 0; i < left.length; i++) 
			{
                left[i] = items[i];
            }

            for (int i = 0; i < right.length; i++) 
            {
                right[i] = items[i + items.length / 2];
                compare++;
            }

            sort(left);
            sort(right);
            merge(items, left, right);
		}
		return compare;
	}//sort
	
	public static void merge(int[] items, int[] left, int[] right)
	{
		int i = 0;
		int j = 0;
		
		for (int k = 0; k < items.length; k++)
		{
			if (j >= right.length || (i < left.length && left[i] < right[j]))
			{
				items[k] = left[i];
				i++;
				compare++;
			}
			else
			{
				items[k] = right[j];
				j++;
				compare++;
			}
		}
	}//merge
}
