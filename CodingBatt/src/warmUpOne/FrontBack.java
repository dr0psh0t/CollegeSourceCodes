package warmUpOne;
/*
 Given a string, return a new string where the first and 
 last chars have been exchanged. 

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class FrontBack 
{
	public static void main(String[] args) 
	{
		FrontBack f = new FrontBack();
		System.out.print(f.frontBack("abc"));
	}
	
	public String frontBack(String str) 
	{
		if(str.length() > 0)
		{
			if(str.length() == 1)
				return str;
			else if(str.length() == 2)
			{
				String reverse = "";
				for(int i = 1; i >= 0; i--)
					reverse = reverse + str.charAt(i);
				return reverse;
			}
			else if(str.length() == 3)
			{
				String char1 = "", char2 = "", char3 = ""+str.charAt(1);
				char1 = ""+str.charAt(0);
				char2 = ""+str.charAt(str.length() - 1);
				return char2+char3+char1;
			}
			else
			{
				String char1 = "", char2 = "", char3 = "";
				char1 = ""+str.charAt(0);
				char2 = ""+str.charAt(str.length() - 1);
				
				for(int x = 1; x <= str.length() - 2; x++)
					char3 = char3 + str.charAt(x);
				return char2+char3+char1;
			}
		}
		else
			return str;
	}
}
