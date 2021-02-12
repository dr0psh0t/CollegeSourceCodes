package arraymethod;
import java.util.*;

public class OneDimArrayMethods 
{
	@SuppressWarnings("resource")
	public static void fillArray(int[] list, int numOfElements)
	{
		Scanner console = new Scanner(System.in);
		for(int index = 0; index < numOfElements; index++)
			list[index] = console.nextInt();
	}
	
	public static void printArray(int[] list, int numOfElements)
	{
		for(int index = 0; index < numOfElements; index++)
			System.out.print(list[index] + " ");
	}
	
	public static int sumArray(int[] list, int numOfElements)
	{
		int sum = 0;
		for(int index = 0; index < numOfElements; index++)
			sum = sum + list[index];
		return sum;
	}
	
	public static int indexLargestElement(int[] list, int numOfElements)
	{
		int maxIndex = 0;
		for(int index = 1; index < numOfElements; index++)
		{
			if(list[maxIndex] < list[index])
				maxIndex = index;
		}
		return maxIndex;
	}
	
	public static void copyArray(int[] list1, int src, int[] list2, int tar, int numOfElements)
	{
		for(int index = src; index < numOfElements; index++)
		{
			list2[index] = list1[tar];
			tar++;
		}
	}
}
