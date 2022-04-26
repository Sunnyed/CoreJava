package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		
		// WAP to print "Hello" and then print your expected output
		
		String n= "Naveen ED";
		System.out.println("Hello");
		System.out.println(n);
		
		System.out.println("---------------------------------");
		
		//WAP to print the sum of 2 numbers
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("The sum of 2 numbers is " + c);
		
		System.out.println("---------------------------------");
		
		//Write a Java program to divide two numbers and print on the screen
		
		int d= 10;
		int e = 2;
		
		int f = d/e;
		System.out.println("The division of 2 numbers is " +f);
		
		System.out.println("---------------------------------");
		
		
		System.out.println(-5+8*6);
		System.out.println((33+9)%9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(10 + 15 / 2 * 2 - 5 % 3);
		
		System.out.println("---------------------------------");
		
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		//Try to concat "Hello Selenium" with a character 't'.
		
		String s1 = "Hello Selenium";
		String s2 = "t";
		
		String s3 = s1+s2;
		System.out.println(s3);
		
		
		System.out.println("---------------------------------");
		
		
		//Create three int variables having values like : 100, 200, 3400. 
		//Add them and concatenate and generate this output String : 
		//"Your Total amount is. 3700".
		
		int x= 100;
		int y= 200;
		int z= 3400;
		
		int sum = x+y+z;
		
		System.out.println("Your Total amount is. " +sum);
		
		System.out.println("---------------------------------");
		
		//What will be the output for below
		
		byte b3 = 065;
		System.out.println(b3);// 53 This will be converted to the decimal value from octal value
		

	}

}
