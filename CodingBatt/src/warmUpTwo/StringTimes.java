package warmUpTwo;

/*
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string. 

stringTimes("Hi", 2) - "HiHi"
stringTimes("Hi", 3) - "HiHiHi"
stringTimes("Hi", 1) -→ "Hi"
 */

public class StringTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringTimes("Hi", 0));
	}

	public static String stringTimes(String str, int n)
	{
		if(n < 1)
			return "";
		
		StringBuilder ghj = new StringBuilder();
		for(int x = 0; x < n; ++x)
			ghj.append(str);
		
		return ghj.toString();
	}

}
