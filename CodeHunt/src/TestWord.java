import java.util.*;

public class TestWord 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		QueueMethods node = new QueueMethods(30);
		String word;
		
		System.out.print("Input a word(small case): ");
		word = console.next();
		
		if(node.isPalindrome(word))
			System.out.print("Word is palindrome\n\n");
		else
			System.out.print("Word is not palindrome\n\n");
		
		for(int i = 0; i <= word.length() - 1; i++)
			node.insert(word.charAt(i));
		
		node.displayUpperCase(word);
		System.out.println();
		node.displayQueues();
	}
}
