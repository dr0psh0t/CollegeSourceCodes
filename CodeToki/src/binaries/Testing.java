package binaries;
import java.util.Scanner;

public class Testing
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		String bin;
		
		System.out.print("bin: ");
		bin = con.next();
		
		System.out.println(Integer.toHexString(Integer.parseInt(bin, 2)));
		
		con.close();
	}
	// 11111111111111111111111111111100
	// fffffffc
}