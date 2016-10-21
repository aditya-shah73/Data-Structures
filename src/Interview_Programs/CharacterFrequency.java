package Interview_Programs;
import java.util.*;

public class CharacterFrequency 
{
	private static void printCount(String test) 
	{
		Map<Character, Integer> lhm = new LinkedHashMap<>();
		char[] characters = test.toCharArray();
		for (Character a : characters) 
		{
			if(lhm.containsKey(a))
			{
				lhm.put(a, lhm.get(a)+1);
			}
			else
			{
				lhm.put(a, 1);
			}
		}
		for(Character a : lhm.keySet())
		{
			System.out.println("("+a+", "+lhm.get(a)+")");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = s.nextLine();
		printCount(str);
	}
}