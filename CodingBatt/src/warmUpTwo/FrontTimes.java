package warmUpTwo;

/*
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front; 

frontTimes("Chocolate", 2) - "ChoCho"
frontTimes("Chocolate", 3) - "ChoChoCho"
frontTimes("Abc", 3) - "AbcAbcAbc"
 */

public class FrontTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontTimes("Chocolate", 2));
		System.out.println(frontTimes("Chocolate", 3));
		System.out.println(frontTimes("Abc", 3));
		System.out.println(frontTimes("Ab", 4));
		System.out.println(frontTimes("A", 4));
		System.out.println(frontTimes("Abc", 0));
	}

	public static String frontTimes(String str, int n)
	{
		if(n < 1)
			return "";
		else if(str.isEmpty())
			return "";
		else if(str.length() < 3)
		{
			String newStr = str.substring(0, str.length());
			
			StringBuilder ghj = new StringBuilder();
			for(int x = 0; x < n; ++x)
				ghj.append(newStr);
			
			return ghj.toString();
		}
		else
		{
			String newStr = str.substring(0, 3);
			
			StringBuilder ghj = new StringBuilder();
			for(int x = 0; x < n; ++x)
				ghj.append(newStr);
			
			return ghj.toString();
		}
	}
}
