public class StringRotation 
{
	public static boolean rotation(String s1, String s2)
	{
		if(s1.length() == s2.length())
		{
			s1 += s1;
			if(s1.indexOf(s2) != -1)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		String s1 = "amazon";
		String s2 = "azonam";
		System.out.println("Result is: " + rotation(s1,s2));
	}
}
