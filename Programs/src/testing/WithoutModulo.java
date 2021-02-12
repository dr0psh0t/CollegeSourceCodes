package testing;
import java.util.Scanner;

public class WithoutModulo
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		System.out.print("enter first num: ");
		int fNum = con.nextInt();
		
		System.out.print("enter second num: ");
		int sNum = con.nextInt();
		
		int quo = fNum / sNum;
		quo *= sNum;
		
		System.out.printf("\nremainder w/o modulo: %d", (fNum - quo));
		System.out.printf("\nremainder with modulo: %d", (fNum % sNum));
		
		con.close();
	}
}