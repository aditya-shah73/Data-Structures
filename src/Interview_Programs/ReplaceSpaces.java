package Interview_Programs;

public class ReplaceSpaces 
{
	public static void replaceSpaces(char[] str, int length)
	{
		int spaceCount = 0, newLength = 0, i = 0;

        for(i = 0; i < length; i++) 
        {
            if (str[i] == ' ') 
                spaceCount++;
        }
        newLength = length + (spaceCount * 2);
        str[newLength] = '\0';
        for(i = length - 1; i >= 0; i--) 
        {
            if (str[i] == ' ') 
            {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else 
            {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(str);
    }
	
	public static void main(String[] args)
	{
		char[] ch = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' '};
        int length = 7;
		replaceSpaces(ch,length);
	}
}