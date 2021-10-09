public class MergeSort 
{
	static int compare = 0;
	public static int sort(String[] items)
	{
		if (items.length > 1)
		{
			String[] left = new String[items.length / 2];
			String[] right = new String[items.length - items.length / 2];
			
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
	
	public static void merge(String[] items, String[] left, String[] right)
	{
		int i = 0;
		int j = 0;
		
		for (int k = 0; k < items.length; k++)
		{
			if (j >= right.length || (i < left.length && left[i].compareToIgnoreCase(right[j]) < 1))
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
