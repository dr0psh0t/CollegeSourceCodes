package binaries;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;

public class LanguageConversion
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int dec = 0;		
		do
		{
			System.out.print("Enter: ");
			dec = console.nextInt();
	         
			System.out.println("binary: "+binary(dec));
			System.out.println("octal: "+octal(binary(dec)));
			System.out.println("hex: "+hex(binary(dec)));
			System.out.println();
		}
		while(dec != -99);
	}
	
	public static String hex(String binary)
	{
		int binLength = binary.length(),
				count = 0,
				store;
		
		String str = "";
		ArrayList<String> list = new ArrayList<>();
		
		for(int x = binLength - 1; x >= 0; x--)
		{
			count++;
			str += binary.charAt(x);
			
			if(count == 4)
			{
				store = decimal(reverse(str));
				if(store > 9)
					list.add(transmute(store+""));
				else
					list.add(""+store);				
				
				str = "";
				count = 0;
			}
		}			
		
		if(!str.equals(""))
			list.add(""+decimal(reverse(str)));
		
		Collections.reverse(list);
		str = "";			
		
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext())
			str += itr.next();
		
		return str;
	}
	
	public static String transmute(String hexValue)
	{
		switch(hexValue)
		{
		case "10": return "A";
		case "11": return "B";
		case "12": return "C";
		case "13": return "D";
		case "14": return "E";
		case "15": return "F";
		default: return "";
		}
	}
	
	public static int octal(String binary)
	{
		int binLength = binary.length(),
				count = 0;
				
		String str = "";		
		ArrayList<String> list = new ArrayList<>();
		
		for(int x = binLength - 1; x >= 0; x--)
		{
			count++;
			str += binary.charAt(x);
			
			if(count == 3)
			{
				count = 0;
				list.add(""+decimal(reverse(str)));
				str = "";
			}
		}			
		
		if(!str.equals(""))
			list.add(""+decimal(reverse(str)));
		Collections.reverse(list);
		str = "";
		
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext())
			str += itr.next();
		
		return Integer.parseInt(str);
	}
	
	private static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public static int decimal(String binary)
	{
		int result = 0;
		int power = 1;
		
		if(binary.equals(""))
			return result;
		else
		{
			for(int g = binary.length() - 1; g >= 0; g--)
			{
				if(binary.charAt(g) == '1')
					result += power;
				power = power * 2;
			}
			return result;
		}
	}
	
	public static String binary(int decimal)
	{
		int constant = 512;
		String binary = "";
		
		while(constant != 0)
		{
			if((decimal & constant) == 0)
				binary += '0';
			else
				binary += '1';
			constant = constant >> 1;
		}
		return binary;
	}
}
