package warmUpOne;
/*
Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' and include the second 
only if it is 'z', so "ozymandias" yields "oz". 

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
public class StartOz 
{
	public static void main(String[] args) 
	{
		StartOz me = new StartOz();
		System.out.print(me.startOz("oz"));
	}
	
	public String startOz(String str) 
	{
		String newStr = "";
		if(str.length() <= 2)
		{
			if(str.equals(""))
				return "";
			else if(str.equals("oz"))
				return "oz";
			else if(str.charAt(0) == 'o')
				return "o";
			else
				return "";
		}
		else
		{
			for(int x = 0; x <= 1; x++)
				newStr += str.charAt(x);
			
			if(newStr.contains("oz"))
				return "oz";
			else if(newStr.contains("z"))
			{
				if(newStr.charAt(1) == 'z')
					return "z";
				else
					return "";
			}
			else if(newStr.contains("o"))
			{
				if(newStr.charAt(0) == 'o')
					return "o";
				else
					return "";
			}
			else
				return "";
		}
	}
}
