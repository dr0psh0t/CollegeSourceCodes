package chapterSix;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);
		
		String str1, str2;
		
		System.out.print("Enter first string: ");
		str1 = con.nextLine();
		
		System.out.print("Enter second string: ");
		str2 = con.nextLine();
		
		int val = str1.compareTo(str2);
		
		if(val >= 0)
			System.out.println(str1);
		else
			System.out.println(str2);
		
		con.close();
	}

}
