/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int store1=0, store2=0, store3=0, store4=0, store5=0;
		
		for (int store = 1; store <=5; store++)
		{
			System.out.println("Enter today's sales for store "+store);
		
			if (store==1)
			{
				store1=keyboard.nextInt();
			}
			else if (store==2)
			{
				store2=keyboard.nextInt();
			}
			else if (store==3)
			{
				store3=keyboard.nextInt();
			}
			else if (store==4)
			{
				store4=keyboard.nextInt();
			}
			else if (store==5)
			{
				store5=keyboard.nextInt();
			}
		}
		System.out.println("SALES BAR CHART");
		for (int store = 1; store <=5; store++)
		{
			System.out.print("\nStore"+store+": ");
			if (store==1)
			{
				store1/=100;
				while (store1>0)
				{
					System.out.print("*");
					store1--;
				}

			}
			else if (store==2)
			{
				store2/=100;
				while (store2>0)
				{
					System.out.print("*");
					store2--;
				}
			}
			else if (store==3)
			{
				store3/=100;
				while (store3>0)
				{
					System.out.print("*");
					store3--;
				}
			}
			else if (store==4)
			{
				store4/=100;
				while (store4>0)
				{
					System.out.print("*");
					store4--;
				}
			}
			else if (store==5)
			{
				store5/=100;
				while (store5>0)
				{
					System.out.print("*");
					store5--;
				}
			}
		}
		
		
	}

}