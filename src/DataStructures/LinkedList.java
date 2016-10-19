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

	public Node find(int key) 
	{ 
		Node current = first; 
		while(current.iData != key) 
		{
			if(current.next == null)
			{ 
				return null;
			}
			else
			{ 
				current = current.next; 
			}
		}
		return current; 
	}

	public Node delete(int key) 
	{ 
		Node current = first; 
		Node previous = first;
		while(current.iData != key)
		{
			if(current.next == null)
			{
				return null; 
			}
			else
			{
				previous = current; 
				current = current.next;
			}
		} 
		if(current == first)
		{ 
			first = first.next;
		}
		else
		{ 
			previous.next = current.next; 
		}
		return current;
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