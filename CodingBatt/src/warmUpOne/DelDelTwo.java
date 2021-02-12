package warmUpOne;

public class DelDelTwo 
{
	public static void main(String[] args) 
	{
		DelDelTwo me = new DelDelTwo();
		System.out.print(me.delDel(""));
	}
	
	public String delDel(String str)
	{
		if(str.equals("del") || str.equals(""))
			return str;
		else if(!str.contains("del"))
			return str;
		else if(!((str.charAt(1) == 'd') && (str.charAt(2) == 'e') && (str.charAt(3) == 'l')))
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
