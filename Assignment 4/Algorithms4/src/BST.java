
public class BST 
{
	NodeTree root = null;
	
	
	public BST()
	{
		root = null;
		
	}//BST
	
	public void printTree()
	{
		printTree(root);
	}
	
	public static void printTree(NodeTree item)
	{
		if (item != null)
		{
			printTree(item.left);
			System.out.println(item.getKey());
			printTree(item.right);
		}
		
	}//print
	
	public void insert(BST tree, NodeTree item)
	{
		NodeTree trail = null;
		NodeTree curr = tree.root;
		
		
		
		while (curr != null)
		{
			
			trail = curr;
			if (item.getKey().compareToIgnoreCase(curr.getKey()) < 0)
			{
				curr = curr.left;
				System.out.println("L"); 
			}
			
			
			else 
			{
				curr = curr.right;
				System.out.println("R"); 
			}
				
		}//while
		
		item.parent = trail;
		
		if (trail == null)
		{
			tree.root = item;
		}
		else if (item.getKey().compareToIgnoreCase(trail.getKey()) < 0)
		{
			trail.left = item;
			System.out.println("L"); 
		}
		else
		{
			trail.right = item;
			System.out.println("R"); 
		}
			
			
	}//insert
	
	public void search(String want)
	{
		search(root, want);
	}
	
	public static NodeTree search (NodeTree item, String want)
	{
		if (item == null || want == item.getKey())
			return item;

		
		if (want.compareTo(item.getKey()) < 0)
		{
			System.out.println("L");
			return search(item.left, want);
			
		}
		else
		{
			System.out.println("R");
			return search(item.right, want);
		}
	}
	
	

}//BST
