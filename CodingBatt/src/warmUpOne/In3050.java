package warmUpOne;

public class In3050 
{
	public static void main(String[] args) 
	{
		In3050 in = new In3050();
		
		System.out.print(in.in3050(30, 31)+"\n");
		System.out.print(in.in3050(30, 41)+"\n");
		System.out.print(in.in3050(40, 50));
	}
	
	public boolean in3050(int a, int b)
	{
		if((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
			return true;
		else if((a >= 40 && a <= 50) && (b >= 40 && b <= 50))
			return true;
		else
			return false;
	}
}