package DataStructures;

public class LinkedList 
{
	private Node first;
	public  LinkedList() 
	{
		first = null; 
	}

	public boolean isEmpty() 
	{
		return (first==null);
	}

	public void insertFirst(int id)
	{ 
		Node newLink = new Node(id);
		newLink.next = first; 
		first = newLink; 
	}

	public Node deleteFirst() 
	{
		Node temp = first; 
		first = first.next; 
		return temp; 
	}

	public void displayList()
	{
		Node current = first; 
		while(current != null) 
		{
			current.displayLink(); 
			current = current.next; 
		}
		System.out.println("");
	}
} 