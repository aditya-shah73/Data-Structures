package DataStructures;

public class BinarySearchTree 
{
	public static BSTNode root;
	
	public BinarySearchTree()
	{
		this.root = null;
	}

	public boolean find(int value)
	{
		BSTNode current = root;
		while(current!=null)
		{
			if(current.data == value)
			{
				return true;
			}
			else if(current.data > value)
			{
				current = current.left;
			}
			else
			{
				current = current.right;
			}
		}
		return false;
	}

	public void insert(int value)
	{
		BSTNode newNode = new BSTNode(value);
		if(root==null)
		{
			root = newNode;
			return;
		}
		BSTNode current = root;
		BSTNode parent = null;
		while(true)
		{
			parent = current;
			if(value < current.data)
			{				
				current = current.left;
				if(current==null)
				{
					parent.left = newNode;
					return;
				}
			}
			else
			{
				current = current.right;
				if(current==null)
				{
					parent.right = newNode;
					return;
				}
			}
		}
	}
	
	public void display(BSTNode root)
	{
		if(root!=null)
		{
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	public static void main(String arg[])
	{
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
	}
}