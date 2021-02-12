package stacks;

public class StackClass 
{
	private int maxStackSize;
	private int stackTop;
	private int[] list;
	
	public StackClass(int size)
	{
		maxStackSize = size;
		stackTop = 0;
		list = new int[maxStackSize];
	}
	
	public boolean isEmptyStack(){
		return stackTop == 0;
	}
	
	public boolean isFullStack(){
		return stackTop == maxStackSize;
	}
	
	public void print() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		else
		{
			for(int i = 0; i <= stackTop - 1; i++)
				System.out.print(list[i]+" ");
		}
	}
	
	public void push(int item) throws StackOverflowException
	{
		if(isFullStack())
			throw new StackOverflowException();
		else
		{
			list[stackTop] = item;
			stackTop++;
		}
	}
	
	public int top() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		else
			return list[stackTop - 1];
	}
	
	public void pop() throws StackUnderflowException
	{
		if(isEmptyStack())
			throw new StackUnderflowException();
		else
		{
			list[stackTop] = 0;
			stackTop--;
		}
	}
}
