package warmUpOne;
/*
Given a string, we'll say that the front is the first 3 chars of 
the string. If the string length is less than 3, the front is 
whatever is there. Return a new string which is 3 copies of 
the front. 

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */
public class FrontThree 
{
	public static void main(String[] args) 
	{
		FrontThree f = new FrontThree();
		System.out.print(f.front3("Chocolate"));
	}
	
	public String front3(String str) 
	{
		String firstThree = "", returnedStr = "";
		if(str.length() >= 3)
		{
			for(int x = 0; x <= 2; x++)
				firstThree = firstThree + str.charAt(x);
			
			for(int j = 0; j <= 2; j++)
				returnedStr = returnedStr + firstThree;
			return returnedStr;
		}
		else
		{
			for(int x = 0; x <= 2; x++)
				returnedStr = returnedStr + str;
			return returnedStr;
		}
	}
}
