public class Recursion 
{
	public static void main(String[] args) 
	{
		int[] list = new int[20];
		int j = 0;
		
		for(int i = 1; i <= 10; i = i + 1)
		{
			list[j] = i;
			j++;
		}
		
		System.out.print("numbers: ");
		for(int i = 0; i <= 10 - 1; i++)
			System.out.print(list[i]+" ");
		
		System.out.print("\nSum: "+sum(list, 0, 9));
	}
	
	public static int sum(int list[], int first, int last)
	{
		int total, temp;
		if(first == last)
			return list[first];
		else
		{
			temp = sum(list, first + 1, last);
			total = temp + list[first];
			return total;
		}
	}
}
