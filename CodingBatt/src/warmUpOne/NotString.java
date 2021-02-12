package warmUpOne;
/*
Given a string, return a new string where "not " has been added 
to the front. However, if the string already begins with "not", 
return the string unchanged. Note: use .equals() to compare 2 
strings. 

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class NotString 
{
	public static void main(String[] args) 
	{
		NotString n = new NotString();
		System.out.print(n.notString("candy"));
	}
	
	public String notString(String str) 
	{
		String not = "not", strNot = "";
		
		if(str.length() >= 3)
		{
			for(int i = 0; i <= 2; i++)
				strNot = strNot + str.charAt(i);
		}
		else
			return not+" "+str;
		
		if(not.equals(strNot))
			return str;
		else
			return not+" "+str;
	}
}
