package def;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "ab";
		change(x);
		System.out.println(x);
	}

	private static void change(String x){
		x = "cd";
	}
}
