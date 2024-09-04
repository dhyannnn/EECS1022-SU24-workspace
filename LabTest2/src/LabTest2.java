
public class LabTest2 {
	/*
	 * Lab 3 Practice
	 */
	
	public static String printStars(int n) {
		// Initialize empty string to hold the result 
		String result = "";
		
		// Outer loop iterates from 0 to n-1 to handle each line 
		for (int i = 0; i < n; i++) {
			// Appending hyphens
			for (int j = 0; j < i; j++) {
				result += "-";
			}
			
			// Appending the stars 
			for (int k = i; k < n; k++) {
				result += "*";
			}
			
			// Append a new line character
			
			if (i < n - 1) {
				result += "\n";
			}
		}
		
		return result; 
	}
	
	public static String expand(int n, int digits) {
		if (n < 0 || digits < 0) {
			return "Invalid";
		}
		
		// Convert number to string 
		String nStr = String.valueOf(n);
		
		if (nStr.length() != digits) {
			return "Invalid";
		}
		
		// Initialize empty string 
		String result = "";
		
		// Loop through each digit
		for (int i = 0; i < digits; i++) {
			// Get the current digit as a character and then covert it to an int
			char digitChar = nStr.charAt(i);
			int digit = Character.getNumericValue(digitChar);
			
			if (i == digits - 1) {
				result += digit;
			} else {
				// Calculate the place value 
				int placeValue = (int) Math.pow(10, digits - i - 1);
				
				// Append the current digit and its place value to the result 
				result += digit + "*" + placeValue;
				
				// Append " + "
				result += " + ";
			}
			
		}
		return result;
	}
	
	public static String getSeqStat(int ft, int d, int n) {
		// Initialize the result 
		String result = "{";
		
		// Initialize the sum and the product 
		int sum = 0;
		int product = 1;
		
		// Loop through each term of the sequence 
		for (int i = 1; i <= n; i++ ) {
			// Calculate the current term 
			int term = ft + (i - 1) * d;
			
			// Update the sum and product
			sum += term;
			product *= term;
			
			// Format the current sequence
			if (i > 1) {
				result += "; ";
			}
			
			result += "[<";
			
			for (int j = 1; j <= i; j++) {
				if (j > 1) {
					result += ", ";
				}
				
				result += ft + (j - 1) * d;
			}
			
			result += ">: " + sum + ", " + product + "]";
		}

		// Close the string 
		result += "}";
		return result;
	}
	
	
	/*
	 * Lab 4 Practice 
	 */
	
	public static int longestSeq (int[] array) {
		if (array.length == 0) {
			return 0;
		}
		
		int longest = 1;
		
		for (int i = 0; i < array.length; i++) {
			int currentNum = array[i];
			int currentSeq = 1;
			
			for (int j = 0; j < array.length; j++) {
				if (array[j] == currentNum + 1) {
					currentNum++;
					currentSeq++;
					j = -1;
				}
			}
			
			if (currentSeq > longest) {
				longest = currentSeq;
			}
		}
		
		return longest;
	}
	
	public static String countArray(int[] array) {
		String result = "";
		if (array.length == 0) {
			return result;
		}
		
		int[] counts = new int[100];
		spaces = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2 == 0) && (array[i] >= 2) && (array[i] < 100)) {
				counts[array[i]] ++;
			}
		}
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				result +=
			}
		}
		return result;
	}
	
	
}
