/*
 * This program is designed to calculate the date of easter for any given year
 * 
 * CSC 1350 Programming Project No 4
 * 
 * @author Hayes Chiasson
 * 
 * @since 9/15/2022
 */

import java.util.Scanner;
	
public class Prog04_EasterCalc {

	public static void main(String[] args) {
		
	//declare all variables
	int a;
	int b;
	int c;
	int d;
	int e;
	int g;
	int h;
	int j;
	int k;
	int m;
	int r;
	int y = 0; // y represents the year that is being calculated
	int n = 0; // n represents the month of easter for a given year
	int p = 0; // p represents the day of Easter for a given year
	
	//Step 1: Input year from the user
	
	System.out.println("When is Easter, you ask?"); //prompt 
	System.out.printf("Enter year of your choosing:"); //input prompt
	Scanner in = new Scanner(System.in); // insert scanner
	y = in.nextInt(); // Read for year user year input
	
	//Step 2: Calculate the month and day of Easter for the year
	
	a = (y % 19);  
	b = (y / 100); 
	c = (y % 100);
	d = (b / 4); 
	e = (b % 4); 
	g = ((8 * b + 13) / 25);
	h = ((19 * a + b - d - g + 15) % 30);
	j = (c / 4);
	k = (c % 4);
	m = ((a + 11 * h) / 319);
	r = ((2 * e + 2 * j - k - h + m + 32) % 7);
	n = ((h - m + r + 90) / 25); // find month
	p = ((h - m + r + n + 19) % 32); // find day 
	
	//Step 3: Output the results
	
	System.out.printf("On, %d Easter falls on %d/%d.", y, n, p); // output month and day of Easter for given year
	
	
	
	
	
	
	
	
	
	
	
	}

}
