/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Task5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// set up scanner
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int floor=0, roomhold=0, occupiedhold=0, occupied=0, room=0;
		
		//ask for amount of floors
		System.out.println("How many floors does the hotel have? ");
		floor = input.nextInt();
			
		// stop floor amount if invalid
		while(floor<1)
			{
				System.out.println("Invalid. Enter 1 or more: ");
				floor = input.nextInt();
			}
		
		//loop to get data for each floor
		for (int floorhold=1; floorhold<=floor; floorhold++)
		{
			//get room amount
			System.out.println("How many rooms does floor "+floorhold+" have? ");
			roomhold = input.nextInt();
			
			//ensure room amount is valid
			while (roomhold<10)
			{
				System.out.println("Invalid. Enter 10 or more: ");
				roomhold = input.nextInt();
				
			}
			// clean up
			room+=roomhold;
			
			// get occupied amount
			System.out.println("How many occupied rooms does floor "+floorhold+" have? ");
			occupiedhold = input.nextInt();
			
			// make sure occupied amount is vlid
			while (occupiedhold>roomhold)
			{
				System.out.println("Invalid. Must be "+roomhold+" or more. Re-enter: ");
				occupiedhold = input.nextInt();
			}
			// clean up
			occupied+=occupiedhold;
			
		}
		// display results
		System.out.print("Number of rooms: "+room+"\nOccupied Rooms: "+occupied+"\nVacant rooms: ");
		System.out.println(room-occupied);
		System.out.print("Occupancy Rate: ");
		System.out.println((double) occupied/room);
	}

}
