/**
 * This program recreates a game of Rock, Paper, Scissors, where rock crushes scissors, scissors cuts paper, and paper covers rock. The game will repeat until the user is ready to quit.
 * 
 * CSC 1350 Programming project No 8
 * 
 *@author hchias2
 *@since 11/3/2022
 */

import java.util.Scanner;

public class Prog08_PlayIt {
	
	/**
	 * This method randomizes the program's play in the game, between 1 and 3, and returns that value to be calculated.
	 * Developed: 11/3/2022
	 * Modified: 11/3/2022
	 * @author Hayes Chiasson
	 * @param 
	 * @return
	 */
	public static int programRandomizer()
	{
		int programWeapon = 1 + (int)(Math.random() * ((3 - 1) + 1));
		return programWeapon;
	}
	
	/**
	 * This program passes in both the user and program's play, calculates the winner, and displays the results.
	 * Developed: 11/3/22
	 * Modified:11/3/22
	 * @author Hayes Chiasson
	 * @param userWeapon = The weapon selection of the user, in 1 = ROCK, 2 = PAPER, and 3 = SCISSORS.
	 * @param programWeapon = The randomized weapon selection of the program, with 1 = ROCK, 2 = PAPER, and 3 = SCISSORS.
	 * @return
	 */
	public static void programPlay(int userWeapon, int programWeapon) // STEP 1: Implement Game
	{
		final int ROCK = 1; // declare constants to avoid floating #'s
		final int PAPER = 2;
		final int SCISSORS = 3;
		
		if (programWeapon == ROCK && userWeapon == SCISSORS) // rock vs scissors / rock wins / program wins
		{
			System.out.println("Program's Weapon: rock"); //output program's choice
			System.out.println("rock crushes scissors ==> Program Wins <=="); //output result
		}
		else if (programWeapon == ROCK && userWeapon == PAPER) // rock vs paper / paper wins/ user wins
		{
			System.out.println("Program's Weapon: rock"); //output program's choice
			System.out.println("paper covers rock ==> You Win <=="); //output result
		}
		else if (programWeapon == PAPER && userWeapon == ROCK) // paper vs rock / paper wins / program wins
		{
			System.out.println("Program's Weapon: paper"); //output program's choice
			System.out.println("paper covers rock ==> Program Wins <=="); //output result
		}
		else if (programWeapon == PAPER && userWeapon == SCISSORS) // paper vs scissors / scissors wins / user wins
		{
			System.out.println("Program's Weapon: paper"); //output program's choice
			System.out.println("scissors cut paper ==> You Win <=="); //output result
		}
		else if (programWeapon == SCISSORS && userWeapon == PAPER) // scissors vs paper / scissors win / program wins
		{
			System.out.println("Program's Weapon: scissors"); //output program's choice
			System.out.println("scissors cut paper ==> Program Wins <=="); //output result
		}
		else if (programWeapon == SCISSORS && userWeapon == ROCK) // scissors vs rock / rock wins / user wins
		{
			System.out.println("Program's Weapon: scissors"); //output program's choice
			System.out.println("rock crushes scissors ==> You Win <=="); //output result
		}
		else if (userWeapon == programWeapon) // tie game
		{
			System.out.println("Program's weapon: " + programWeapon); //output program's choice
			System.out.println("==> Tie Game <=="); //output result
		}
	}

	
	public static void main(String[] args) {
		
		//Variable Declaration
		int userWeapon = 0;
		int programWeapon = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		
		Scanner in = new Scanner(System.in);
		//Input Validation
		System.out.println("Enter your Weapon: 1 for rock, 2 for paper, and 3 for scissors or X to stop play");
		while (in.hasNextInt())	//check if integer, pass if it is // STEP 2: Allow the user to play until ready/ enter a letter or X
		{
		//Step 3: INPUT VALIDATION
		userWeapon = in.nextInt(); // read user weapon choice
		if (userWeapon < 1 || userWeapon > 3) // check if outside of bounds and print incorrect statement
		{
			System.out.println("Invalid value entered for game play"); // warn of incorrect input
			System.out.println("Enter your Weapon: 1 for rock, 2 for paper, and 3 for scissors or X to stop play"); // prompt user again
		}
		if (userWeapon >= 1 && userWeapon <= 3) // check if inside bounds and pass through to do program
		{
		programPlay(userWeapon, programRandomizer()); // calls both methods to pass the user's weapon choice and the randomized choice of the program to be computed within the play method
		}
		}
	

	}

}
