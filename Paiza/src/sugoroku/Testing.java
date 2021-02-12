package sugoroku;
import static java.lang.System.*;
import java.util.Scanner;

public class Testing
{
	static Scanner con = new Scanner(in);
	public static void main(String[] args)
	{
		int n, m, len, count = 0, num;
		int[] wheel;
		int pass = 0;
		
		String[] result;
		
		/*
		 * 2 <= n <= 100 - okay
		 * t_1 = t_n = 0 - okay
		 * -100 <= t_i <= 100 (2 <= i <= n-1)
		 * 1 <= m <= 100
		 * 1 <= d_i <= 100 (1 <= j <= m)
		 * 
		 * "n" is the number of cells. "t_i" is an integer value written on
		 * the "i"-th cell. "m" is the number of the game. "d_i" is a
		 * positive integer value on the wheel at the "j"-th game.
		 */
		
		out.print("Number of cells: ");
		n = con.nextInt();		
		if(n >= 2 && n <= 100)
		{
			wheel = new int[n];
			len = wheel.length;
			
			//	initialize wheel cells
			for(int x = 0; x < len; x++)
			{
				wheel[x] = con.nextInt();				
				if(!(wheel[x] >= -100 && wheel[x] <= 100))
				{
					err.print("Cells are not in range");
					exit(0);
				}
			}
			
			//	verify if first and last cells are 0
			if(wheel[0] == 0 && wheel[n - 1] == 0)
			{
				//	number game
				out.print("Number game: ");
				m = con.nextInt();				
				if(m >= 1 && m <= 100)
				{
					result = new String[m];
					while(count < m)
					{
						out.print(count+"-th "+count+": ");
						num = con.nextInt();
						if(num >= 1 && num <= 100)
						{
							if(num >= len)
								result[count] = "No";
							else
							{
								while(true)
								{
									pass++;
									if(pass == num)	//	pass equals the limit
									{
										/* if pass is equal to limit (which is the last cell with
										 * the value of 0), display "Yes" and break loop
										 */
										if(pass == (len - 1))
										{
											result[count] = "Yes";
											pass = 0;
											break;
										}
										else if(wheel[pass] == 0)
										{
											result[count] = "No";
											pass = 0;
											break;
										}
										else if(wheel[pass] < 0)	//	if wheel[pass] is negative
										{
											int right = wheel[pass];
											pass += wheel[pass];
											int left = wheel[pass];
											
											/* checks to verify if the iteration is endless then
											 * breaks the loop and display "No" if it is true
											 */
											if(Math.abs(right) == left)
											{
												result[count] = "No";
												pass = 0;
												break;
											}
											
											/* if pass is negative(which is beyond the location
											 * of the first cell, display "No" and break the loop
											 */
											if(pass <= 0)
											{
												result[count] = "No";
												pass = 0;
												break;
											}
											
											//	initialize limit with wheel[pass] as new lilimitit
											num = ++left;
										}
										else	//	wheel[pass] is positive
										{
											num = pass;
											num += wheel[pass];
											
											if(num > (len - 1))
											{
												result[count] = "No";
												pass = 0;
												break;
											}
										}
									}
								}
							}
						}
						else
							result[count] = "No";
						count++;
					}
					for(String str : result)
						out.println(str);
				}
				else
				{
					err.print("m is not in range.");
					exit(0);
				}				
			}
			else
			{
				err.print("First and/or last cells are not zero.");
				exit(0);
			}
		}
		else
			err.print("n is not in range.");
	}
}