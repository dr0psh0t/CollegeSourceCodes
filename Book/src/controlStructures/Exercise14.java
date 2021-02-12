package controlStructures;
import java.util.Scanner;

public class Exercise14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner con = new Scanner(System.in);

		double length, width;
		double top, bottom, left, right;
		double ptSize;
		char space;
		
		System.out.print("A. length and width, in inches, of the paper: ");
		length = con.nextDouble();
		width = con.nextDouble();
		
		System.out.print("\nB. top, bottom, left and right margins: ");
		top = con.nextDouble();
		bottom = con.nextDouble();
		left = con.nextDouble();
		right = con.nextDouble();
		
		System.out.print("\nC. points size of a line: ");
		ptSize = con.nextDouble();
		
		System.out.print("\nD. line space('s' for single 'd' for double): ");
		space = con.next().charAt(0);
		
		if(space == 'd' || space == 'D')
			ptSize *= 2;
		
		double charSize = ptSize * 0.013888,
				wCut = width - (left + right),
				lCut = length - (top + bottom),
				numOfChars = wCut / charSize,
				numOfLines = lCut / charSize;
		
		System.out.printf("\nMaximum number of characters in a line is %.2f"
				+ "\nThe number of lines that can be printed on a paper is %.2f", numOfChars, numOfLines);	
	}

}
