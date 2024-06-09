///////////////////////////////////////////////////////////////////////////
//Full Name : Dhyan Thakkar 
//Yorku Email : dhyannnn@my.yorku.ca
//Date : June 8, 2024
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 *
 */
public class Lab2 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, 
	 * double height, and a boolean athlete 
	 * and calculates the needed daily calories for that person as a double.
	 */
	public static double getCalories(int gender,int age,double weight, double height, boolean athlete) {
		if (age <= 0 || weight <= 0 || height <= 0 || (gender != 1 && gender != 2)) {
			return -1.0;
		}
		
		double calories = 0;
		if (gender == 1) { // Male
			
			calories = 10 * weight + 6.25 * height - 5 * age + 5;
			
			if (athlete) {
				
				calories = calories * 1.20; // Increase by 20% for male athletes
			}
		} else { // Female 
			calories = 10 * weight + 6.25 * height - 5 * age - 161;
			
			if (athlete) {
				
				calories = calories * 1.15; // Increase by 15% for female athletes
			}
		}
		
		return calories;
	}

		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
	    if (income < 0) {
	    	return -1.0;
	    }
	    
	    double tax = 0;
	    if (income <= 7150) {
	    	tax = income * 0.10;
	    } else if (income <= 29050) {
	    	tax = 715 + (income - 7150) * 0.15;
	    } else if (income <= 70350) {
	    	tax = 4000 + (income - 29050) * 0.25;
	    } else {
	    	tax = 14325 + (income - 70350) * 0.28;
	    }
	    
	    return tax;
	    
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is february, 
	 * it checks if the year is a leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		
		// Check of month is valid
		boolean monthValid = month >= 1 && month <= 12;
		// Check of the year is valid
		boolean yearValid = year > 1000;
		// Check if the year is a leap year 
		boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
		
		// Determine the number of days in the month 
		int daysInMonth = 0;
		if (monthValid) {
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				daysInMonth = 31;
				break;
			case 4: case 6: case 9: case 11:
				daysInMonth = 30;
				break;
			case 2:
				daysInMonth = isLeapYear ? 29 : 28;
				break;
			}
		}
		
		// Check if the day is valid
		boolean dayValid = day >= 2 && day <= daysInMonth;
		
		return monthValid && yearValid && dayValid;
	}
}