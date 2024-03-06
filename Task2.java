/**
 * 
 */
import javax.swing.JOptionPane;

public class Task2 {
	public static void main(String[] args) {
	// declare variables
	String name;
	String agehold;
	int age;
	String city;
	String college;
	String job;
	String ptype;
	String pname;
	
	
	// get inputs
	name = JOptionPane.showInputDialog("Please enter your name.");
	agehold = JOptionPane.showInputDialog("Please eneter your age.");
	age = Integer.parseInt(agehold);
	city = JOptionPane.showInputDialog("Please enter your city.");
	college = JOptionPane.showInputDialog("Please enter your college.");
	job = JOptionPane.showInputDialog("Please enter your profession.");
	ptype = JOptionPane.showInputDialog("Please enter what type of pet you have.");
	pname = JOptionPane.showInputDialog("Please enter your pet's name.");
	
	// print out result
	System.out.println("There once was a person named " + name + " who lived in " + city + ". \nAt the age of " + age + ", " + name + " went to college at " + college + ". \n" + name + " graduated and went to work as a " + job + ". \nThen, " + name + " adopted a(n) " + ptype + " named " + pname + ". \nThey both lived hapily ever after!") ;


	}

}
