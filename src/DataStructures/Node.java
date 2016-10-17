package DataStructures;

public class Node 
{
	public int iData;
	public Node next; 
	public Node(int id)
	{
		iData = id;
	}
	public void displayLink() 
	{
		System.out.print("{" + iData + "}");
	}
}
