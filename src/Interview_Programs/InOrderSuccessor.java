package Interview_Programs;

public class InOrderSuccessor 
{
		public static Node inorderSucc(Node n) 
		{ 
			if (n == null) return null;
			
			if (n.parent == null || n.right != null) 
			{ 
				return leftMostChild(n.right); 
			} 
			else
			{ 
				Node q = n;
				Node x = q.parent;
				
				while (x != null && x.left != q) {
					q = x;
					x = x.parent;
				}
				return x;
			}  
		} 
			
		public static Node leftMostChild(Node n) 
		{
			if (n == null) 
			{
				return null;
			}
			while (n.left != null) 
			{
				n = n.left; 
			}
			return n; 
		}
}