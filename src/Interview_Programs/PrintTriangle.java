package Interview_Programs;

import java.util.Scanner;

public class PrintTriangle 
{
	public static void main(String args[] ) throws Exception 
	{
		System.out.println("Enter Height: ");
		Scanner num = new Scanner(System.in);
		int h = num.nextInt();
		printStairs(h);

	}
	public static void printStairs(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int spaces =i;
			while(spaces<n)
			{
				System.out.print(" ");
				spaces++;
			}
			int counter = i;
			while(counter > 0)
			{
				System.out.print("#");
				counter--;
			}
			System.out.println();
		}
	}
}