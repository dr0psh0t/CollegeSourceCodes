import java.util.*;

public class RemoveDuplication 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Input String: ");
		String str = console.nextLine();

		System.out.print("Removed duplicates: "+removeDuplicate(str));
	}
	
	public static String removeDuplicate(String str)
	{
		String newStr = "";
		
		for(int i = 0; i <= str.length() - 1; i++)
		{
			if(!containsChar(newStr, str.charAt(i)))
				newStr = newStr + str.charAt(i);
		}
		return newStr;
	}
	
	public static boolean containsChar(String str, char p)
	{
		boolean contains = false;
		for(int i = 0; i <= str.length() - 1 && !contains; i++)
		{
			if(p == str.charAt(i))
				contains = true;
		}
		if(contains)
			return true;
		else
			return false;
	}
}
