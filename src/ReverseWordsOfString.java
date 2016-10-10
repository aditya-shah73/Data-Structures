public class ReverseWordsOfString 
{
	public static void split(String s)
	{
		String[] a = s.split(" ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(reverse(a[i]));
		}
	}
	
	public static String reverse(String s)
	{
		String a = "";
		for(int j=s.length()-1; j>=0; j--)
		{
			a += s.charAt(j);
		}
		return a + " ";
	}
	
	public static void main(String[] args)
	{
		String s = "This is an example";
		split(s);
	}
}