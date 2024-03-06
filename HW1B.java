import java.util.Scanner;
public class HW1B {
	public static void main(String[] args)	{
		
		int numberAsString;
		String Number;
		boolean flag;
		double decimalNumber;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Eneter value for numberAsStrig");
		numberAsString = keyboard.nextInt();
		
		System.out.println("Eneter value for Number");
		Number = keyboard.next();
		
		System.out.println("Eneter value for flag");
		flag = keyboard.nextBoolean(); 
		
		System.out.println("Eneter value for decimalNumber");
		decimalNumber = keyboard.nextDouble();
		
		// greet user
		System.out.println("Hello World\n");
		
		// display text
		System.out.println("\tTabbed text");
		
		// display value for Number and numberAsString
		System.out.println("Value of Number:\t" + Number + "\nValue of numberAsString:\t" + numberAsString);
		
		// Declaring a constant
		double PI = 3.14159;
		
		// displaying value for flag and decimalNumber
		System.out.println("The value of flag is " + flag + ", and the deicmal number is " + decimalNumber);
	}

}
