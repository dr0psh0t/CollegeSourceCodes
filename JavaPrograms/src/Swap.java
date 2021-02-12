import java.util.*;

public class Swap 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String a, b;
		
		System.out.print("======== Start of Program ========\n\n");
		
		System.out.print("input for a: ");
		a = console.nextLine();
		System.out.println();
		
		System.out.print("input for b: ");
		b = console.nextLine();
		System.out.println();
		
		String c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.print("Swapped values:\na = "+a+"\nb = "+b+"\n\n");
		System.out.print("======== End of Program ========");
	}
}
