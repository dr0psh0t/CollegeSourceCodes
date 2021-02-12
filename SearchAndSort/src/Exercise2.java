import java.util.*;

public class Exercise2 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		try
		{
			System.out.print("***** Binary Search *****\n");
			System.out.print("Array size must be >= to list length\n\n");
			System.out.print("Input array size: ");
			int size = console.nextInt();
			
			OrderedArrayList list = new OrderedArrayList(size);
			
			System.out.print("Input list length: ");
			int num = console.nextInt();
			System.out.print("\nFull list = "+list.isFull()+"  Empty list = "+list.isEmpty()+"\n\n");
			System.out.println("Input "+num+" numbers: ");
			
			int input;
			for(int i = 0; i <= num - 1; i++)
			{
				input = console.nextInt();
				list.insert(input);
			}
			
			System.out.println();
			System.out.print("Unordered ");
			list.print();
			list.selectionSort();
			System.out.print("\nOrdered   ");
			list.print();
			System.out.print("\nFull list = "+list.isFull()+"  Empty list = "+list.isEmpty());
			
			System.out.print("\n\nInput a number to search: ");
			int search = console.nextInt();
			
			if(list.binarySearch(search) != -1)
			{
				System.out.print("Number "+search+" is found at location ["+list.binarySearch(search)+"]");
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
