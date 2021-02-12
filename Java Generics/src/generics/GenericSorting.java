package generics;

public class GenericSorting
{    
   public static void main(String[] args)
   {
	   GenericSorting ref = new GenericSorting();
	   
	   String[] strArray = {"Zebra", "Supernova", "Zazan", "Abandon", "Apple", "Village", "House"};
	   Integer[] intArray = {32, 55, 87, 13, 78, 96, 52, 48, 22, 11, 58, 66, 88, 45};
	   Double[] doubleArray = {4.4, 5.5, 2.2, 1.1, 3.3, 0.6123654};
	    
	   System.out.print("Unsorted elements:\n\n");
	   
	   ref.printStringArray(strArray);
	   ref.printIntegerArray(intArray);
	   ref.printDoublerArray(doubleArray); 
	   
	   System.out.println();
	   
/*	// ========== sorting all Object elements using selection sort =============
	   ref.selectionSort(strArray, strArray.length);
	   ref.selectionSort(intArray, intArray.length);
	   ref.selectionSort(doubleArray, doubleArray.length);
	// =========================================================================
*/
	// ========== sorting all Object elements using quick sort =============
	   ref.quickSort(strArray, 0, strArray.length - 1);
	   ref.quickSort(intArray, 0, intArray.length - 1);
	   ref.quickSort(doubleArray, 0, doubleArray.length - 1);
	// =====================================================================
	   
	   System.out.print("Sorted elements:\n\n");
	   
	   ref.printStringArray(strArray);
	   ref.printIntegerArray(intArray);
	   ref.printDoublerArray(doubleArray);
   }
   
   public void printStringArray(String[] strArray)
   {
/*	   for(int i = 0; i < strArray.length; i++)
		   System.out.print(strArray[i]+", ");
	   System.out.println();*/ // alternative loop
	   
	   for(String str : strArray)
		   System.out.print(str+" ");
	   System.out.println();
   }
   
   public void printIntegerArray(Integer[] intArray)
   {
	   for(int i = 0; i < intArray.length; i++)
		   System.out.print(intArray[i]+", ");
	   System.out.println();
   }
   
   public void printDoublerArray(Double[] doubleArray)
   {
	   for(int i = 0; i < doubleArray.length; i++)
		   System.out.print(doubleArray[i]+", ");
	   System.out.println();
   }
   
// ============================== QUICK SORT ALGORITHM ====================================  
   public <E extends Comparable<E>> void quickSort(E[] list, int first, int last){
	   recQuickSort(list, first, last);
   }
   
   // recursive implementation of quick sorting
   private <E extends Comparable<E>> void recQuickSort(E[] list, int first, int last)
   {
	   int pivotLocation;
	   if(first < last)
	   {
		   pivotLocation = partition(list, first, last);
		   recQuickSort(list, first, pivotLocation - 1);
		   recQuickSort(list, pivotLocation + 1, last);
	   }
   }
   
   // method to partition the array into lower and upper sublists
   private <E extends Comparable<E>> int partition(E[] list, int first, int last)
   {
	   E pivot;
	   int index, smallIndex;
	   
	   swap(list, first, (first + last) / 2);
	   pivot = list[first];
	   smallIndex = first;
	   
	   for(index = first + 1; index <= last; index++)
	   {
		   if((list[index].compareTo(pivot)) < 0)
		   {
			   smallIndex++;
			   swap(list, smallIndex, index);
		   }
	   }
	   
	   swap(list, first, smallIndex);
	   return smallIndex;
   }
   
   // method to swap array positions
   private <E extends Comparable<E>> void swap(E[] list, int first, int second)
   {
	   E temp;
	   
	   temp = list[first];
	   list[first] = list[second];
	   list[second] = temp;
   }
// ============================== QUICK SORT ALGORITHM ====================================     
   
// ============================ SELECTION SORT ALGORITHM ================================== 
   // generic method to sort array elements of any type
   public <E extends Comparable<E>> void selectionSort(E[] list, int listLength)
   {
      int index;
      int minIndex;
      int smallestIndex;
      E temp;
      
      for(index = 0; index < listLength - 1; index++)
      {
         smallestIndex = index;
         for(minIndex = index + 1; minIndex < listLength; minIndex++)
         {
            if((list[minIndex].compareTo(list[smallestIndex])) < 0)
               smallestIndex = minIndex;
         }
         
         temp = list[smallestIndex];
         list[smallestIndex] = list[index];
         list[index] = temp;
      }
   }
// ============================ SELECTION SORT ALGORITHM ================================== 
}
