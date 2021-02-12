package controlStructures;
import java.util.Scanner;

public class Exercise12 {

	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise12 exe = new Exercise12();
		char choice;
		
		do
		{
			exe.method();
			
			System.out.print("\nContinue? (Y/N): ");
			choice = console.next().charAt(0);
		}
		while((choice == 'Y') || (choice == 'y'));
	}

	private void method()
	{
		int acc_Num;
		char acc_Type;
		double min_Bal;
		double curr_Bal;
		
		acc_Num = console.nextInt();
		acc_Type = console.next().charAt(0);
		min_Bal = console.nextDouble();
		curr_Bal = console.nextDouble();
		
		if((acc_Type == 's') || (acc_Type == 'S'))
		{
			if(min_Bal < curr_Bal)
			{
				curr_Bal = (min_Bal * 0.04) + curr_Bal;
				System.out.printf("%d %s %.2f %.2f", acc_Num, acc_Type, min_Bal, curr_Bal);
			}
			else
				System.out.printf("%d %s %.2f %.2f. Charged another service fee for $10.00.", acc_Num, acc_Type, min_Bal, curr_Bal);
		}
		else if((acc_Type == 'C') || (acc_Type == 'c'))
		{
			if((curr_Bal >= min_Bal) && (curr_Bal <= 5000))
			{
				curr_Bal = (min_Bal * 0.03) + curr_Bal;
				System.out.printf("%d %s %.2f %.2f", acc_Num, acc_Type, min_Bal, curr_Bal);
			}
			else if((curr_Bal >= 5000))
			{
				curr_Bal = (min_Bal * 0.05) + curr_Bal;
				System.out.printf("%d %s %.2f %.2f", acc_Num, acc_Type, min_Bal, curr_Bal);
			}
			else
				System.out.printf("%d %s %.2f %.2f. Charged another service fee for $25.00.", acc_Num, acc_Type, min_Bal, curr_Bal);
		}
		else
			System.out.println("Invalid account type!");
	}
}
