package controller;

import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllCalc
{
	@FXML
	private TextField exprField;
	
	private String field = "";
	
	private boolean oprClicked = false,
			expr_OprOne = false,
			dotClicked = false;
	
	private int oprtrCount = 0;
	
	@FXML
	private void initialize(){}
	
	@FXML
	private void plusEvent()
	{
		expr_OprOne = true;
		if(!oprClicked)
		{
			oprtrCount++;			
			if(oprtrCount == 2)
			{
				equalEvent();
				field = exprField.getText() + '+';
				exprField.setText(field);
				oprtrCount = 1;
				oprClicked = expr_OprOne = true;
			}
			else
			{
				if(!oprClicked)
				{
					field = exprField.getText();
					if(field.equals("0") || field.equals("0.00"))
						exprField.setText("0+");
					else
						exprField.setText(field+'+');
					oprClicked = true;
				}
			}
			dotClicked = false;
		}
	}
	
	@FXML
	private void minusEvent()
	{
		expr_OprOne = true;
		if(!oprClicked)
		{
			oprtrCount++;			
			if(oprtrCount == 2)
			{
				equalEvent();
				field = exprField.getText() + '-';
				exprField.setText(field);
				oprtrCount = 1;
				oprClicked = expr_OprOne = true;
			}
			else
			{
				if(!oprClicked)
				{
					field = exprField.getText();
					if(field.equals("0") || field.equals("0.00"))
						exprField.setText("0-");
					else
						exprField.setText(field+'-');
					oprClicked = true;
				}
			}
			dotClicked = false;
		}
	}
	
	@FXML
	private void timesEvent()
	{
		expr_OprOne = true;
		if(!oprClicked)
		{
			oprtrCount++;			
			if(oprtrCount == 2)
			{
				equalEvent(); field = exprField.getText() + 'x';
				exprField.setText(field); oprtrCount = 1;
				oprClicked = expr_OprOne = true;
			}
			else
			{
				if(!oprClicked)
				{
					field = exprField.getText();
					if(field.equals("0") || field.equals("0.00"))
						exprField.setText("0x");
					else
						exprField.setText(field+'x');
					oprClicked = true;
				}
			}
			dotClicked = false;
		}
	}
	
	@FXML
	private void divideEvent()
	{
		expr_OprOne = true;
		if(!oprClicked)
		{
			oprtrCount++;			
			if(oprtrCount == 2)
			{
				equalEvent();
				field = exprField.getText() + '/';
				exprField.setText(field);
				oprtrCount = 1;
				oprClicked = expr_OprOne =true;
			}
			else
			{
				if(!oprClicked)
				{
					field = exprField.getText();
					if(field.equals("0") || field.equals("0.00"))
						exprField.setText("0/");
					else
						exprField.setText(field+'/');
					oprClicked = true;
				}
			}
			dotClicked = false;
		}
	}
	
	@FXML
	private void backEvent()
	{
		field = exprField.getText();
		if(field.equals("0") || field.equals("0.00"))
			clearEvent();
		else
		{
			String newField = "";			
			if(field.length() == 1)
				clearEvent();
			else
			{
				newField = field.substring(0, field.length() - 1);
				exprField.setText(newField);
				
				if(newField.endsWith("."))
					dotClicked = true;
				else if(newField.endsWith("+") || newField.endsWith("-") ||
						newField.endsWith("x") || newField.endsWith("/"))
					oprClicked = expr_OprOne = true;
				else
				{
					oprClicked = expr_OprOne = false;
					if(oprClicked)
						dotClicked = true;
				}
			}
		}
	}
	
	@FXML
	private void clearEvent()
	{
		exprField.setText("0");
		field = "";
		oprClicked = expr_OprOne = dotClicked = false;
		oprtrCount = 0;
	}
	
	@FXML
	private void dotEvent()
	{
		field = exprField.getText();		
		oprClicked = false;
		
		if(field.equals("0") || field.equals("0.00"))
		{
			exprField.setText("0.");
			dotClicked = true;
		}
		else if(!dotClicked)
		{
			if(field.endsWith("+") || field.endsWith("-") ||
					field.endsWith("x") || field.endsWith("/"))
				exprField.setText(field + "0.");
			else
				exprField.setText(field + ".");
			dotClicked = true;
		}
	}
	
	@FXML
	private void equalEvent()
	{
		dotClicked = true;
		if(expr_OprOne && !oprClicked)
		{
			oprtrCount = 0;
			String expr = exprField.getText();
			exprField.setText(eval(expr));
			expr_OprOne = false;
		}
	}
	
	@FXML
	private void oneEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("1");
		else
			exprField.setText(field + "1");
	}
	
	@FXML
	private void twoEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("2");
		else
			exprField.setText(field + "2");
	}
	
	@FXML
	private void threeEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("3");
		else
			exprField.setText(field + "3");
	}
	
	@FXML
	private void fourEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("4");
		else
			exprField.setText(field + "4");
	}
	
	@FXML
	private void fiveEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("5");
		else
			exprField.setText(field + "5");
	}
	
	@FXML
	private void sixEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("6");
		else
			exprField.setText(field + "6");
	}
	
	@FXML
	private void sevenEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("7");
		else
			exprField.setText(field + "7");
	}
	
	@FXML
	private void eightEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("8");
		else
			exprField.setText(field + "8");
	}
	
	@FXML
	private void nineEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("9");
		else
			exprField.setText(field + "9");
	}
	
	@FXML
	private void zeroEvent()
	{
		oprClicked = false;
		field = exprField.getText();
		
		if(field.equals("0") || field.equals("0.00"))
			exprField.setText("0");
		else
			exprField.setText(field + "0");
	}
	
	private String eval(String expr)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
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
		
		if(oprtr == '+')
			return df.format(Double.parseDouble(operands[0]) + Double.parseDouble(operands[1]));
		else if(oprtr == '-')
			return df.format(Double.parseDouble(operands[0]) - Double.parseDouble(operands[1]));
		else if(oprtr == 'x')
			return df.format(Double.parseDouble(operands[0]) * Double.parseDouble(operands[1]));
		else
			return df.format(Double.parseDouble(operands[0]) / Double.parseDouble(operands[1]));
	}
}