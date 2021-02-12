package problemFive;
import java.util.*;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input a word: ");
		String word = console.next();
		
		if(isPalindrome(word))
			System.out.print("The word is palindrome");
		else
			System.out.print("The word is not palindrome");		
	}
	
	public static boolean isPalindrome(String str)
	{
		boolean test = true;
		int len = str.length() - 1, start = 0;		
		int mid = len / 2;
		
		while(test && (start <= mid) && (len >= mid))
		{
			if(str.charAt(start) != str.charAt(len))
				test = false;
			
			start++;
			len--;
		}		
		return test;
	}

}
