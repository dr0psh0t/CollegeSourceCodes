package arraymethod;

public class ArrayAsParameters 
{
	static final int ARRAY_SIZE = 10;
	public static void main(String[] args) 
	{
		int[] listA = new int[ARRAY_SIZE];
		int[] listB = new int[ARRAY_SIZE];
		
		System.out.print("listA elements: ");
		OneDimArrayMethods.printArray(listA, listA.length);
		System.out.println();
		
		System.out.print("Enter "+listA.length+" integers: ");
		OneDimArrayMethods.fillArray(listA, listA.length);
		System.out.println();
		
		System.out.print("After filling listA, the elements are: \n");
		OneDimArrayMethods.printArray(listA, listA.length);
		System.out.println();
		
		System.out.println("The sum of the elements of listA is: "+OneDimArrayMethods.sumArray(listA, listA.length));
		System.out.println("The position of the largest element in listA is: "+OneDimArrayMethods.indexLargestElement(listA, listA.length));
		System.out.println("The largest element in listA is: "+listA[OneDimArrayMethods.indexLargestElement(listA, listA.length)]);
		
		OneDimArrayMethods.copyArray(listA, 0, listB, 0, listA.length);
		
		System.out.print("After copying the elements of listA into listB\nlistB elements are: ");
		OneDimArrayMethods.printArray(listB, listB.length);
		System.out.println();
	}
}
