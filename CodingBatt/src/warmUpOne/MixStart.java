package warmUpOne;
/*

Return true if the given string begins with "mix", 
except the 'm' can be anything, so "pix", "9ix" .. all count. 

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class MixStart 
{
	public static void main(String[] args) 
	{
		MixStart me = new MixStart();
		System.out.print(me.mixStart("ni"));
	}
	
	public boolean mixStart(String str) 
	{
		if(str.length() <= 2)
			return false;
		else
		{
			if(str.charAt(1) == 'i' && str.charAt(2) == 'x')
				return true;
			else
				return false;
		}
	}
}
