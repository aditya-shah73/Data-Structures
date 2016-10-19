package DataStructures;

public class LinkedListTetster 
{
	public static void main(String[] args)
	{
		LinkedList theList = new LinkedList(); 
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		theList.displayList(); 
		while( !theList.isEmpty() ) 
		{
			Node aLink = theList.deleteFirst();
			System.out.println("Deleted"); 
			aLink.displayLink();
			System.out.println("");
		}
		Node f = theList.find(44); 
		if( f != null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can’t find link");
		Node d = theList.delete(66);
		if( d != null )
			System.out.println("Deleted link with key " + d.iData);
		else
			System.out.println("Can’t delete link");
		theList.displayList(); 
	}
}