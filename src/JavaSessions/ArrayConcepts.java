package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) {

		// Array is a Data Structure which collects the similar data types
		// Its a static array

		// Below is the deceleration of array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);

		System.out.println("---------------");
		// In the above example, the Lowest index is 0
		// Highest Index is length + 1
		// length is Highest index -1

		int li = 0;
		int len = i.length;
		int hi = len + 1;

		System.out.println(li);
		System.out.println(len);
		System.out.println(hi);

		System.out.println("---------------");
		
		// How to fetch the vales from array
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("---------------");
		//When the try to fetch the value which is not in the length of an array declared then we get AIOB
		
		//System.out.println(i[5]);// ArrayIndexOutOfBoundsException
		
		for(int l : i)
		{
			System.out.println(l);
		}
		System.out.println("---------------");
		
		String s[] = new String[3];
		s[0] = "Tom";
		s[1] = "Naveen";
		s[2] = "Java";
		
		for(String ele : s)
		{
			System.out.println(ele);
		}
				
		System.out.println("---------------");
		
		
		//Print the array values in reverse order
		
		for(int p = s.length-1; p>=0; p--) {
			System.out.println(s[p]);
		}
		
	}

}
