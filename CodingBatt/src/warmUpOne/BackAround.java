package warmUpOne;
/*
 Given a string, take the last char and return a new string 
 with the last char added at the front and back, so "cat" 
 yields "tcatt". The original string will be length 1 or more. 

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
public class BackAround 
{
	public static void main(String[] args) 
	{
		BackAround b = new BackAround();
		System.out.print(b.backAround("cat"));
	}
	
	public String backAround(String str)
	{
		if(str.length() >= 1)
		{
			String strLast = ""+str.charAt(str.length() - 1), newStr = str;
			return strLast+newStr+strLast;
		}
		else
			return str;
	}
}
