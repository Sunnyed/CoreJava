package JavaSessions;

public class WrapperClass {

	public static void main(String[] args) {


		String n = "10";
		System.out.println(n+20);//1020
		
		//Now we need to convert the String n to Integer like below
		
		int num = Integer.parseInt(n);
		System.out.println(num+20);

		
		//double
		
		String d ="14.5";
		System.out.println(d+55.6);
		
		double d1 = Double.parseDouble(d);
		System.out.println(d1+55.6);
		
		//int to String
		
		int i = 100;
		String str = String.valueOf(i);
		System.out.println(str+2);
		
	}

}
