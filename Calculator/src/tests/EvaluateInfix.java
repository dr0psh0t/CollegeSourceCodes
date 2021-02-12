package tests;
//import java.util.Scanner;

public class EvaluateInfix
{
	/*@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner con = new Scanner(System.in);

			System.out.print("Enter string: ");
			String infixExpr = con.nextLine().replaceAll(" ", "");
			
			//System.out.println(eval(infixExpr));
			eval(infixExpr);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
	private static void eval(String expr)
	{
		String[] operands = new String[2];
		String oprnd = "";
		
		char oprtr = 0;
		char elem = 0;
		char[] token = expr.toCharArray();
		
		int oprndCount = 0,
				arrayCount = 0,
				value = 0,
				len = token.length;
		
		if(token[0] == '-')
		{
			oprnd += token[0];
			value = 1;
			arrayCount = 1;
		}
		
		for(int i = value; i < len; i++)
		{
			arrayCount++;
			elem = token[i];
			if(elem == '+' || elem == '-' || elem == 'x' || elem == '/')
			{
				oprtr = elem;
				operands[oprndCount] = oprnd;
				oprnd = "";
				oprndCount++;
			}
			else
			{
				oprnd += elem;
				if(arrayCount == len)
					operands[oprndCount] = oprnd;
			}
		}
		
		System.out.println(operands[0]+oprtr+operands[1]);
		
		/*if(oprtr == '+')
			return Double.parseDouble(operands[0]) + Double.parseDouble(operands[1]);
		else if(oprtr == '-')
			return Double.parseDouble(operands[0]) - Double.parseDouble(operands[1]);
		else if(oprtr == 'x')
			return Double.parseDouble(operands[0]) * Double.parseDouble(operands[1]);
		else
			return Double.parseDouble(operands[0]) / Double.parseDouble(operands[1]);
	}*/
}
