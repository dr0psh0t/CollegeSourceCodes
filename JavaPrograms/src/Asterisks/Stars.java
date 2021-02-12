package Asterisks;

public abstract class Stars 
{
	private int length;
	
	public Stars(int length)
	{
		if(length < 2)
			this.length = 2;
		else
			this.length = length;
	}
	
	public void printStars()
	{
		for(int x = 1; x <= length; x++)
			System.out.print("* ");
	}
	
	public String blankSpace()
	{
		String blanks = "";
		
		for(int x = 1; x <= length - 2; x++)
			blanks += "  ";
		return blanks;
	}
}
