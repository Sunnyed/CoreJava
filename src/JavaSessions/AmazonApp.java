package JavaSessions;

public class AmazonApp {
	
	
	public boolean login() // This is not an method overloading since the signature is different than the below methods
	{
		System.out.println("Login is done....");
		return true;
	}
	
	public void login(String name)
	{
		System.out.println("Login is done with name");
	}
	
	public void login(String name , String pwd)
	{
		System.out.println("Login is done with name and password");
	}
	
	public void login(String name, int otp)
	{
		System.out.println("Login is done with name and OTP");
	}
	
	
	//Another type of method overloading 
	
	public void search()
	{
		
	}
	public void search(String name)
	{
		System.out.println("search results with name");
	}
	public void search(String name , int price)
	{
		System.out.println("search results with name and price");	
	}
	public void search(String name, String type)
	{
		System.out.println("search results with name and type");
	}

	public static void main(String[] args) {


		AmazonApp app = new AmazonApp();
		app.login("naveen");
		app.login("name", "jdjdvk");
		
		app.search();
		app.search("Macbook");
		app.search("macbook", 1000000);

	}

}
