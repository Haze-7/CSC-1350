/**
 * This program will calculate the team score for one of three events offered at the LSU Rec Day event
 * 
 * CSC 1350 Programming project No 6
 * 
 * @author Hayes Chiasson
 * @since 10/6/2022
 *
 */
//Step 1: Get Rec Info
//import Scanner class
import java.util.Scanner;

public class Prog06_RecDay {
	
	public static void main(String[] args) {
		
	//Declaration of variables
	double previous = 0;
	double individualScore = 0;	
	double totalScore = 0;
	String event = "";
	//Create scanner object
	Scanner in = new Scanner(System.in);
	//initialize haveGoodEventName variable
	boolean haveGoodEventName = false;
	//run while loop to validate input 
	while (!haveGoodEventName)
	{
	//Prompt User for rec Event
	System.out.println("Enter rec event to evaluate (juggling, galloping, or yodeling):");
	//read for user input of rec Event
	event = in.nextLine();
	//Use switch statement to determine a valid event value
	switch (event)
	{
	case "juggling":
		haveGoodEventName = true; 
		break;
	case "galloping": 
		haveGoodEventName = true;
		break;
	case "yodeling": 
		haveGoodEventName = true;
		break;
	default: 
		System.out.println("Invalid event name entered.");
		break;
	}
	}	
	//Step 2: Get individual Scores
	//for loop to repeat prompt to get all 5 individual scores
	for (double i = 0; i < 5; i++)
	{
	//part of calculation for total score/ creates a base to add to for summation later on
	previous = individualScore;
	//prompt for individual scores
	System.out.println("Enter individual event score (0.0 - 40.0):");
	//read for individual score
	individualScore = in.nextDouble();
	//calculate total score by adding each individual score to the running total
	totalScore = totalScore + individualScore;
	
	}	
		//Step 3: Calculate and Output team event and score
		//calculate team score
		double teamEventScore = totalScore;
		//output Event and Team Score
		System.out.printf("LSU Rec Day team " + event + " score: %.3f", teamEventScore);

	}

}
