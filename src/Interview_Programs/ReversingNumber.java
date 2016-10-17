package Interview_Programs;

import java.util.Scanner;

public class ReversingNumber 
{
	public static int reverseNumber(int a)
	{
		int reverse = 0;
		while(a != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + a % 10;
			a = a/10;
		}
		return reverse;
	}
	
	public static void main(String[] args)
	{
		int a;
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		System.out.println("The reverse of the number is: " + reverseNumber(a));
	}
}