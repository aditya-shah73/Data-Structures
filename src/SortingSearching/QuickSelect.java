package SortingSearching;
import java.util.Arrays;

public class QuickSelect 
{
	private static int partition(int a[],int p, int r)
	{
		int x = getPivotValue(a, p, r); //median of medians used as a pivot
		int i = p-1;

		for(int j = p; j <= r-1; j++)
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

	private static int getPivotValue(int a[], int p, int r)
	{
		if(r-p+1 <= 9)
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
			return a[a.length/2];
		}
		
		else
		{
			int temp[] = null;
			int medians[] = new int[(int)Math.ceil((double)(r-p+1)/5)];
			int medianIndex = 0;

			while(p <= r)
			{
				temp = new int[Math.min(5,r-p+1)];

				for(int j=0; j<temp.length && p <= r; j++)
				{
					temp[j] = a[p];
					p++;
				}
				Arrays.sort(temp);

				medians[medianIndex] = temp[temp.length/2];
				medianIndex++;
			}
			return getPivotValue(medians,0,medians.length-1);
		}
	}

	public static void quickSelect(int[] a, int p, int r)
	{
		if(p<r)
		{
			int q = partition(a,p,r);
			quickSelect(a,p,q-1);
			quickSelect(a,q+1,r);
		}
	}


	public static void main(String args[])
	{
		int nElements = 30;
		int arr[] = new int[nElements];

		for(int i=0;i<nElements;i++)
		{
			arr[i] = (int)(50 * Math.random());
		}

		System.out.print("Array");
		printArray(arr, 0, arr.length);
		quickSelect(arr, 0, arr.length-1);
		printArray(arr, 0, arr.length-1);
	}

	private static void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void printArray(int arr[],int low, int high)
	{
		System.out.print("[  ");
		for(int i=low;i<high;i++)
		{
			System.out.print(arr[i] + "  ");
		}
		System.out.println("]");
	}
}