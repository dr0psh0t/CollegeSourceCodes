
public class Time {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter seconds: ");
		int sec = new java.util.Scanner(System.in).nextInt();
		
		int rem = sec % 3600;
		int hrs = sec / 3600;
		
		
		int min = rem / 60;
		sec = rem % 60;
		
		System.out.print("\n"+rem+" seconds remaining\n"+hrs+" hour/s "+min+" minutes "+sec+" seconds");
	}
}