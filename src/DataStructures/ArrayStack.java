package DataStructures;

public class ArrayStack 
{
	private int maxSize; 
	private int[] stackArray;
	private int top; 

	public ArrayStack(int s)
	{
		maxSize = s; 
		stackArray = new int[maxSize]; 
		top = -1;
	}

	public void push(int j) 
	{
		stackArray[++top] = j; 
	}

	public int pop() 
	{
		return stackArray[top--]; 
	}

	public int peek() 
	{
		return stackArray[top];
	}

	public boolean isEmpty() 
	{
		return (top == -1);
	}

	public boolean isFull() 
	{
		return (top == maxSize-1);
	}

	public static void main(String[] args)
	{
		ArrayStack theStack = new ArrayStack(10); 
		theStack.push(20); 
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		while( !theStack.isEmpty() ) 
		{ 
			int value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}