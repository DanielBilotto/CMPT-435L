public class HashMap 
{
	public final static int size = 250;
	NodeBilotto item = new NodeBilotto();
	NodeBilotto[] table = new NodeBilotto[size];
	
	HashMap()
	{
		for (int i = 0; i < size; i++)
		{
			table[i] = null;
		}
	}//hashmap
	
	
	int makeHashCode(String str) {
        str = str.toUpperCase();
        int length = str.length();
        int letterTotal = 0;
  
        // Iterate over all letters in the string, totalling their ASCII values.
        for (int i = 0; i < length; i++) {
           char thisLetter = str.charAt(i);
           int thisValue = (int)thisLetter;
           letterTotal = letterTotal + thisValue;
  
          // Test: print the char and the hash.
           /* 
           System.out.print(" ["); 
           System.out.print(thisLetter); 
           System.out.print(thisValue); 
           System.out.print("] "); 
           // */
        }
  
        // Scale letterTotal to fit in HASH_TABLE_SIZE.
        int hashCode = (letterTotal * 1) % size;  // % is the "mod" operator
        // TODO: Experiment with letterTotal * 2, 3, 5, 50, etc.
  
        return hashCode;
     }
	
	
	
	public void add(String key)
	{
		int hash = makeHashCode(key);
		if (table[hash] == null)
			table[hash] = new NodeBilotto(key);
		else
		{
			NodeBilotto entry = table[hash];
			while (entry.getNext() != null && entry.getData() != key)
			{
				entry = entry.getNext();
				
			}
			
			if (entry.getData() != key)
			{
				entry.setNext(new NodeBilotto(key));

			}
		}
	}//add
	
	public int lookup(String item)
	{
		int hash = makeHashCode(item);
		int compare = 0;
		NodeBilotto entry = table[hash];
		while (entry.getData() != item)
		{
			entry = entry.getNext();
			compare++;
		}
		return compare;
	}//lookup
	
}//hashmap
