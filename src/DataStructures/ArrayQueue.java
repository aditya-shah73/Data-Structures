package DataStructures;

public class ArrayQueue 
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public ArrayQueue(int s) 
	{
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int j) 
	{
		if(rear == maxSize-1)
			rear = -1;
		queArray[++rear] = j; 
		nItems++; 
	}

	public int remove() 
	{
		int temp = queArray[front++]; 
		if(front == maxSize) 
			front = 0;
		nItems--; 
		return temp;
	}

	public int peekFront() 
	{
		return queArray[front];
	}

	public boolean isEmpty() 
	{
		return (nItems==0);
	}

	public boolean isFull() 
	{
		return (nItems==maxSize);
	}

	public int size() 
	{
		return nItems;
	} 

	public static void main(String[] args)
	{
		ArrayQueue theQueue = new ArrayQueue(5); 
		theQueue.insert(10); 
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.remove(); 
		theQueue.remove(); 
		theQueue.remove();
		theQueue.insert(50); 
		theQueue.insert(60); 
		theQueue.insert(70);
		theQueue.insert(80);
		while( !theQueue.isEmpty() ) 
		{
			int n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	} 
}