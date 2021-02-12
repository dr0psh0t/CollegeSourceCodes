package warmUpTwo;

/*
 * 
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo". 

stringBits("Hello") - "Hlo"
stringBits("Hi") - "H"
stringBits("Heeololeo") - "Hello"
 */

public class StringBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringBits("Hello"));
		System.out.println(stringBits("Hi"));
		System.out.println(stringBits("Heeololeo"));
		
		String to = "to";
		String get = "get";
		String her = "her";
		
		System.out.println(to.concat(get).concat(her));
	}

	public static String stringBits(String str)
	{
		if(str.isEmpty())
			return "";
		else
		{
			StringBuilder gh = new StringBuilder();
			for(int g = 0; g < str.length(); g = g + 2)
				gh.append(str.charAt(g));
			
			return gh.toString();
		}
	}
}
