/**
 * This program will perform analysis on exam grades by accepting the points the exam is worth, number of students, and each student's score to calculate the mean, max, min, and average scores of the class as a whole
 * 
 * CSC 1350 Programming Project No 9 
 * 
 * @author Hayes Chiasson
 * @since 11/10/2022
 *
 */
import java.util.Scanner;
import java.util.Arrays;

public class Prog09_GradeIt {
	/**
	 * This method handles the creation of the array scores, with its length based on the number of students in the class
	 * Developed: 11/10/22
	 * Modified: 11/10/22
	 * @author Hayes Chiasson
	 * @param numberOfStudents: the number of students in the class
	 * @param possibleExamPoints: the possible score each student can achieve
	 * @return
	 */
	public static double[] studentScores(int numberOfStudents)
	{
		double[] scores = new double[numberOfStudents];
		return scores;
	}
	/**
	 * This method fills the array scores with exam scores for the amount of students
	 * Developed: 11/10/22
	 * Modified: 11/10/22
	 * @param scores: array of test scores
	 * @return
	 */
	public static double[] inputScores(double[] scores)
	{
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++)
		{
			System.out.println("Enter exam score: ");
			scores[i] = in.nextDouble();
		}
		return scores;
	}
	/**
	 * This method calculates the mean of the exam scores.
	 * Developed: 11/10/22
	 * Modified: 11/10/22
	 * @author Hayes Chiasson
	 * @param scores: Array containing students' exam scores
	 * @return
	 */
	public static double mean(double[] scores)
	{
		double sum = scores[0];
		for (int i = 1; i < scores.length; i++)
		{
			sum += scores[i];
		}
		double mean = sum / scores.length;
		return mean; 
	}
	/**
	 * This method calculates the minimum exam score.
	 * Developed: 11/10/22
	 * Modified: 11/10/22
	 * @author Hayes Chiasson
	 * @param scores: Array containing students' exam scores
	 * @return
	 */
	public static double minimum(double[] scores)
	{
		double min = scores[0];
		for (int i = 1; i < scores.length; i++)
		{
			if (scores[i] < min)
			{
				min = scores[i];
			}
		}
			return min;
	}
	/**
	 * This method calculates the maximum exam score.
	 * Developed: 11/10/22
	 * Modified: 11/10/22
	 * @author Hayes Chiasson
	 * @param scores: Array containing students' exam scores
	 * @return
	 */
	public static double maximum(double[] scores)
	{
		double max = scores[0];
		for (int i = 1; i < scores.length; i++)
		{
			if (scores[i] > max)
			{
				max = scores[i];
			}		
		}
		return max;
	}
	/**
	 * This method prints the scores
	 * Developed: 11/10/22
	 * Modified: 11/10/22
	 * @author Hayes Chiasson
	 * @param scores: Array containing students' exam scores
	 * @return
	 */
	public static void printScores(double[] scores, double possibleExamPoints)
	{
		for (int i = 0; i < scores.length; i++)
		{
			System.out.printf("%10.2f%10.3f%%\n", scores[i], scores[i] * 100 / possibleExamPoints);
		}
	}
	
	
	public static void main(String[] args) {
	//Variable Declaration
	double possibleExamPoints = 0;
	int numberOfStudents = 0;
		
	Scanner in = new Scanner(System.in);
	
//prompt for exam worth
	System.out.println("Enter possible Exam points: ");
	possibleExamPoints = in.nextDouble();
	//Input Validation
	boolean validNumber = false;
	
	while (!validNumber)
	{
		System.out.println("Enter number of students: ");
		
		while (!in.hasNextInt())
		{
			System.out.println("Value must be a whole number greater than 0.");
			in.nextLine();
			System.out.print("Enter number of students: ");
		}
		numberOfStudents = in.nextInt();
		in.nextLine();
	if (numberOfStudents <= 0)
	{
		System.out.println("Value must be a whole number greater than 0");
	}
	else
	{
		validNumber = true;
	}
	}
	double[] examScores;
	examScores = studentScores(numberOfStudents);
	examScores = inputScores(examScores);
	printScores(examScores, possibleExamPoints);
	System.out.println();
	System.out.println();

	System.out.printf("Mean:\t\t %10.2f\n", mean(examScores));
	System.out.printf("Minimum:\t %10.2f\n", minimum(examScores));
	System.out.printf("Maximum:\t %10.2f\n", maximum(examScores));
	System.out.println();
	System.out.println("Total Number of Students: "+ numberOfStudents);

	
	
	
	

	}
}


