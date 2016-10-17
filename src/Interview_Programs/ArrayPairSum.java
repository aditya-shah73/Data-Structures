package Interview_Programs;

import java.util.HashMap;

public class ArrayPairSum 
{
	public static void printSumPairs(int[] a, int k)
	{
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				System.out.println(a[i] +", "+ h.get(a[i]));
			}
			else
			{
				h.put(k-a[i], a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{        
		int []a = {2,45,7,3,5,1,8,9};
		printSumPairs(a,10);        
	}
}