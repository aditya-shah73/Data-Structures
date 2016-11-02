package SortingSearching;
import java.util.Random;

public class QuickSort 
{
	public static void quickSort(int[] a, int p, int r)
	{
		if(p<r)
		{
			int q=partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
	}

	private static int partition(int[] a, int p, int r) 
	{
		int x = a[r];
		int i = p-1;
		for(int j = p; j <= r-1 ;j++)
		{
			if(a[j] <= x)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		return i+1;
	}

	private static void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static Random generator = new Random();

	public static int[] randomIntArray(int length)
	{
		int[] a = new int[length];
		for(int j = 0; j< a.length; j++)
		{
			a[j] = generator.nextInt(100);
		}
		return a;
	}

	public static void main(String[] args) 
	{
		int a[]= randomIntArray(10);
		System.out.println("The original array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		quickSort(a, 0, a.length - 1);
		System.out.println();
		System.out.println("The sorted array is:");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}