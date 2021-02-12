import java.util.*;

public class Exercise4 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("Program exercise 4 uses Random-number generator to fill the desired length of the list.\nIt doesn't necessarily generate 1000 numbers to fill the array of 1000 elements(unless specified).\n\nArray size: 1000\n");
			System.out.print("Input list length: ");
			int length = console.nextInt();
			Random rand = new Random();
			ArrayListClass list = new ArrayListClass(1000);
			int[] num = new int[1000];
			
			int large = 0;
			for(int i = 0; i <= length - 1; i++)
			{
				num[i] = rand.nextInt(1000) + 1;
				list.insert(num[i]);
				large = list.largest(num[i], large);
			}
				
			System.out.print("\nUnorderred ");
			list.print();
			list.selectionSort();
			System.out.print("\nOrdered    ");
			list.print();
			System.out.print("\nLargest: "+large);
			System.out.print("\nFull list = "+list.isFull());
			
			System.out.print("\n\nInput a number to search: ");
			int search = console.nextInt();
			
			System.out.print("Input 1 for step c.i or 2 for step c.ii: ");
			int choice = console.nextInt();
			System.out.println();
			if(choice == 2)
			{
				if(length >= 15)
				{
					if(list.binarySearch(search) != -1)
					{
						System.out.print("Number "+search+" is found at location ["+list.seqSearch(search)+"]");
						System.out.print("\nTotal list: "+list.listCount()+"\nTotal binary comparisons: "+(list.totalBinaryComparison() - 2));
					}
					else
					{
						System.out.print("Number "+search+" didn't exist!");
						System.out.print("\nTotal list: "+list.listCount()+"\nTotal binary comparisons: "+(list.totalBinaryComparison() - 2));
					}
				}
				else
				{
					if(list.seqSearch(search) != -1)
					{
						System.out.print("Number "+search+" is found at location ["+list.seqSearch(search)+"]");
						System.out.print("\nTotal list: "+list.listCount());
					}
					else
					{
						System.out.print("Number "+search+" didn't exist!");
						System.out.print("\nTotal list: "+list.listCount());
					}
				}
			}
			else if(choice == 1)
			{
				if(list.binarySearch(search) != -1)
				{
					System.out.print("Number "+search+" is found at location ["+list.seqSearch(search)+"]");
					System.out.print("\nTotal list: "+list.listCount()+"\nTotal binary comparisons: "+(list.totalBinaryComparison() - 2));
				}
				else
				{
					System.out.print("Number "+search+" didn't exist!");
					System.out.print("\nTotal list: "+list.listCount()+"\nTotal binary comparisons: "+(list.totalBinaryComparison() - 2));
				}
			}
			else
				System.out.print("Conform to the choices!");
		}
		catch(Exception e)
		{
			System.out.print("Input error. Try again.");
		}
	}

}
