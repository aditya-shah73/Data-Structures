package Interview_Programs;

import java.util.*;
public class StackPostfix 
{
	public static int solution(String S) 
	{
		int sum = 0;
		Stack st = new Stack();
		for(int i=0; i<S.length(); i++)
		{
			char ch = S.charAt(i);
			if(ch >= '0' && ch <= '9')
			{
				st.push((int)(ch-'0'));  
			}
			else
			{
				int a = 0;
				int b = 0;
				try
				{
					 a = (int) st.pop();
					 b = (int) st.pop();
					 switch(ch)  
						{  
							case '+':
							{
								sum = a + b;  
								break;  
							}
							case '-':
							{
								sum = b - a;  
								break;  
							}
							case '*':
							{
								sum = a * b; 
								break;
							}
						 
						    case '/':
						    {
						    	sum = b / a;  
							    break;
						    }
						    default:
							{
								sum = 0;  
							}
						}  
				}
				catch(Exception e)
				{
					sum = -1;
				}
				st.push(sum);  
			}  
		}  
		sum = (int) st.pop();  
		return sum;
	}

	public static void main(String[] args)
	{
		String s = "11++";
		String s2 = "13+62*7+*";
		int b = solution(s2);
		System.out.println(b);
		int a = solution(s);
		System.out.println(a);
	}
}