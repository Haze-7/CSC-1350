/**
 * This program computes the cost to carpet a rectangular room.
 * 
 * CSC 1350 Programming project No 3
 * 
 * @author Hayes Chiasson
 * @since 9/8/22
 *
 */


public class Prog03_VariablePractice {

	public static void main(String[] args) {
		
		int roomLength = 15; // length of the room
			
		int roomWidth = 20; // Width of room (uninitialized)
		
		final int CARPETING_PRICE = 7; // cost of carpeting/ft^2
		
		int roomCarpetingPrice; //total cost of carpeting the room
		
		int roomTotalArea = roomLength * roomWidth; // find the area of the room
		
		roomCarpetingPrice = (roomTotalArea * CARPETING_PRICE); // calculating the cost of carpeting the entire room
		
		System.out.println("Cost of carpeting a " + roomLength + " x " + roomWidth + " room with carpeting that cost $" + CARPETING_PRICE + " per square foot: ");
		System.out.println("$" + roomCarpetingPrice); // display results
		System.out.println();
		
		/*
		 * Calculations and output for the cost of carpeting a 15 x 20 ft rectangular room
		 */	
		
		roomLength = 10; // length of 2nd room
		
		roomWidth = 12; // width of 2nd room
		
		roomTotalArea = roomLength * roomWidth; // find the area of the 2nd room
		
		roomCarpetingPrice = (roomTotalArea * CARPETING_PRICE); // calculating the cost of carpeting the entire of the 2nd room
		
		System.out.println("Cost of carpeting a " + roomLength + " x " + roomWidth + " room with carpeting that cost $" + CARPETING_PRICE + " per square foot: ");
		System.out.println("$" + roomCarpetingPrice); // display results
		
		/*
		 * Calculations and output for the cost of carpeting a 2nd, 10 x 12 ft rectangular room
		 */
	}

}
