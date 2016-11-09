package Interview_Programs;

public class FirstCommonAncestor 
{
	public static Node commonAncestor(Node p, Node q) 
	{
		int delta = depth(p) - depth(q);
		Node first = delta > 0 ? q : p; 
		Node second = delta > 0 ? p : q; 
		second = goUpBy(second, Math.abs(delta)); 
		while (first != second && first != null && second != null) {
			first = first.parent;
			second = second.parent;
		}
		return first == null || second == null ? null : first;
	}
	
	public static Node goUpBy(Node node, int delta) 
	{
		while (delta > 0 && node != null) 
		{
			node = node.parent;
			delta--;
		}
		return node;
	}
	
	public static int depth(Node node) 
	{
		int depth = 0;
		while (node != null) 
		{
			node = node.parent;
			depth++;
		}
		return depth;
	}
}