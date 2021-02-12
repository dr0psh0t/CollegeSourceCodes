package testing;

import java.util.Iterator;
import java.util.LinkedList;

public class Test
{
	static LinkedList<Integer> num = new LinkedList<>();
	
	public static void main(String[] args)
	{
		int[] primNum = {0, 9, 8, 7, 6, 5, 4};
		
		addNum(primNum);
		
		// advanced for loop over collections
		for(Iterator<Integer> iterator = num.iterator(); iterator.hasNext();)
		{
			int integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		for(int i : num)
			System.out.println(i);
	}
	
	public static void addNum(int[] x)
	{
		for(int i : x)
			num.add(i);
	}
	
	public static void addNum(int x){
		num.add(x);
	}
}