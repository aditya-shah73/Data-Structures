package Interview_Programs;

import java.util.Scanner;

public class checkingPowerOfTwo 
{
	public static boolean isPowerOfTwo(int number)
	{
		boolean isPowerOfTwo = true;
		int reminder = 0;
		while(number > 1)
		{
			reminder = number % 2;
			if(reminder != 0)
			{
				isPowerOfTwo = false;
				break;
			}
			else
			{
				number = number / 2;
			}
		}
		return isPowerOfTwo;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number you want to check: ");
		int a = in.nextInt();
		System.out.println(isPowerOfTwo(a));
	}
}