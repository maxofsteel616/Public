/**
Maxson Lantz
HW2-2/19/2024
 * 
 */
import javax.swing.JOptionPane;
public class HW2 {
	public static void main(String[] args) {
		// define variables
		double total=0, basecost=0, tax=0, discount=0, disctotal=0, taxtotal=0;
		String base = null;
		char basechoice;
		String input1;
		int ginger;
		
		// welcome message
		JOptionPane.showMessageDialog(null,"Welcome to Java Juice Bar!");
		
		// ask for choice of base
		input1=JOptionPane.showInputDialog(null,"Select your base juice:\n1. Apple - $5.00\n2. Orange - $4.50"
				+ "\n3. Mango - $6.00\n4. Carrot - $5.50");
		basechoice = input1.charAt(0);
		
		//switch for base
		switch (basechoice)
		{
		case '1':
			base= "Apple";
			basecost=total=5;
		break;
		case '2':
			base="Orange";
			basecost=total=4.5;
			break;
		case '3':
			base="Mango";
			basecost=total=6;
			break;
		case '4':
			base="Carrot";
			basecost=total=5.5;
			break;
		default:
			JOptionPane.showMessageDialog(null,"Invalid selection. Please restart the program.");	
		}
		
		//add ginger selection
		ginger=JOptionPane.showConfirmDialog(null, "Would you like to add ginger for an extra $1.00?");
		if (ginger==0)
		{
			total+=1;
		}
		
		if (ginger==0&&basecost==6)
		{
			discount=.5;
		}
		
		//calculate totals
		disctotal=total-discount;
		tax=disctotal*.16;
		taxtotal=disctotal+tax;
		
		//display bill
		if (ginger==0)
		{
		JOptionPane.showMessageDialog(null,"|| Final Bill ||\n------------------------\nBase Juice: "+base+" - $"+basecost+"0\n"
		+ "Add-On: Ginger - $1.00\n------------------------\n------------------------\nFull Price: $"+total+"0\nDiscount: -$"
		+ ""+discount+"0\n------------------------\nTotal Before Tax: $"+disctotal+"0\nTax: $"+tax+"\n------------------------"
		+ "\nTotal After Tax: $"+taxtotal+"\n------------------------");
		}
		else {
		JOptionPane.showMessageDialog(null,"|| Final Bill ||\n------------------------\nBase Juice: "+base+" - $"+basecost+"0\n"
		+ "------------------------\nFull Price: $"+total+"0\nDiscount: -$"+discount+"\n------------------------\nTotal "
				+ "Before Tax: $"+disctotal+"0\nTax: $"+tax+"\n------------------------"
		+ "\nTotal After Tax: $"+taxtotal+"\n------------------------");
		}
		}

}
