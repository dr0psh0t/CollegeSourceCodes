package extraction;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExtractVowels {
	
	/*
	 * String string = "A really COOL string";
	 * string = string.replaceAll("[AaEeIiOoUu]", "");
	 * System.out.println(string);
	 */

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		String str;
		
		Scanner readFile = new Scanner(new FileReader("src/extraction/paragraph.txt"));
		
		while(readFile.hasNext())
		{
			str = readFile.nextLine().replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]|[\\s+]", "");
			System.out.println(str);
		}
		readFile.close();
	}
}