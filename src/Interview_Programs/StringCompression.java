package Interview_Programs;
import java.util.*;

public class StringCompression 
{
	public static String compression(String s)
	{
		String compressed = "";
		char ch;
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		for(Map.Entry<Character, Integer> entry: hm.entrySet())
		{
			char key = entry.getKey();
			int value = entry.getValue();
			compressed = compressed + key + value;
		}
		return compressed;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.next();
		String s2 = compression(s);
		System.out.println(s2);
	}
}