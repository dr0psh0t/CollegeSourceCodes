package lists.ArrayList.ArrayListBasics.LoopArrayList;
import java.util.*;

public class LoopExample 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(14);
		arrList.add(7);
		arrList.add(39);
		arrList.add(40);
		
		// for loop for iteration
		System.out.println("For Loop");
		for(int counter = 0; counter < arrList.size(); counter++)
			System.out.println(arrList.get(counter));
		
		// advanced for loop
		System.out.println("advanced For Loop");
		for(Integer num: arrList)
			System.out.println(num);
		
		// while loop for iteration
		System.out.println("while Loop");
		int count = 0;
		
		while(arrList.size() > count)
		{
			System.out.println(arrList.get(count));
			count++;
		}
		
		// looping using Iterator
		System.out.println("Iterator");
		Iterator iter = arrList.iterator(); // Interface Iterator<E>
		
		while(iter.hasNext())
			System.out.println(iter.next());  // next() Returns the next element in the iteration
	}
}