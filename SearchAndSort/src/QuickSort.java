import java.util.*;

public class QuickSort 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayListClass list = new ArrayListClass(7);
		int[] num = new int[7];
		
		System.out.print("Input 6 numbers: \n");
		for(int i = 0; i < 6; i++)
		{
			num[i] = console.nextInt();
			list.insert(num[i]);
		}
		
		//long startTime = System.currentTimeMillis();
		
		System.out.print("\nUnpartitioned list: ");
		list.print();
		
		list.partitioned();
		System.out.print("\nPartitioned list: ");
		list.partitioned();
		list.print();
		list.theSublists();
		
	/*	long endTime = System.currentTimeMillis();
		System.out.print("Start time: "+startTime+"\nEnd time: "+endTime);
		System.out.print("\nMilliseconds: "+(endTime - startTime)); */
	}
}
