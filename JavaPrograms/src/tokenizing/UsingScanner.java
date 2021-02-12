package tokenizing;

import java.util.Scanner;

public class UsingScanner {

	/*
	 * This sample code shows how to split
	 * String value into tokens using Scanner.
	 * This program tokenize the input
	 * string base on the delimeter set by
	 * calling the useDelimiter method
	 */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//String input = "01-02-03-04656-Test";
		String text = "Washington is the U.S Capital. Barack is living there.";
		
		Scanner s = new Scanner(text);		
		s.useDelimiter("\\.");
		
		while(s.hasNext())
			System.out.println(s.next());
	}

}
