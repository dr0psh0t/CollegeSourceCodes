package application.conversion;

import java.util.LinkedList;
import java.util.StringTokenizer;
	
public class ClassInfix
{
	private StringTokenizer tokenizer;
	private Node top;
	private String infixExpr;
	private LinkedList<Character> operators;
	
	public ClassInfix(String infixExpr)
	{
		tokenizer = new StringTokenizer(infixExpr + " ;");
		top = null;
		this.infixExpr = infixExpr + " ;";
		operators = new LinkedList<Character>();
	}
	
	//	the class Node
	private class Node
	{		
		char info;
		Node link;
		
		public Node(char info)
		{
			this.info = info;
			link = null;
		}
	}
	
	public void convertToPostfix()
	{
		String strToken = tokenizer.nextToken();
		
		while(strToken.charAt(0) != ';')
		{
			if(Character.isDigit(strToken.charAt(0)))
				push(strToken.charAt(0));
			else if(Character.isAlphabetic(strToken.charAt(0)))
				push(strToken.charAt(0));						//	push the token
			else if(strToken.charAt(0) == '(')
				operators.push(strToken.charAt(0));				//	push the left parenthesis to operators list
			else if(strToken.charAt(0) == ')')			//	if ')' is found
			{
				while(operators.peekFirst() != '(')
					push(operators.pollFirst());		//	push remaining operators
				
				operators.pollFirst();	// remove the '('
			}
			else if(strToken.charAt(0) == '+' || strToken.charAt(0) == '-' || strToken.charAt(0) == '*' || strToken.charAt(0) == '/')
			{
				if(operators.isEmpty())
					operators.push(strToken.charAt(0));
				else
				{
					char newOpr = strToken.charAt(0), prevOpr = operators.peekFirst();
					
					if(previousIsHigherOrEqual(prevOpr, newOpr))
					{
						push(operators.pollFirst());
						operators.push(newOpr);
					}
					else
						operators.push(newOpr);
					
					if(operators.size() > 1)
						secondCheckPrevious();
				}				
			}			
			strToken = tokenizer.nextToken();
		}//	end while
		
		while(!operators.isEmpty())
			push(operators.pollFirst());
	}//	end convertToPostfix
	
	private void secondCheckPrevious()
	{
		char newOpr = operators.pollFirst();
		char prevOpr = operators.pollFirst();
		
		if(previousIsHigherOrEqual(prevOpr, newOpr))
		{
			push(prevOpr);
			operators.push(newOpr);
		}
		else
		{
			operators.push(prevOpr);
			operators.push(newOpr);
		}
	}
	
	private boolean previousIsHigherOrEqual(char prevOpr, char newOpr)
	{
		if(prevOpr == newOpr)
			return true;
		else if((prevOpr == '*' || prevOpr == '/') && (newOpr == '-' || newOpr == '+'))
			return true;
		else if((prevOpr == '*' || prevOpr == '/') && (newOpr == '*' || newOpr == '/'))
			return true;
		else if((prevOpr == '-' || prevOpr == '+') && (newOpr == '*' || newOpr == '/'))
			return false;
		else if((prevOpr == '-' || prevOpr == '+') && (newOpr == '-' || newOpr == '+'))
			return true;
		else
			return false;
	}
	
	private void push(char item)
	{
		Node newNode = new Node(item);
		
		if(top == null)
			top = newNode;
		else
		{
			Node temp = top;
			top = newNode;
			top.link = temp;
		}
	}
	
	public void print()
	{
		String str = "";
		Node temp = top;
		
		while(temp != null)
		{
			str += temp.info;
			temp = temp.link;
		}
		
		StringBuilder strBuilder = new StringBuilder(str);
		System.out.print(strBuilder.reverse());
	}
	
	public String getInfix(){
		return infixExpr;
	}
}