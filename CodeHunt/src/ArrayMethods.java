public class ArrayMethods 
{
	public static void main(String[] args)
	{
		int[] copy = method();
		print(copy, copy.length - 1, 0);
	}
	
	public static void print(int[] list, int limit, int start)
	{
		if(start <= limit)
		{
			System.out.print(list[start]+" ");
			print(list, limit, start+1);
		}
	}
	
	public static int[] method()
	{
		int[] a = {1,2,3,4,5};
		return a;
	}
}
