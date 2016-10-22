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

	public boolean delete(int data)
	{
		BSTNode parent = root;
		BSTNode current = root;
		boolean isLeftChild = false;
		while(current.data != data)
		{
			parent = current;
			if(current.data > data)
			{
				isLeftChild = true;
				current = current.left;
			}
			else
			{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null)
			{
				return false;
			}
		}

		if(current.left==null && current.right==null)
		{
			if(current==root)
			{
				root = null;
			}
			if(isLeftChild ==true)
			{
				parent.left = null;
			}
			else
			{
				parent.right = null;
			}
		}

		else if(current.right==null)
		{
			if(current==root)
			{
				root = current.left;
			}
			else if(isLeftChild)
			{
				parent.left = current.left;
			}
			else
			{
				parent.right = current.left;
			}
		}
		
		else if(current.left==null)
		{
			if(current==root)
			{
				root = current.right;
			}
			else if(isLeftChild)
			{
				parent.left = current.right;
			}
			else
			{
				parent.right = current.right;
			}
		}
		
		else if(current.left!=null && current.right!=null)
		{
			BSTNode successor = getSuccessor(current);
			if(current==root)
			{
				root = successor;
			}
			else if(isLeftChild)
			{
				parent.left = successor;
			}
			else
			{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}

	public BSTNode getSuccessor(BSTNode data)
	{
		BSTNode successsor =null;
		BSTNode successsorParent =null;
		BSTNode current = data.right;
		while(current != null)
		{
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		
		if(successsor != data.right)
		{
			successsorParent.left = successsor.right;
			successsor.right = data.right;
		}
		return successsor;
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
		System.out.println("Delete Node with no children (2) : " + b.delete(2));		
		b.display(root);
		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
		b.display(root);
		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
		b.display(root);
	}
}