package chapterFive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise5
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		String letters;
		
		HashMap<Character, Character> hashMap = new HashMap<>();

		hashMap.put('A', '2');
		hashMap.put('B', '2');
		hashMap.put('C', '2');
		hashMap.put('D', '3');
		hashMap.put('E', '3');
		hashMap.put('F', '3');
		hashMap.put('G', '4');
		hashMap.put('H', '4');
		hashMap.put('I', '4');
		hashMap.put('J', '5');
		hashMap.put('K', '5');
		hashMap.put('L', '5');
		hashMap.put('M', '6');
		hashMap.put('N', '6');
		hashMap.put('O', '6');
		hashMap.put('P', '7');
		hashMap.put('Q', '7');
		hashMap.put('R', '7');
		hashMap.put('S', '7');
		hashMap.put('T', '8');
		hashMap.put('U', '8');
		hashMap.put('V', '8');
		hashMap.put('W', '9');
		hashMap.put('X', '9');
		hashMap.put('Y', '9');
		hashMap.put('Z', '9');
		
		System.out.print("Enter 7 seven letters: ");
		
		letters = con.nextLine();
		
		letters = letters.replaceAll("\\s+", "");
		
		if(letters.length() > 7)
			letters = letters.substring(0, 7);
		
		letters = letters.toUpperCase();
		
		System.out.println(letters);
		
		char[] charArr = letters.toCharArray();
		
		ArrayList<Character> arr = new ArrayList<>();
		
		for(char ch : charArr)
			arr.add(hashMap.get(ch));
		
		arr.add(3, '-');
		charArr = null;
		
		for(char ch : arr)
			System.out.print(ch);
		
		con.close();
	}
}