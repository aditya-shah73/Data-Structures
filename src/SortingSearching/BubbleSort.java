package SortingSearching;
import java.util.Random;

public class BubbleSort 
{
	private static Random generator = new Random();

	public static void bubbleSort(int[] a)
	{
		int n = a.length;
		int temp = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n; j++)
			{
				if(a[j-1] > a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

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
		System.out.println("The original array is:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("The sorted array is:");
		bubbleSort(x);
	}
}