package model;

public class LogCompute {
	
	public static String compute(int n) {
		int X = n;
		double Y = Math.log(X) / Math.log(2);
		
		String YString = String.format("%.2f", Y);
		String result = "The base 2 logarithm of " + X + " is " + YString; 
		
		return result;
	}
}
