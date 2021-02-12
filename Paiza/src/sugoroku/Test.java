package sugoroku;
import static java.lang.System.*;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//0, 3, -2, -2, -1, 1, -2, 0	//	only 7 is yes
		//0, -3, -2, -2, 0, 1, -1, 0	//	7 is Yes
										//	1, 2, 3 and 4 are not continuous
										//	5 and 6 are endless loop

		int[] wheel = {0, 6, -2, -2, 0, 1, -1, 0};	//	1, 3 and 7 are Yes
									//	2 and 4 are not continuous
									//	5 and 6 are endless loop
		
		//0, 4, 1, 0, 1, -4, 0	//	1, 4 and 5 are endless loop
								//	2 and 3 are not continuos
								//	6 is Yes
		
		//0, 1, 0, 1, 0	//	1 and 2 are not continuos
						//	3 and 4 are Yes
		
		int len = wheel.length;
		int index = new java.util.Scanner(System.in).nextInt();
		
		if(index >= 1 && index < 100)
		{
			if(index == (len - 1))
				System.out.print("Yes: index index is the last cell.");
			else if(index >= len)
				System.out.print("No: index is more than the wheel length");
			else
			{
				
			}
		}
		else
			err.println("No: index is not in range.");
	}
}



























