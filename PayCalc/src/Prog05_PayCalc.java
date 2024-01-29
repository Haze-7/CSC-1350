/**
 * This program will automate the calculation of an employee's weekly payroll amount, whether that be hourly or salary, including overtime.
 * This program will also read employees' ID's, determine their payment method, calculate the results, and display them for the user.
 * 
 * CSC 1350 Programming project No 5 
 * 
 * @author hchias2
 * @since 9/ 29/2022
 */
import java.util.Scanner;

public class Prog05_PayCalc {

	public static void main(String[] args) {
		
		//variable declaration for Employee ID check
		String Employeeid = ""; //ID variable

		//variable declaration for salary employees
		double salaryWeeklyPay = 0; //weekly pay of salary employee
		double annualSalary = 0; // yearly salary of an employee
		
		//variable declaration for hourly wage employees
		double hoursWorked = 0; // hours worked in a week by an hourly wage employee
		double hourlyRate = 0; //hourly rate of an hourly wage employee
		double hourlyWeeklyPay = 0; // weekly pay of hourly wage employee
		
		//Variable declaration for hourly wage employees overtime
		double overtimeHours = 0; //the hours worked greater than 40 hours in a week by an hourly wage employee
		double overtimeRate = 0; // The hourly rate of a hourly rage employee working overtime
		
		
		//Check for employee type / employee ID
		Scanner in = new Scanner(System.in); // insert scanner
		System.out.println("Enter Employee ID:"); // prompt for employee ID
		Employeeid = in.next(); // read for employee ID input
		
		//If Employee ID begins with SAL
		if (Employeeid.substring(0,3).equals("SAL")) // Do if employee ID is SAL
		{
			//Input salary info from the user
			System.out.println("Enter annual Salary:"); //prompt for annual salary
			annualSalary = in.nextDouble(); // read for annual salary from user
			
			//calculate week's pay for the salaried employee
			salaryWeeklyPay = annualSalary / 52; // weekly pay calculation for annual salary employee

			//Output week's pay for salaried employee
			System.out.printf("Weekly pay is $%,.2f%n", salaryWeeklyPay); // outputs calculated weekly pay for salaried employee
			System.out.printf("Salary Calculation: $%,.2f annual salary / 52 weeks", annualSalary); // outputs the calculation for weekly salary of salary employee for user to read
			
		}
		//Else
		else
		{
			//Input hourly wage info from the user
			System.out.println("Enter the number of hours worked during the week:"); // Prompts the user for # of hours worked during the week
			hoursWorked = in.nextDouble(); // records user input of hours worked by hourly wage employee
			System.out.println("Enter the hourly rate:"); // Prompts the user for the hourly rate of an hourly wage employee
			hourlyRate = in.nextDouble(); // input for hourly wage/rate of hourly wage employee
			
			//output the week's pay for hourly wage employee
			if (hoursWorked <= 40)//Calculate/Determine Overtime
			{
				
				System.out.printf("Weekly pay is $%,.2f%n", hourlyWeeklyPay); // output weekly pay of hourly wage employee
				System.out.printf("Salary Calculation: %,.2f hours worked x $%,.2f hourly rate\n + %.2f hours worked x $%,.2f hourly rate", hoursWorked, hourlyRate, overtimeHours, overtimeRate);// output salary calculation of hourly wage employee, hourly rate, overtime hours worked(none for this instance), and hourly rate of overtime
			}
			else // hours worked > 40 
			{
				overtimeHours = hoursWorked - 40; // determining overtime hours
				overtimeRate = hourlyRate * 1.5; // calculating overtime rate compared to normal rate
				System.out.printf("Salary Calculation: %,.2f hours worked x $%,.2f hourly rate\n + %.2f hours worked x $%,.2f hourly rate", hoursWorked, hourlyRate, overtimeHours, overtimeRate); //output salary calculation of hourly wage employee, hourly rate, overtime hours worked, and hourly rate of overtime
			}
			}
		}			
}

