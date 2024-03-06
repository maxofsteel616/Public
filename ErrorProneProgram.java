/**
 * Author: Maxson Lantz
Class MIST351-Spring24
HW1
program declares variables, greets the user, shows and prints out a few lines of code using variables
 */

public class ErrorProneProgram {
	public static void main(String[] args) {
		int numberAsString = 1234;
		
		String Number = "5678";
		
		boolean flag = true; 
		
		// shouldn't have a non number character
		double decimalNumber = 3.14;
		
		// should have quotation marks
		System.out.println("Hello World\n");
		
		// should have quotation  marks
		System.out.println("\tTabbed text");
		
		// quotation marks were in the wrong space
		System.out.println("Value of number:\t" + Number + "\nValue of numberAsString:\t" + numberAsString);
		
		// Declaring a constant
		double PI = 3.14159;
		
		// Printing a complex message
		System.out.println("The value of flag is " + flag + ", and the deicmal number is " + decimalNumber);
	}
}