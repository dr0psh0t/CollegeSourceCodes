import java.util.*;

public class InsertionSort 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			ArrayListClass list = new ArrayListClass(1000);

			System.out.print("********** Insertion Sort **********\n\n");
			System.out.print("Input list length(1-1000): ");
			int length = console.nextInt();
			
			if(length > 1000)
			{
				System.out.print("Overflow");
				System.out.print("\n\n********** End of program **********");
				System.exit(0);
			}
			else if(length <= 0)
			{
				System.out.print("Underflow");
				System.out.print("\n\n********** End of program **********");
				System.exit(0);
			}
			
			Random rand = new Random();
			int[] num = new int[1000];
			
			for(int i = 0; i <= length - 1; i++)
			{
				num[i] = rand.nextInt(1000) + 1;
				list.insert(num[i]);
			}
			
			System.out.print("\nUnorderred ");
			list.print();
			list.selectionSort();
			System.out.print("\nOrdered    ");
			list.print();
			System.out.print("\nFull list = "+list.isFull());
			System.out.print("\n\nAmount of time it takes to sort:\nNumber of comparisons: "+list.noOfComparison()+"\nNumber of swaps: "+list.noOfComparison());
			System.out.print("\n\n********** End of program **********");
		}
		catch(Exception e){
			System.out.print("\nInput error.\n\n********** End of program **********");
		}
	}
}
