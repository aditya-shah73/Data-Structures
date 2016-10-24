package Interview_Programs;

public class ImplementingDivision 
{
	public static void implementingDivision(int num, int divisor)
	{
		int factor = 0;
		int remainder = num;
		System.out.println("Number = " + num + " divisor = " + divisor);
		while(remainder >= divisor) 
		{
			remainder -= divisor;
			factor++;
		}
		System.out.println("Remainder = " + remainder + " Factor = " + factor );
	}
	
	public static void main(String[] args)
	{
		implementingDivision(12,2);
	}
}