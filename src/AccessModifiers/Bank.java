package AccessModifiers;

public class Bank {
	
	public String name;
	private String accountnb;
	protected int age;
	String address;// Default

	public static void main(String[] args) {


		Bank b = new Bank();
		b.accountnb = "1000";
		b.name = "Naveen";
		b.age = 33;
		b.address = "Gulbarga";
				

	}

}
