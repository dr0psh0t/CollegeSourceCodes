public class QueueMethods 
{
	int queueMax, index;
	char[] list;
	
	public QueueMethods(int size)
	{
		queueMax = size;
		index = 0;
		list = new char[queueMax];
	}
	
	public void displayUpperCase(String str)
	{
		System.out.print(str.toUpperCase());
	}
	
	public void insert(char let)
	{
		list[index] = let; 
		index++;
	}
	
	public void displayQueues()
	{
		for(int i = 0; i < queueMax; i++)
		{
			if(list[i] != ' ')
				System.out.print(list[i]+" ");
		}
	}
	
	public boolean isPalindrome(String str)
	{
		int j = str.length() - 1;
		
		for(int i = 0; i <= (str.length() - 1) / 2; i++)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
			j--;
		}
		return true;
	}
}