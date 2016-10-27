package SortingSearching;

public class BinarySearch 
{
	public static int search1(int[] a, int low, int high, int value)
	{
		if (low <= high)
		{
			int mid = (low + high) / 2;  

			if (a[mid] == value)
			{
				return mid;
			}
			else if (a[mid] < value )
			{
				return search1(a, mid + 1, high, value);
			}
			else
			{
				return search1(a, low, mid - 1, value);
			}
		}
		else
		{
			return -1;
		}
	}
	
	public static boolean search2(int[] a, int value)
	{
		int low = 0;
		int high = a.length-1;
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(value == a[mid])
			{
				return true;
			}
			else if(value < a[mid])
			{
				high = mid -1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,5,7,8,9,24,34,56,78,97};
		int length = a.length;
		int result = search1(a,0,length,78);
		boolean res = search2(a,78);
		System.out.println(res);
		if (result >= 0)
		{
			result++;
			System.out.println("The number was found in the " + result + " position.");
		}
		else
		{
			System.out.println("Element not found.");
		}
	}
}