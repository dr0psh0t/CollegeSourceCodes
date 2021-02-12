package application;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

import linkedLists.derivedStack.*;

public class PostfixCalculator
{
	static boolean expressionOk = true;
	static String strToken;
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String postFixExpr;
		LinkedStackClass stack = new LinkedStackClass();
		
		System.out.print("Input postfix expression separated by space: ");
		postFixExpr = console.nextLine();
		
		evaluateExpression(postFixExpr, stack);
		printResult(postFixExpr, stack);
	}
	
	public static void evaluateExpression(String expr, LinkedStackClass stack)
	{
		StringTokenizer tokenizer = new StringTokenizer(expr);
		strToken = tokenizer.nextToken();
		
		while(strToken.charAt(0) != '=')
		{
			if(Character.isDigit(strToken.charAt(0)))
			{
				int num = Integer.parseInt(strToken);
				stack.push(num);
			}
			else
			{
				char operator = strToken.charAt(0);
				evaluateOperation(operator, stack);
			}
			
			if(expressionOk)
				strToken = tokenizer.nextToken();
			else
			{
				//while(tokenizer.hasMoreTokens())
					//System.out.print(tokenizer.nextToken()+" ");
				strToken = "=";
			}
		}
	}
	
	public static void evaluateOperation(char operator, LinkedStackClass stack)
	{
		if(stack.isEmptyStack())
			expressionOk = false;
		else
		{
			int result = 0;
			int num2 = stack.top();
			stack.pop();
			
			if(stack.isEmptyStack())
			{
				System.out.print("Not enough operands.");
				expressionOk = false;
			}
			else
			{
				int num1 = stack.top();
				stack.pop();
				
				if(operator == '+')
					result = num1 + num2;
				else if(operator == '-')
					result = num1 - num2;
				else if(operator == '*')
					result = num1 * num2;
				else if(operator == '/')
					result = num1 / num2;
				else
					expressionOk = false;
				
				stack.push(result);
			}
		}
	}
	
	public static void printResult(String expr, LinkedStackClass stack)
	{
		if(expressionOk)
		{
			if(!stack.isEmptyStack())
			{
				DecimalFormat decimalFormat = new DecimalFormat(".##");
				double num = stack.top();
				stack.pop();
				
				if(stack.isEmptyStack())
					System.out.print(expr+" "+decimalFormat.format(num));
				else
					System.out.print("Too many operands.");
			}
			else
				System.out.print("Error in the expression: "+expr);
		}
		else
			System.out.print("Error in the expression: "+expr);
	}
}