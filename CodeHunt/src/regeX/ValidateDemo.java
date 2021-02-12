package regeX;

import java.util.ArrayList;

public class ValidateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> input = new ArrayList<String>();
		
		input.add("123-45-6789");	//	valid pattern
		input.add("9876-5-4321");	//	not valid
		input.add("987-65-4321 (attack)");	//	not valid
		input.add("987-65-4321 ");	//	not valid because of whitespace at the end
		input.add("192-83-7465");	//	valid pattern
		input.add("123-89-4567");
		
		for(String ssn : input)
		{
			if(ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$"))	//	or ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")
				System.out.println("Found good SSN: "+ssn);
		}
	}
/*
 * references: file:///R:/ZeroShiki/Site%20Tutorials/How-To_%20Regular%20Expressions%20in%20Java%20(Part%201).html
 */
}
