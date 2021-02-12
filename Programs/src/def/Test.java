package def;

public class Test
{
	public static void main(String[] args)
	{
		//method00();
		//method01();
		//method02();
		//method03();
		//method04();
		method05();
	}
	
	public static void method00()
	{
		String dfg = "Daryll";
		
		String gfd = new String("Daryll");
		
		if(dfg.equals(gfd))
			System.out.println("ok");
		else
			System.out.println("not ok");
	}

	public static void method01()
	{
		String dfg = "daryll gwapo!";
		String gfd = dfg;
		String vng = new String("daryll gwapo!");
		
		if(vng == gfd)
			System.out.println("ok");
		else
			System.out.println("not");
	}
	
	public static void method02()
	{
		//String s1 = new String("Java");
		String s2 = "Java";
		String s1 = new String("Java");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	public static void method03()
	{
		String s1=new String("abc");
        String s2="abc";
        String s3="abc";
		
		/*String s1="abc";
        String s2="abc";	//	get the "abc" copy in the String pool
        String s3=new String("abc");	//	forced "abc" to be allocated in String pool
        */
        
        if(s1==s2)
            System.out.println("s1==s2");
        if(s1==s3)
            System.out.println("s1==s3");
        if(s2==s3)
            System.out.println("s2==s3");
	}
	
	public static void method04()
	{
		//	s1 and s2 are not the same String objects
		//String s1 = new String("fgh");
		//String s2 = new String("fgh");
		
		//	s1 and s2 are the same String objects
		String s1 = "fgh";
		String s2 = "fgh";
		
		if(s1 == s2)
			System.out.println("s1 and s2 are the same String objects.");
		else
			System.out.println("s1 and s2 are not the same String objects.");
	}
	
	public static void method05()
	{
		String s1 = new String("Java");
		String s2 = "Java";
		
		System.out.println((s1 == s2) ? "ok" : "not ok");
	}
	
	
	
	
	
	
	
	
}