package JavaSessions;

public class CarArray {

	
	public String[] booking(String carType)
	{
		System.out.println("Type of the car is :" +carType);
		
		String[] resultArr = new String[3];
		
		if(carType.equalsIgnoreCase("Sedan"))
		{
			resultArr[0] = "Amaze";
			resultArr[1] = "Volvo";
			resultArr[2] = "ford";
		}
		
		else if(carType.equalsIgnoreCase("SUV"))
		{
			resultArr[0] = "Kia Seltos";
			resultArr[1] = "Nexon";
			resultArr[2] = "Venue";
		}
		
		else if(carType.equalsIgnoreCase("Hatchback"))
		{
			resultArr[0] = "Indica";
			resultArr[1] = "Altroz";
			resultArr[2] = "i20";
		}
		
		return resultArr;
	}
	
	
	
	public static void main(String[] args) {
		
		CarArray c = new CarArray();
		String[] cars = c.booking("Sedan");
		for(String car : cars) {
			System.out.println(car);
		}
		

	}

}
