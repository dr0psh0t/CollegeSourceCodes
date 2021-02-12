import java.util.*;

public class Search 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		try
		{
			System.out.print("Input array size: ");
			int size = console.nextInt();
		
			Random rand = new Random();
			ArrayListClass list = new ArrayListClass(size);
			int[] num = new int[size];
			
			for(int i = 0; i <= size - 1; i++)
			{
				num[i] = rand.nextInt(size) + 1;
				list.insert(num[i]);
			}
			System.out.print("\nUnorderred ");
			list.print();
			list.selectionSort();
			System.out.print("\nOrdered    ");
			list.print();
			System.out.print("\n"+list.isFull());
			
			System.out.print("\n\nInput a number to search: ");
			int search = console.nextInt();
			
			if(list.seqSearch(search) != -1)
			{
				System.out.print("Number "+search+" is found at location "+list.seqSearch(search));
				System.out.print("\nTotal list: "+list.listCount());
			}
			else
			{
				System.out.print("Number "+search+" didn't exist!");
				System.out.print("\nTotal list: "+list.listCount());
			}
		}
		catch(Exception e)
		{
			System.out.print("Input error. Try again.");
		}
	}
}
