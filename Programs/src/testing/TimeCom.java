package testing;
import java.util.Scanner;

public class TimeCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner con = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size = con.nextInt();
		
		System.out.println();
		
		table(size);
		con.close();
	}
	
	public static void table(int limit)
	{
		int x, y;
		long start = System.currentTimeMillis(),
				end;
		
		for(x = 0; x < limit; ++x)
		{
			for(y = 0; y < limit; ++y)
				System.out.print("ha ");
			System.out.println();
		}
		
		end = System.currentTimeMillis();
		System.out.println("\n"+(end - start)+" ms");
	}
}
