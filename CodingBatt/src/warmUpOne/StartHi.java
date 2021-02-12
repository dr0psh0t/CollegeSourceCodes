package warmUpOne;
/*
Given a string, return true if the string starts with "hi" 
and false otherwise. 

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartHi 
{
	public static void main(String[] args) 
	{
		StartHi hi = new StartHi();
		System.out.print(hi.startHi(""));
	}
	
	public boolean startHi(String str) 
	{
		String hi = "";
		if(str.length() >= 2)
		{
			for(int x = 0; x <= 1; x++)
				hi = hi + str.charAt(x);
			
			if(hi.equals("hi"))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}
