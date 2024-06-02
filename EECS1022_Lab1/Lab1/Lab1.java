
/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 */
public class Lab1 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		// Check if the number is a positive integer 
		if (n <=0) {
			return -1;
		}
		
		// Apply Collatz conjecture rules
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return (n * 3) + 1;
		}
	}
	
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		// Check if both GPA and SAT score are too low
		if (gpa < 1.8 && sat < 900) {
			return "ScoresTooLow";
		}
		
		// Check if GPA is below the required threshold
		if (gpa < 1.8) {
			return "Reject";
		}
		
		// Check if SAT score is below the required threshold
		if (sat < 900) {
			return "Reject";
		}
		
		// If both GPA and SAT score are above the required thresholds
			return "Accept";
	}
		
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		if (x == 0 || y == 0) {
			return 0; // Point is on the x-axis or y-axis
		} else if (x > 0 && y > 0) {
			return 1; // Quadrant 1
		} else if (x < 0 && y > 0) {
			return 2; // Quadrant 2
		} else if (x < 0 && y < 0) {
			return 3; // Quadrant 3
		} else {
			return 4; // Quadrant 4
		}
	}
	
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		// Validate the input values
		if (hour1 < 0 || hour1 > 23 || min1 < 0 || min1 > 59 || hour2 < 0 || hour2 > 23 || min2 < 0 || min2 > 59) {
			return false;
		}
		
		// Convert the times to minutes since the start of the day
		int startTime = hour1 * 60 + min1;
		int endTime = hour2 * 60 + min2;
		
		// Check if the end time is earlier than the start time
		if (endTime < startTime) {
			return false;
		}
		
		// Calculate the difference in minutes
		int difference = endTime - startTime;
		
		// Check if the difference is at least 45 mins
		
		return difference >= 45;
	}

	
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		double interest = 0.0;
		double newBalance = 0.0;
		
		// Calculate interest
		if (oldBalance > 0) {
			interest = 0.02 * (oldBalance + charges);
		}
		
		// Calculate new balance
		newBalance = oldBalance + charges + interest;
		
		// Calculate minimum payment
		double minimumPayment = 0.0;
		if (newBalance < 50) {
			minimumPayment = newBalance;
		} else if (newBalance <= 300) {
			minimumPayment = 50.0;
		} else {
			minimumPayment = 0.2 * newBalance;
		}
		
			return minimumPayment;
	}
}
