package warmUpOne;
/*
Given 2 int values, return true if one is negative 
and one is positive. Except if the parameter "negative" 
is true, then return true only if both are negative. 

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
posNeg(-5, -6, false) → false
 */
public class PosNeg 
{
	public static void main(String[] args) 
	{
		PosNeg p = new PosNeg();
		System.out.print(p.posNeg(-4, -5, false));
	}
	
	public boolean posNeg(int a, int b, boolean negative) 
	{
		if(!negative)
		{
			if((a < 0 && b > 0) || (a > 0 && b < 0))
				return true;
			else
				return false;
		}
		else
		{
			if((a < 0) && (b < 0))
				return true;
			else
				return false;
		}
	}
}
