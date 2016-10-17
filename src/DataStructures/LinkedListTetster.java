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
		theList.displayList(); 
	}
}
