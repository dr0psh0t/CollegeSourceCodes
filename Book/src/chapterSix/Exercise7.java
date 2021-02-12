package chapterSix;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner con = new Scanner(System.in);
		
		double deposit,
			years,
			rate;

		System.out.print("Amount deposited: ");
		deposit = con.nextDouble();
		
		System.out.print("Years: ");
		years = con.nextDouble();
		
		System.out.print("Interest rate: ");
		rate = con.nextDouble();
		
		double maturity = deposit * Math.pow(1 + rate / 100, years);
		
		System.out.printf("Maturity: %.2f", (float) maturity);
		
		con.close();
	}

}
