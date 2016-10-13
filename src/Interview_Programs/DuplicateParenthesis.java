package Interview_Programs;
import java.util.*;

public class DuplicateParenthesis 
{
	public static boolean checkParenthesis(String s) 
	{
		int count = 0, index = 0;
		boolean[] contentArray = new boolean[50];
		if(s == null)
		{
			return false;
		}
		for(char c : s.toCharArray()) 
		{
			if(c == '(') 
			{
				count++;
			}
			else if (c == ')') 
			{
				if( count == 0 ) 
				{  
					return false;
				}
				if(contentArray[count-1] == false) 
				{
					return false;
				}
				contentArray[count-1] = false;
				count --;
			} 
			else if(count > 0) 
			{
				if(!contentArray[count-1])
				{
					contentArray[count-1] = true;
				}
			}
			index++;
		}
		return (count == 0);
	}
	
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a parenthesis sequence: ");
		String s = in.next();
		System.out.println(checkParenthesis(s));
	}
}