import java.util.Arrays;

public class Stack {
	
	private String[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 5;

    public Stack() {
        elements = new String[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(String e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
    	if (size == 0)
            throw new EmptyStackException();
    	
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    
    public int getSize(){
    	return size;
    }
    
    public void display()
    {
    	for(int i = 0; i < size; i++)
    		System.out.print(elements[i]+" ");
    	
    	System.out.println();
    }

    /*
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		
		stack.push("daryll");
		stack.push("david");
		stack.push("dagondon");
		
		stack.display();
		
		System.out.println("size = "+stack.getSize());
		
		System.out.println(stack.pop());
	}
}

class EmptyStackException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyStackException(String message){
		super(message);
	}
	
	public EmptyStackException(){
		super("Empty Stack");
	}
}
