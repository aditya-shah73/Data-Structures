package SortingSearching;
import java.util.Random;

public class MergeSort 
{
	public static int[] mergeSort(int[] a) 
	{
		if(a.length <= 1)
		{
			return null;
		}	
		
		int[] first = new int[a.length / 2];
		int[] second = new int[a.length - first.length];
		
		for(int i = 0; i < first.length; i++) 
		{
			first[i] = a[i];
		}
		
		for(int j = 0; j < second.length; j++) 
		{
			second[j] = a[first.length + j];
		}
		
		mergeSort(first);
		mergeSort(second);
		merge(first, second, a);
		return a;
	}

	private static void merge(int[] first, int[] second, int[] a) 
	{
		int iFirst = 0; 
		int iSecond = 0; 
		int j = 0; 

		while (iFirst < first.length && iSecond < second.length) 
		{
			if (first[iFirst] < second[iSecond]) 
			{
				a[j] = first[iFirst];
				iFirst++;
			}
			else
			{
				a[j] = second[iSecond];
				iSecond++;
			}
			j++;
		}
		while (iFirst < first.length) 
		{
			a[j] = first[iFirst];
			iFirst++;
			j++;
		}
		while (iSecond < second.length) 
		{
			a[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}
	
	private static Random generator = new Random();

	public static int[] randomIntArray(int length, int n)
	{
		int[] a = new int[length];
		System.out.println("Unsorted numbers \n");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = generator.nextInt(n);
			System.out.println(a[i]);
		}
		return a;
	}

	public static void main(String[] args)
	{
		int[] a = randomIntArray(5,100);
		mergeSort(a);
		System.out.println("\nSorted numbers \n");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}