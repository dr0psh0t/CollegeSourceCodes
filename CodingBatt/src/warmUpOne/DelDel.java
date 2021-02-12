package warmUpOne;
/*

Given a string, if the string "del" appears starting at index 1, 
return a string where that "del" has been deleted. Otherwise, 
return the string unchanged. 

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class DelDel 
{
	public static void main(String[] args) 
	{
		DelDel me = new DelDel();
		System.out.print(me.delDel("adedbc"));

	}
	
	public String delDel(String str)
	{
		if(!str.contains("del"))
			return str;
		else
		{
			String newStr = "";
			int x = 0;
			while(x <= str.length() - 1)
			{
				if(!((str.charAt(x) == 'd') && (str.charAt(x+1) == 'e') && (str.charAt(x+2) == 'l')))
				{
					newStr = newStr + str.charAt(x);
					x++;
				}
				else
					x = x + 3;
			}
			return newStr;
		}
	}
}
