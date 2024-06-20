///////////////////////////////////////////////////////////////////////////
//Full Name : Dhyan Thakkar
//Yorku Email : dhyannnn@my.yorku.ca
//Date : June 18, 2024
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Lab3 {

	public static String printStars(int n) {
		// Initialize an empty  string to hold the result 
		String result = "";
		
		// Outer loop iterates from 0 to n - 1 to handle each line 
		for (int i = 0; i < n; i++) {
			// Append 'i' hyphens to the result
			for (int j = 0; j < i; j++) {
				result += "-";
			}
			
			// Append 'n-i' asterisks to the result
			for (int k = i; k < n; k++) {
				result += "*";
			}
			
			// Append a newline character at the end of each line except the last one 
			
			if (i < n - 1) {
				result += "\n";
			}
		}
		
		return result;
	}
	
	
	
	public static String expand (int num, int d) {
			
		// Check for invalid input
		if (num < 0 || d <= 0) {
			return "Invalid";
		}
		
		// Convert the number to string 
		String numStr = String.valueOf(num);
		
		// Check if the number of digits matches the length of the string 
		if (numStr.length() != d) {
			return "Invalid";
		}
		
		// Initialize an empty string 
		String result = "";
		
		// Loop through each digit 
		for (int i = 0; i < d; i++) {
			// Get the current digit as a character and then convert it to an integer 
			char digitChar = numStr.charAt(i);
			int digit = Character.getNumericValue(digitChar);
			
			if (i == d - 1) {
				// Append the last digit without a place value 
				result += digit;
			} else {
				// Calculate the place value
				int placeValue = (int) Math.pow(10, d - i - 1);
				
				// Append the current digit and its place value to the result
				result += digit + "*" + placeValue;
				
				// Append " + "
				result += " + ";
			}
		}
	        return result;
	}
	
	public static String getSeqStat(int ft, int d, int n) {
		// Initialize the result string 
        String result = "{";
    
        // Initialize the variables for sum and product 
        int sum = 0;
        long product = 1;
        
        // Loop through each term in the sequence
        for (int i = 1; i <= n; i++) {
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
        
        // Close the result string 
        result += "}";
        return result;
    }
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		// Initialize result string 
		String result = "<";
		
		// Initialize indices for both sequences 
		int i = 0, j = 0;
		
		// Interleave the sequences 
		while (i < n1 || j < n2) {
			if (i < n1) {
				// Calculate the current term in the first sequence 
				int term1 = ft1 + i*d1;
				if (result.length() > 1) {
					result += ", ";
				}
				
				result += term1;
				i++;
			}
			
			if (j < n2) {
				// Calculate the current term in the second sequence 
				int term2 = ft2 + j*d2;
				if (result.length() > 1) {
					result += ", ";
				}
				result += term2;
				j++;
			}
		}
		
		result += ">";
		return result;
	}	

}
