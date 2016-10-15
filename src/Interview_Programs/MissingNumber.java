public class MissingNumber
{
	public static int MissingNumber(int[] a)
	{
		int sum = 0;
		int missing = 0;
		int length = a.length + 1;
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i]; 
		}
		int sum2 = (length * (length + 1)) / 2; //Sum of n numbers is n*(n+1)/2
		missing = sum2 - sum;
		return missing;
	}
	
	public static void main(String[] args)
	{
		int[] a = {4,1,2,5,3,7};
		System.out.println("The missing number in the sequence is: " + MissingNumber(a));
	}
}