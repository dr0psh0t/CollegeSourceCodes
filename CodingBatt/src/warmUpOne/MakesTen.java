package warmUpOne;
/*
Given 2 ints, a and b, return true 
if one of them is 10 or if their sum is 10. 

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */
public class MakesTen
{
	public static void main(String[] args) 
	{
		MakesTen ten = new MakesTen();
		System.out.print(ten.makes10(5, 5));
	}
	
	public boolean makes10(int a, int b) 
	{
		if(a == 10 || b == 10)
			return true;
		else if((a + b) == 10)
			return true;
		else
			return false;
	}
}