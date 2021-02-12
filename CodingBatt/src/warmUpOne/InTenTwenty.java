package warmUpOne;
/*
Given 2 int values, return true if either of them is in 
the range 10..20 inclusive. 

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
public class InTenTwenty
{
	public static void main(String[] args) 
	{
		InTenTwenty o = new InTenTwenty();
		System.out.print(o.in1020(8, 99));
	}
	
	public boolean in1020(int a, int b) 
	{
		if((a >= 10 && a <= 20) || (b >= 10 && b <= 20))
			return true;
		else
			return false;
	}
}