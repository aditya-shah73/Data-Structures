package Interview_Programs;
import java.util.*;
public class checkStringPermutation 
{
	public static boolean checkPermutation(String s1, String s2)
	{	
		char ch;
		boolean val = true;
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<s1.length() ;i++)
		{
			ch = s1.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		for(int i=0; i<s2.length() ;i++)
		{
			ch = s2.charAt(i);
			if(hm.containsKey(ch) && hm.get(ch) != 0)
			{
				hm.put(ch, hm.get(ch)-1);
			}
			else
			{
				val = false;
				break;
			}
		}
		return val;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = s.nextLine();
		System.out.println("Enter the second string:");
		String str2 = s.nextLine();
		System.out.println(checkPermutation(str1,str2));
	}
}