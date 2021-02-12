package lambdaExpressions;

public class Hello {
	
	interface HelloService{
		String hello(String firstname, String lastname);
	}

	public static void main(String[] args) {
		
		HelloService helloService = (String firstname, String lastname) -> 
		{
			String hello = "Hello " +firstname+" "+lastname;
			return hello;
		};
		
		System.out.println(helloService.hello("Daryll David", "Dagondon"));
	}

}
