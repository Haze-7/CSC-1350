
/**
 * This program will print a custom multiplication table for a range of values specified by the user.
 * 
 * CSC 1350 Programming project No 7
 * 
 * @author Hayes Chiasson
 * @since 10/20/2022
 *
 */
import java.util.Scanner;

public class Prog07_MultiplyIt {
	
	//Step 5: Create javadocs for newly created method
	/**
	 * This method prints a well formatted multiplication table and calculates the proper values within lower and upper bounds
	 * Developed: 10/20/2022
	 * Modified: 10/20/2022
	 * @author Hayes Chiasson
	 * @param lowerBound: determines the lowest value in the range available to the table
	 * @param upperBound: determines the highest value in the range available to the table
	 */
	//Step 4: Create a method for printing and doing calculations for multiplication table
	public static void multiplicationTable(int lowerBound, int upperBound) {
		//Print table header
		System.out.print("       x"); // insert x as first value
		for (int c = lowerBound; c <= upperBound; c++) {
			System.out.printf("%8d", c);
		}
		System.out.println();
		//Print table body
		for (int c = lowerBound; c <= upperBound; c++) {
			System.out.printf("%8d", c);
			for (int r = lowerBound; r <= upperBound; r++) {
				System.out.printf("%8d", r * c);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		//Step 1: prompt user for lower bound
		Scanner in = new Scanner(System.in);
		System.out.println("Enter table lower bound: ");
		//Step 3 Input Validation 
		while (!in.hasNextInt()) {
			String badinput = in.next();
			System.out.println("Invalid input");
			System.out.println("Enter table lower bound: ");
		}
		int lowerBound = in.nextInt();
		//Step 2: prompt user for upper bound
		System.out.println("Enter table upper bound: ");
		//Step 3 Input Validation
		while (!in.hasNextInt()) {
			String badinput = in.next();
			System.out.println("Invalid input");
			System.out.println("Enter table upper bound: ");
		}
		int upperBound = in.nextInt();
		//Step 6 call method to create table within bounds 
		multiplicationTable(lowerBound, upperBound);
	}
}