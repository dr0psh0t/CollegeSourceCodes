package warmUpOne;
/*
Given a non-empty string and an int n, return a new string where
the char at index n has been removed. The value of n will be a 
valid index of a char in the original string 
(i.e. n will be in the range 0..str.length()-1 inclusive). 

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
public class MissingChar 
{
	public static void main(String[] args) 
	{
		MissingChar m = new MissingChar();
		System.out.print(m.missingChar("kitten", 4));
	}

	public String missingChar(String str, int n) 
	{
		String str1 = "", str2 = "";
		for(int i = 0; i < n; i++)
			str1 = str1 + str.charAt(i);
		
		for(int x = n + 1; x <= str.length() - 1; x++)
			str2 = str2 + str.charAt(x);
		
		return str1+str2;
	}
}