import java.util.*;

public class RemoveAList 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("Array size: 15\n");
			System.out.print("Input list length: ");
			int length = console.nextInt();
			
			Random rand = new Random();
			ArrayListClass list = new ArrayListClass(15);
			int[] num = new int[15];

			int large = 0;
			for(int i = 0; i <= length - 1; i++)
			{
				num[i] = rand.nextInt(15) + 1;
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
			
			System.out.println();
			
			if(length >= 10)
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

			System.out.print("\n\nInput number to remove: ");
			int remove = console.nextInt();
			System.out.println();
			list.remove(remove);
			System.out.println();
			list.print();
			System.out.print("\n\nInput the index and number to insert: \nIndex: ");
			int index = console.nextInt();
			System.out.print("Value to be inserted: ");
			int value = console.nextInt();
			list.insertAt(index, value);
			System.out.println();
			list.print();
		}
		catch(Exception e)
		{
			System.out.print("Input error. Try again.");
		}
	}
}
