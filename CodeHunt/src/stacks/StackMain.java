package stacks;
import java.util.*;
import java.io.*;

public class StackMain 
{
	static Scanner console = new Scanner(System.in);
	
	public static int myChoice() throws InputMismatchException
	{
		try
		{
			int cchoice = console.nextInt();
			return cchoice;
		}
		catch(InputMismatchException e){
			throw e;
		}
	}
	
	public static int push() throws InputMismatchException
	{
		try
		{
			int cchoice = console.nextInt();
			return cchoice;
		}
		catch(InputMismatchException e){
			throw e;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		PrintWriter outputFile = new PrintWriter("src/stacks/Error.txt");
		int choice;
		char cont;
		boolean no = true;
		StackClass stack = new StackClass(5);

		do
		{
			do
			{
				try
				{
					System.out.print("====== Stack Operations ======\n\n");
					System.out.print("1. Push\n2. Pop\n3. Top\n4. Is empty stack\n"
							+ "5. Is full stack\n6. Print\n7. Exit\n\n");
					System.out.print("Choice = ");
					choice = myChoice();
					
					if(choice == 1)
					{
						System.out.print("\nPush a number: ");
						int pushItem = push();
						stack.push(pushItem);
					}
					else if(choice == 2)
						stack.pop();
					else if(choice == 3)
						System.out.print("\nTop: "+stack.top());
					else if(choice == 4)
						System.out.print("\nEmpty stack: "+stack.isEmptyStack());
					else if(choice == 5)
						System.out.print("\nFull stack: "+stack.isFullStack());
					else if(choice == 6)
						stack.print();
					else if(choice == 7)
					{
						System.out.print("============ END OF PROGRAM ============");
						outputFile.close();
						System.exit(0);
					}
				}
				catch(StackOverflowException e1)
				{
					System.out.print(e1.getMessage()+"\n");
					outputFile.println(e1.getMessage());
				}
				catch(StackUnderflowException e2)
				{
					System.out.print(e2.getMessage()+"\n");
					outputFile.println(e2.getMessage());
				}
				catch(InputMismatchException e3)
				{
					System.out.print("Error: "+e3.toString()+"\n");
					outputFile.println("InputMismatchException");
				}			
				
				System.out.print("\nContinue (y/n): ");
				cont = console.next().charAt(0);
				if((cont == 'n') || (cont == 'N'))
					no = false;
				System.out.println();
			}
			while((cont == 'y') || (cont == 'Y'));
		}
		while(no);
		outputFile.close();
		System.out.print("============ END OF PROGRAM ============");
	}
}

/*
Sample run:

====== Stack Operations ======

1. Push
2. Pop
3. Top
4. Is empty stack
5. Is full stack
6. Print
7. Exit

Choice = 2
Stack Underflow

Continue (y/n): y

====== Stack Operations ======

1. Push
2. Pop
3. Top
4. Is empty stack
5. Is full stack
6. Print
7. Exit

Choice = 3
Stack Underflow

Continue (y/n): y

====== Stack Operations ======

1. Push
2. Pop
3. Top
4. Is empty stack
5. Is full stack
6. Print
7. Exit

Choice = 4

Empty stack: true
Continue (y/n): n

============ END OF PROGRAM ============
*/
