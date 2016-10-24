package Interview_Programs;

public class maxSumSequence 
{
	public static void sumSequence(int[] a)
	{
		int sum = 0;
		int actualSum = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				sum += a[i];
			}
			else
			{
				if(sum >= actualSum)
				{
					actualSum = sum;
				}
				sum = 0;
			}
		}
		System.out.println("The largest sum is: " + actualSum);

	}
	public static void main(String[] args)
	{
		int[] a = {1,2,-3,2,6,9,-6,1,2,3,4,5,-8,5,6};
		sumSequence(a);
	}
}