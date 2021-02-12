package chapterSix;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner con = new Scanner(System.in);
		String str;
		
		System.out.print("Enter string: ");
		str = con.nextLine();
		
		StringBuilder sBuilder = new StringBuilder();
		char ch,
			chIndex;
		
		for(int v = 0; v < str.length(); ++v)
		{
			chIndex = str.charAt(v);
			ch = (Character.isLowerCase(chIndex) ? Character.toUpperCase(chIndex) : Character.toLowerCase(chIndex));
			sBuilder.append(ch);
		}
		
		System.out.println(sBuilder.toString());
		
		con.close();

	}

}
