package sugoroku;
import static java.lang.System.*;

import java.util.Scanner;

public class Sugoroku
{
	static Scanner con = new Scanner(in);
	public static void main(String[] args)
	{
		int n, m, len, count = 0, num;
		int[] wheel;
		int pass = 0;
		
		String[] result;
		
		n = con.nextInt();		
		if(n >= 2 && n <= 100)
		{
			wheel = new int[n];
			len = wheel.length;
			
			for(int x = 0; x < len; x++)
			{
				wheel[x] = con.nextInt();				
				if(!(wheel[x] >= -100 && wheel[x] <= 100))
				{
					err.print("Cells are not in range");
					exit(0);
				}
			}
			
			if(wheel[0] == 0 && wheel[n - 1] == 0)
			{
				m = con.nextInt();
				if(m >= 1 && m <= 100)
				{
					result = new String[m];
					while(count < m)
					{
						num = con.nextInt();
						if(num >= 1 && m < 100)
						{
							if(num == (len - 1))
								result[count] = "Yes";
							else if(num >= len)
								result[count] = "No";
							else
							{
								while(true)
								{
									pass++;
									if(pass <= 0)
									{
										result[count] = "No";
										break;
									}
									
									if(pass == num)
									{
										if(pass == (len - 1))
										{
											result[count] = "Yes";
											break;
										}
										
										if(wheel[pass] == 0)
										{
											result[count] = "No";
											break;
										}
										else if(wheel[pass] > 0)
											num = pass + wheel[pass];
										else
										{
											int right = wheel[pass];
											pass += wheel[pass];
											int left = wheel[pass];
											
											if(Math.abs(right) == Math.abs(left))
											{
												result[count] = "No";
												break;
											}
											
											if(pass <= 0)
											{
												result[count] = "No";
												break;
											}
											
											num = pass + wheel[pass];//3+(-2)=1
											if(pass > (num - 1))
											{
												result[count] = "No";
												break;
											}
										}
									}
								}
								pass = 0;
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