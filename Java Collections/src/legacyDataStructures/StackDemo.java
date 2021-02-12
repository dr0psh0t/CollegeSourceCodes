package legacyDataStructures;

import java.util.*;

public class StackDemo 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void showPush(Stack st, int a)
	{
		st.push(new Integer(a));
		System.out.println("push("+a+")");
		System.out.println("Stack: "+st);
	}
	
	@SuppressWarnings("rawtypes")
	static void showPop(Stack st)
	{
		System.out.print("Pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: "+st);
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Stack st = new Stack();
		System.out.println("stack: "+st);
		
		showPush(st, 42);
		showPush(st, 66);
		showPush(st, 99);
		
		showPop(st);
		showPop(st);
		showPop(st);
		
		try{
			showPop(st);
		}
		catch(EmptyStackException e){
			System.out.println("empty stack");
		}
	}
}