package lists.PriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExample {

	public static void main(String[] args) {

		//	natural ordering example of priority queue
		PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(7, idInteger);
		Random rand = new Random();
		
		for(int i = 0; i < 7; ++i)
		{
			int num = rand.nextInt(100);
			System.out.println("Integer = "+num);
			integerPriorityQueue.add(new Integer(num));
		}
		
		for(int i = 0; i < 7; ++i)
		{
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processing Integer: "+in);
		}
		
		//	PriorityQueue example with Comparator
		PriorityQueue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
		addDataToQueue(customerPriorityQueue);
		pollDataFromQueue(customerPriorityQueue);
		
	}
	
	public static Comparator<Integer> idInteger = new Comparator<Integer>() {
		@Override
		public int compare(Integer i1, Integer i2){
			return (i1.intValue() - i2.intValue());
		}
	};

	//	Comparator anonymous class implementation
	public static Comparator<Customer> idComparator = new Comparator<Customer>() {		
		@Override
		public int compare(Customer c1, Customer c2) {
			return (c1.getId() - c2.getId());
		}
	};
	
	//	utility method to add random data to Queue
	private static void addDataToQueue(PriorityQueue<Customer> customerPriorityQueue)
	{
		Random rand = new Random();
		
		for(int i = 0; i < 7; ++i)
		{
			int id = rand.nextInt(100);
			System.out.println("Customer Id = "+id);
			customerPriorityQueue.add(new Customer(id, "Pankaja"+id));
		}
	}
	
	//	utility method to poll data from queue
	private static void pollDataFromQueue(PriorityQueue<Customer> customerPriorityQueue)
	{
		while(true)
		{
			Customer cust = customerPriorityQueue.poll();
			
			if(cust == null)
				break;
			System.out.println("Processing Customer with ID = "+cust.getId());
		}
	}
}
