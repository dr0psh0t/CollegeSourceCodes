package application.conversion;
import java.util.*;

public class InfixToPostfix {

	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		ClassInfix stack;
		
		System.out.print("Infix expression: ");
		String expr = console.nextLine();
		
		stack = new ClassInfix(includeSpaces(expr));
		
		stack.convertToPostfix();
		stack.print();
	}

	private static String includeSpaces(String str)
	{
		String newStr = "";
		
		for(int f = 0; f < str.length(); f++)
			newStr = newStr + str.charAt(f) + " ";
		
		return newStr;
	}
}
