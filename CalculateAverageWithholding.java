package com.CalculateAverageWithholding;

import java.util.Scanner;

public class CalculateAverageWithholding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grossWeeklyIncome;
		double taxRate;
		double weeklyTaxWithholding;
		double netWeeklyIncome;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a weekly income: ");
		grossWeeklyIncome = input.nextInt();
		
		// Calculate tax rate based on income level
		if (grossWeeklyIncome < 500) {
			taxRate = 0.10;
		}
		else if ((grossWeeklyIncome >= 500) && (grossWeeklyIncome < 1500)) {
			taxRate = 0.15;
		}
		else if ((grossWeeklyIncome >= 1500) && (grossWeeklyIncome < 2500)) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		// calculate weekly tax withholding and weekly net income
		weeklyTaxWithholding = grossWeeklyIncome * taxRate;
		netWeeklyIncome = grossWeeklyIncome - weeklyTaxWithholding;
		
		// Output weekly gross income, tax rate, tax withholding, and net income
		System.out.println("\nWeekly Gross Income: $" + String.format("%.2f", grossWeeklyIncome));
		System.out.println("Tax Rate: " + (taxRate * 100) + "%");
		System.out.println("Weekly Tax withholding: $" + String.format("%.2f", weeklyTaxWithholding));
		System.out.println("Weekly Net Income: $" + String.format("%.2f", netWeeklyIncome));
		
		input.close(); // close scanner input
	}
}
