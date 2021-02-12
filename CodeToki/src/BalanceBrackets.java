import java.util.*;

public class BalanceBrackets 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String parentheses, open = "", close = "";
		System.out.print("Input a string of parentheses: ");
		//parentheses = console.next();
		parentheses = "([)]";
		int openCurl = 0, closedCurl = 0, openCurve = 0, closedCurve = 0, openSquare = 0, closedSquare = 0; 
		
		if(isClose(parentheses.charAt(0)))
			System.out.print("Closing mark in the first character\nNot balanced");
		else
		{
			if(parentheses.length() < 2)
				System.out.print("One character "+parentheses+" is not balanced");
			else
			{
					int i;
					for(i = 0; i <= parentheses.length() - 1; i++)
					{
						if(isOpen(parentheses.charAt(i)))
							open = open + parentheses.charAt(i);
						else
							close = close + parentheses.charAt(i);
						
						switch(parentheses.charAt(i))
						{
						case '(': openCurve++;
							break;
						case ')': closedCurve++;
							break;
						case '{': openCurl++;
							break;
						case '}': closedCurl++;
							break;
						case '[': openSquare++;
							break;
						case ']': closedSquare++;
						default: continue;
						}
					}
					System.out.print(open);
					System.out.print("  "+close);
					
					System.out.println();
					if(openCurve == closedCurve && openCurl == closedCurl && openSquare == closedSquare)
						System.out.print("Balanced");
					else
						System.out.print("Not balanced");
			}
		}
	}
	
	public static boolean opposite(char x, char y)
	{
		if(x == '(' && y == ')')
			return true;
		else if(x == '{' && y == '}')
			return true;
		else if(x == '[' && y == ']')
			return true;
		else
			return false;
	}
	
	public static boolean isOpen(char p)
	{
		if(p == '(' || p == '{' || p == '[')
			return true;
		else
			return false;
	}
	
	public static boolean isClose(char p)
	{
		if(p == ')' || p == '}' || p == ']')
			return true;
		else
			return false;
	}
}
