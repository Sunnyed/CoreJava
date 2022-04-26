package ExceptionHandling;

public class ExceptionThrown {
	
	
	static int dividebyZero(int a ,int b)
	{
		int c = a/b;
		return c;
	}
	
	static int computeDivision(int a , int b) {
		
		int res = 0;
		
		res = dividebyZero(a, b);
		
		return res;
	}

	public static void main(String[] args) {
		
		

		int a = 10;
		int b = 0;
		computeDivision(a, b);
	}

}
