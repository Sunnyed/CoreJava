package JavaSessions;

public class LoopConcepts {

	public static void main(String[] args) {
		
		//WAP to print following output: I am Batman five times
		
		for(int i =0 ; i <5 ; i++) {
			System.out.println("I am Batman");
		}
		
		System.out.println("---------------------------------");
		//WAP to print following output: I am Batman 1 to I am Batman 9 
		
		for (int i = 0; i<=9 ; i++)
		{
			System.out.println("I am Batman " + i);
		}
		
		System.out.println("---------------------------------");
		
		//WAP to print 10 to 1 using for, while and do-while loop
		
		//for loop:
		
		for (int i= 10; i > 0; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------");
		
		//while loop:
		int j =10;
		while(j > 0)
		{
			System.out.println(j);
			j--;
		}
		
		System.out.println("---------------------------------");
		
		//do-while loop:
		
		int k=10;
		
		do {
			System.out.println(k);
			k--;
		}while(k>0);
		
		System.out.println("---------------------------------");
		//Write a program in Java to print "Hello World" ten times using while loop
		
		int l =0;
		while (l < 10)
		{
			System.out.println("Hello World");
			l++;
		}
		
		//Do-while
		System.out.println("---------------------------------");
		int p= 0;
		do {
			System.out.println("Hello World");
			p++;
		}while(p<10);
		
		System.out.println("---------------------------------");
		//Write a program in Java to print 1 to 10 using while loop
		
		int q=1;
		while(q <=10)
		{
			System.out.println(q);
			q++;
		}
	}
	
	

}
