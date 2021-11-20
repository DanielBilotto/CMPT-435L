
public class NodeTree 
{
	String myKey;
	NodeTree left;
	NodeTree right;
	NodeTree parent;
	
	NodeTree()
	{
		myKey = null;
		left = null;
		right = null;
		parent = null;
	}//nodeTree
	
	NodeTree(String item)
	{
		myKey = item;
		left = null;
		right = null;
		parent = null;
	}
	
	
	public String getKey()
	{
		return myKey;
	}//get
	
	public void setKey(String newKey)
	{
		myKey = newKey;
	}//set
}//NodeTree
