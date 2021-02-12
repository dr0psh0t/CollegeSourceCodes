public class OrderedArrayList 
{
	int length;
	int maxSize;
	int[] list;
	
	public OrderedArrayList(int size)
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
	
	public int seqSearch(int searchItem)
	{
		int loc;
		boolean found = false;
		
		for(loc = 0; loc < length; loc++)
		{
			if(list[loc] == searchItem)
			{
				found = true;
				break;
			}
		}
		
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
				found = true;
			else if((list[mid] - searchItem) > 0)
				last = mid - 1;
			else
				first = mid + 1;
		}
		
		if(found)
			return mid;
		else
			return -1;
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
	
	public boolean isEmpty()
	{
		return (length == 0);
	}
	
	public boolean isFull()
	{
		return (length == maxSize);
	}
	
	public int listCount()
	{
		return length;
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
}
