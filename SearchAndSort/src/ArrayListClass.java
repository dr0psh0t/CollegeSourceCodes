public class ArrayListClass 
{
	int length, maxSize, comp2 = 1, comp1 = 1, totalComp, compare = 1, totalCompare;
	int[] list;
	
	public ArrayListClass(int size)
	{
		maxSize = size;
		length = 0;
		list = new int[maxSize];
	}
	
	public void insert(int item)
	{
			list[length] = item;
			length++;
	}
	
	public int largest(int first, int second)
	{
		if(first > second)
			return first;
		else
			return second;
	}
	
	public void insertAt(int index, int value)
	{
		if(list[index] == value)
			System.out.print("Cannot insert duplicates");
		else
		{
			length++;
			list[index] = value;
		}
	}// not yet correct. valid insertion only at first and last index
	
	public void remove(int item)
	{
		int i;
		for(i = 0; i <= length; i++)
		{
			if(list[i] == item)
			{
				System.out.print("Number "+list[i]+" is removed.");
				list[i] = 0;
				length--;
				break;
			}
		}
	}
	
	public int seqSearch(int searchItem)
	{
		int loc, count = 0;
		boolean found = false;
		
		for(loc = 0; loc < length; loc++)
		{
			if(list[loc] == searchItem)
			{
				count = loc;
				found = true;
				break;
			}
		}
		compare = count + 1;
		
		if(found)
			return loc;
		else
			return - 1;
	}
	
	public int binarySearch(int searchItem)
	{
		int mid = -1;
		int first = 0;
		int last = length - 1;
		boolean found = false;
		
		while(first <= last && !found)
		{
			mid = (first + last) / 2;
			if(list[mid] == searchItem)
			{
				comp1++;
				found = true;
			}
			else
			{
				comp2 = comp2 + 2;
				if((list[mid] - searchItem) > 0)
					last = mid - 1;
				else
				first = mid + 1;
			}
		}
		
		if(found)
			return mid;
		else
			return -1;
	}
	
	public int totalSequentialComparison(){
		return totalCompare = compare;
	}
	
	public int totalBinaryComparison(){
		return totalComp = comp2 + comp1;
	}
	
	public int minLocation(int first, int last)
	{
		int loc, minIndex;
		minIndex = first;
		
		for(loc = first + 1; loc <= last; loc++)
		{
			if((list[loc] - list[minIndex]) < 0)
				minIndex = loc;
		}
		return minIndex;
	}
	
	public void swap(int first, int second)
	{
		int temp;
		
		temp = list[first];
		list[first] = list[second];
		list[second] = temp; 
	}
	
	public void selectionSort()
	{
		int loc, minIndex;
		
		for(loc = 0; loc < length; loc++)
		{
			minIndex = minLocation(loc, length - 1);
			swap(loc, minIndex);
		}
	}
	
	public void insertionSort()
	{
		int unsortedIndex, location;
		int temp;
		
		for(unsortedIndex = 1; unsortedIndex < length; unsortedIndex++)
		{
			if(list[unsortedIndex] - list[unsortedIndex - 1] < 0)
			{
				temp = list[unsortedIndex];
				location = unsortedIndex;
				
				do
				{
					list[location] = list[location - 1];
					location--;
				}
				while(location > 0 && (list[location - 1] - temp) > 0);
				list[location] = temp;
			}
		}
	}
	
	public int noOfComparisons()
	{
		int comparisons;
		comparisons = length * (length - 1) / 2;
		return comparisons;
	}// for Selection Sort
	
	public int noOfSwaps()
	{
		int swaps;
		swaps = 3 * (length - 1);
		return swaps;
	}// for Selection Sort
	
	public int noOfComparison()
	{
		int temp, comparison;
		temp = power(length, 2);
		comparison = temp / 4;
		return comparison;
	}// for Insertion Sort(number of comparisons and swaps)
	
	public int power(int base, int exponent)
	{
		int power = 1;
		for(int i = 1; i <= exponent; i++)
			power = base * power;
		
		return power;
	}
	
	public boolean isEmpty(){
		return (length == 0);
	}
	
	public boolean isFull(){
		return (length == maxSize);
	}
	
	public int listCount(){
		return length;
	}
	
	public int partition(int list[], int first, int last)
	{
		int index, smallIndex, pivot;
		swap(first, (first + last) / 2);
		pivot = list[first];
		smallIndex = first;
		
		for(index = first + 1; index <= last; index++)
		{
			if((list[index] - pivot) < 0)
			{
				smallIndex++;
				swap(smallIndex, index);
			}
		}
		
		swap(first, smallIndex);
		return smallIndex;
	}
	
	public void print()
	{
		System.out.print("List: ");
		for(int i = 0; i <= maxSize - 1; i++)
		{
			if(list[i] != 0)		
				System.out.print(list[i]+" ");
		}
	}
	// unecessary methods below
	public int partitioned(){
		return partition(list, 0, length - 1);
	}
	
	public void theSublists()
	{
		int pivot = ((0 + maxSize - 1) / 2), i, j;
		
		System.out.print("\n\nLower sublist: ");
		for(i = 0; i < pivot; i++)
			System.out.print(list[i]+" ");
		
		System.out.print("\nPivot: "+list[pivot]);
		
		System.out.print("\nupper sublist: ");
		for(j = pivot + 1; j <= maxSize - 1; j++)
			System.out.print(list[j]+" ");
	}
}
