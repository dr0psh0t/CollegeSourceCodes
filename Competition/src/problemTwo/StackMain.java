package problemTwo;
import java.util.*;

public class StackMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		LinkedStack stack = new LinkedStack();
		int choice;
		int cont;
		
		do
		{
			System.out.print("*** Stack ***\n\n");
			System.out.print("0. Display\n1. Push\n2. Pop\n7. Exit\n\n");
			System.out.print("Choice: ");
			
			choice = console.nextInt();
			
			if(choice == 0)
				stack.display();
			else if(choice == 1)
			{
				System.out.print("Input a number to push: ");
				int pushItem = console.nextInt();
				
				stack.push(pushItem);
			}
			else if(choice == 2)
				stack.pop();
			else if(choice == 7)
				System.exit(0);
			
			System.out.print("Press 7 to exit: ");
			cont = console.nextInt();
		}
		while(cont != 7);
	}

}
