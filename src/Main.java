import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Ask the user to input weekly income
		System.out.print("Enter your weekly income: ");
		int income = scnr.nextInt();
		
		//Use an if-else chain to determine the tax rate
		double tax = 0.00;
		if (income < 500)
		    tax = 0.10;
		else if (income < 1500)
		    tax = 0.15;
		else if (income < 2500)
		    tax = 0.20;
		else
		    tax = 0.30;
		
		//Calculate the weekly tax, display it, and deduct from paycheck
		double total = tax*income;
		System.out.printf("Your weekly tax is $%.2f\n", total);
		System.out.println("Your weekly wage is $" + (income - total));
		
		//closes scanner
		scnr.close();
	}
}
