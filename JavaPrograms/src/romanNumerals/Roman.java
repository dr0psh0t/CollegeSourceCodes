package romanNumerals;

public class Roman
{
	private String romanNumber;
	private char[] remaining;
	private int decimal;
	
	public Roman()
	{
		romanNumber = "";
		decimal = 0;
		remaining = new char[15];
		copyToCharArray();
	}
	
	public Roman(String romanNumber)
	{
		this.romanNumber = romanNumber;
		decimal = 0;
		remaining = new char[15];
		copyToCharArray();
	}
	
	public void setRomanNumber(String romanNumber)
	{
		this.romanNumber = romanNumber;
		copyToCharArray();
	}
	
	public int getDecimal()
	{
		romanToDecimal();
		return decimal;
	}
	
	private void romanToDecimal()
	{
		int total = 0;
		containsLess();
		
		for(int x = 0; x <= remaining.length - 1; x++)
		{
			if(remaining[x] == 'M')
				total += 1000;
			else if(remaining[x] == 'D')
				total += 500;
			else if(remaining[x] == 'C')
				total += 100;
			else if(remaining[x] == 'L')
				total += 50;
			else if(remaining[x] == 'X')
				total += 10;
			else if(remaining[x] == 'V')
				total += 5;
			else if(remaining[x] == 'I')
				total += 1;
			else
				;
		}		
		decimal += total;
	}
	
	private void containsLess()
	{
		int total = 0;
		
		if(romanNumber.contains("CM"))
		{
			total += 900;
			replaceChars('C', 'M');
		}
		
		if(romanNumber.contains("CD"))
		{
			total += 400;
			replaceChars('C', 'D');
		}
		
		if(romanNumber.contains("XC"))
		{
			total += 90;
			replaceChars('X', 'C');
		}
		
		if(romanNumber.contains("XL"))
		{
			total += 40;
			replaceChars('X', 'L');
		}
		
		if(romanNumber.contains("IX"))
		{
			total += 9;
			replaceChars('I', 'X');
		}
		
		if(romanNumber.contains("IV"))
		{
			total += 4;
			replaceChars('I', 'V');
		}
		
		decimal = total;
	}
	
	private void copyToCharArray()
	{
		for(int x = 0; x <= romanNumber.length() - 1; x++)
			remaining[x] = romanNumber.charAt(x);
	}
	
	private void replaceChars(char first, char second)
	{
		for(int x = 0; x <= remaining.length - 1; x++)
		{
			if((remaining[x] == first) && (remaining[x + 1] == second))
			{
				remaining[x] = 'e';
				remaining[x + 1] = 'e';
				break;
			}
		}
	}
}