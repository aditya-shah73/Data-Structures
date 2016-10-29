package SortingSearching;
import java.util.Random;

public class SelectionSort //Find the smallest element and move it to the first position of the array
{
	public static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					int temp = a[i];
					a[i] =a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	private static Random generator = new Random();

	public static int[] randomIntArray(int length, int n)
	{
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = generator.nextInt(n);
		}

		return a;
	}

	public static void main(String[] args)
	{
		int[] x = randomIntArray(10,100);
		selectionSort(x);
	}	
}