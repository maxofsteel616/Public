import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args)throws IOException
	{
		Scanner input = new Scanner(System.in);
		//Scanner input = new Scanner(System.in);
		
		String name;
		String description;
		
		System.out.println("Enter your name: ");
		name=input.nextLine();
		
		System.out.println("Descripe yourself");
		description=input.nextLine();
		PrintWriter outputFile = new PrintWriter("htmldemo.html");
		outputFile.println("<html>");
		outputFile.println("<head>");
		outputFile.println("</head>");
		outputFile.println("<body>");
		outputFile.println("<center>");
		outputFile.println("<h1>"+name+"</h1>");
		outputFile.println("</center>");
		outputFile.println("<hr/>");
		outputFile.println(description);
		outputFile.println("<hr/>");
		outputFile.println("</body>");
		outputFile.println("</html>");
		outputFile.close();
	}

}
