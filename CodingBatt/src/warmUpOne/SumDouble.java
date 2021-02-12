package warmUpOne;
/*
 * 
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum. 

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
public class SumDouble 
{
	public static void main(String[] args)
	{
		SumDouble ha = new SumDouble();
		System.out.print(ha.sumDouble(3, 2));
	}
	
	public int sumDouble(int a, int b) 
	{
		int c = a + b;
		if(a != b)
			return c;
		else
			return c * 2;
	}
}
