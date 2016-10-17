package Interview_Programs;

import java.util.*;

public class FirstUniqueCharacter
{
	public static void firstUnique(String s)
	{
		char c;
		HashMap<Character,Integer> h = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			c = s.charAt(i);
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			else
			{
				h.put(c, 1);
			}
		}
		for(int j=0;j<s.length();j++)
		{
			char d;
			d = s.charAt(j);
			if(h.get(d) == 1)
			{
				System.out.println(d);
				break;
			}
		}
	}
	
	public static void main(String args[])
	{
		String s="aditya";
		firstUnique(s);
	}
}