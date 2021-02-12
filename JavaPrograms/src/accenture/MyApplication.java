package accenture;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyApplication 
{
	LinkedList<String> strings;
	
	public MyApplication(String... strings){
		this.strings = new LinkedList<String>(Arrays.asList(strings));
	}
	
	public void execute(){
		reversePrint(strings);
	}
	
	private void reversePrint(LinkedList<String> list)
	{
		String string;
		
		try
		{
			string = list.removeFirst();
			reversePrint(list);
			System.out.println(string);
		}
		catch(NoSuchElementException e){
			// do nothing
		}
	}
	
	public static void main(String[] args) {
		new MyApplication("Zero", "One", "Two", "Three", null).execute();
	}
/*	Output:
		null
		Three
		Two
		One
		Zero
*/
}
