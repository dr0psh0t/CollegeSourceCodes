import java.util.*;

public class Search
{
	static Scanner con = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num, count = 0, size;
		
		System.out.print("Input array size: ");
		size = con.nextInt();
		int[] list = new int[size];
		System.out.print("\nInput "+size+" numbers: \n");
		
		while(count < size)
		{
			list[count] = con.nextInt();
			count++;
		}
		System.out.print("\nList: ");
		
		for(int i = 0; i <= size - 1; i++)
			System.out.print(list[i]+" ");
		
		System.out.print("\n\nInput number to search: ");
		num = con.nextInt();
			
		int j;
		for(j = 0; j <= 4; j++)
		{
			if(list[j] == num)
				break;
		}		
		
		if(found(list, num))
			System.out.print("number "+num+" is found at location ["+j+"]");
		else
			System.out.print("number "+num+" didn't exist");
	}
	
	public static boolean found(int[] list, int num)
	{
		for(int i = 0; i <= 4; i++)
		{
			if(list[i] == num)
				return true;
		}
		return false;
	}

}