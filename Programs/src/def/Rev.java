package def;
import java.util.Scanner;

public class Rev {
	static Scanner con = new Scanner(System.in);
	public static void main(String[] args) {
		
		sb("daryll david e dagondon");
	}
	
	public static void sb(String str){
		System.out.println(new StringBuilder(str).reverse());
	}
	
	public static void rev()
	{
		System.out.print("Enter a string: ");
		String strr = con.next();
		
		char[] str = strr.toCharArray();
		char temp;
		
		int i = 0,
				j = str.length - 1;
		
		while(i < j)
		{
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			
			System.out.printf("%c\t%c\t%c\n", temp, str[i], str[j]);
			
			++i;
			--j;
		}
		
		System.out.println(str);
	}
}
