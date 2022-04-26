package JavaSessions;

import java.util.ArrayList;


public class Car {
	
	/**
	 * This method is used to book the car on the basis of the given car type
	 * @param car
	 * @return it will return the ArrayList
	 */
	
	public ArrayList<String> booking(String car)
	{
		System.out.println("Type of car is: " +car );
		
		ArrayList<String> carlist = new ArrayList<String>();
		
		if(car.equalsIgnoreCase("sedan"))
		{
			carlist.add("Ciaz");
			carlist.add("civic");
			carlist.add("Honda");
		}
		
		if(car.equalsIgnoreCase("SUV")) {
			
			carlist.add("Harrier");
			carlist.add("Fortuner");
			carlist.add("Creta");
		}
		
		if(car.equalsIgnoreCase("mini"))
		{
			carlist.add("cooper");
			carlist.add("swift");
			carlist.add("indica");
		}
		else
		{
			System.out.println("Default car type is Nexon");
		}
		
		return carlist;
	}
	
	//Below is called Method Overloading--> It is also called polyMorphism-->It is also called compile time or Static Polymorphism
	//It has same method name with different params
	
	public void tests()
	{
		System.out.println("Test method----");
	}
	
	public void tests(int a )
	{
		System.out.println("Test method" +a );
	}
	
	public void tests(int a, int b)
	{
		System.out.println("test method" + a+b);
	}
	
	public void tests(String a, int b)
	{
		System.out.println("Test method" + a+b);
	}

	public static void main(String[] args) {
		
		Car c = new Car();
		ArrayList<String> sedanlist = c.booking("Sedan");
		System.out.println(sedanlist);
		
		c.tests();
		c.tests(10);

	}

}
