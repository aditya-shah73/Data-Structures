package Interview_Programs;

public class WordFrequency 
{
	public static int getFrequency(String[] book, String word) 
	{
		word = word.trim().toLowerCase();
		int count = 0;
		for (String w : book) 
		{
			if (w.trim().toLowerCase().equals(word)) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		String[] wordlist = {"hello", "world", "hello", "world", "hello", "world","hello", "world"};

		String[] words = {"hello", "world"};
		for (String word : words) 
		{
			System.out.println(word + ": " + getFrequency(wordlist, word));
		}
	}
}