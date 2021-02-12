package numberSystem;
import java.util.Scanner;

public class Octal
{
	public static void main(String[] dfg)
	{
		Scanner con = new Scanner(System.in);
		String first, second;
		
		System.out.print("Enter 1st octal: ");
		first = con.next();
		
		System.out.print("Enter 2ndt octal: ");
		second = con.next();
		
		int res = Integer.parseInt(first, 8) + Integer.parseInt(second, 8);
		String octResult = Integer.toOctalString(res);
		
		System.out.printf("%s + %s = %s", first, second, octResult);
		con.close();
	}
}