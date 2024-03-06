/** name: Maxson Lantz 
 * task: create a program to calculate compound interest
 */
// this program kept returning the principal amount, you told me to submit it anyway
import javax.swing.JOptionPane;
public class Task3 {
	public static void main(String[] args) {

		// declare variables
		double finalamount, principal, rate, time, compoundamount,hold1,hold2;
		String principalhold;
		String ratehold;
		String timehold;
		String compoundamounthold;
		
		//get inputs
		principalhold = JOptionPane.showInputDialog("Please eneter your principal amount.");
		principal = Double.parseDouble(principalhold);
		ratehold = JOptionPane.showInputDialog("Please eneter your yearly intrest rate.");
		rate = Double.parseDouble(ratehold);
		rate = rate/100;
		timehold = JOptionPane.showInputDialog("Please eneter the amount of time your money will be left in the savings account.");
		time = Double.parseDouble(timehold);
		compoundamounthold = JOptionPane.showInputDialog("Please eneter the amount of times your money will be compounded per year.");
		compoundamount = Double.parseDouble(compoundamounthold);
		
		// calculate
		// hold1=rate/compoundamount;
		hold2=time*compoundamount;
		//finalamount = principal*(1+Math.pow(hold1,hold2));
		
		finalamount = principal*(1+(Math.pow(rate,hold2))/compoundamount);

		System.out.println("Your money at the end of " + time + " years will be " + finalamount);
	}

}
