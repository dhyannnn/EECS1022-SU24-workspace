package model;

public class TempCheck {
	public static String comfortable(double temp) {
		String result = "";
		if (15 < temp && 25 > temp) {
			result += "comfortable";
		}
		
		return result;
	}
}
