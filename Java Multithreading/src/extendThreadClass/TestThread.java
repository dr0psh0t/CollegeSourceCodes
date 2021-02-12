package extendThreadClass;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo r1 = new ThreadDemo("Thread-1");
		r1.start();
		
		ThreadDemo r2 = new ThreadDemo("Thread-2");
		r2.start();
	}

}
