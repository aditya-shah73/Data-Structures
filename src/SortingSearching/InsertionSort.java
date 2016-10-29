package SortingSearching;

import java.util.Random;

public class InsertionSort 
{
	private static Random generator = new Random();
	
	public static void insertionSort(int[] a)
	{
		for (int i = 1; i < a.length; i++)
		{
			int key = a[i];
			int j = i-1;
			while (j > -1 && a[j] > key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
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
		int[] x = randomIntArray(5,100);
		insertionSort(x);
	}
}