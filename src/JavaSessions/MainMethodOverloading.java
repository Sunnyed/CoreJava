package JavaSessions;

public class MainMethodOverloading {
	
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(int a , int b)
	{
		System.out.println(a+b);
	}
	
	//Main Method overloading is possible
	// JVM will always looks for main method with param with array string
		
	public static void main(String[] args) {
		
		System.out.println("Main method");
		main(10);
		main(10,20);


	}

}
