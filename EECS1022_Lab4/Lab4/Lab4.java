public class Lab4 {
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
                    j = -1; // Restart the inner loop to check for the next number
                }
            }

            if (currentSeq > longest) {
                longest = currentSeq;
            }
        }

        return longest;
    }

	public static String countArray (int[] array) {
		String result = "";
		if (array.length == 0) {
			return result;
		}
		
		int[] counts = new int[100];
		int spaces = 0;
		
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2 == 0) && (array [i] >= 2) && (array[i] < 100)) {
				counts[array[i]] ++;
				spaces ++;
			}
		}
		
		for (int i = 2; i < 100; i+= 2) {
			if (counts[i] > 0) {
				result += i + ": " + counts[i];
				spaces -= counts[i];
				
				if (spaces > 0) {
					result += "\n";
				}
			}
		}
		
		return result;
	}
	
	public static boolean validString (String str1, String str2) {
		
		String x = str1;
		String y = str2;
		
		int xIndex = 0;
		int yIndex = 0;
		
		char[] xChars = x.toCharArray();
		char[] yChars = y.toCharArray();
		
		while(xIndex < xChars.length && yIndex < yChars.length) {
			if (xChars[xIndex] == yChars[yIndex]) {
				yIndex++;
			}
			xIndex++;
		}
		
		return yIndex == yChars.length;
	}
	
	public static String arrayResult(int[][] array) {
		String result = "";
		
		if (array.length == 0 || array[0].length == 0) {
			return result;
		}
		
		int sum = 0;
		int product = 1;
		
		boolean hasOdd = false; 
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i + j) % 2 == 0) {
					sum += array[i][j];
				} else {
					product *= array[i][j];
					hasOdd = true;
				}
			}
		}
		
		if (!hasOdd) {
			product = 0;
		}
		
		return "Sum:" + sum + ", Product:" + product;
	}
	
	
	public static boolean magicSquare(int[][] array) {
		
		int n = array.length; 
		
		if (n == 0 || array[0].length != n) {
			return false;
		}
		
		int[] rowSum = new int[n];
		int[] colSum = new int[n];
		int mainDiagSum = 0;
		int secondDiagSum = 0;
		int maxNumber = n*n;
		boolean[] seenNumbers = new boolean[maxNumber + 1];
		
		for (int i  = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int value = array[i][j];
				if (value < 1 || value > maxNumber || seenNumbers[value]) {
					return false;
				}
				seenNumbers[value] = true;
				rowSum[i] += value;
				colSum[j] += value;
				
				if (i ==j) {
					mainDiagSum += value;
				}
				
				if (i + j == n - 1) {
					secondDiagSum += value;
				}
			}
		}
		
		for (int i = 1; i < n; i++) {
			if (rowSum[i] != rowSum[0]) {
				return false;
			}
		}
		
		for (int j = 1; j < n; j++) {
			if (colSum[j] != colSum[0]) {
				return false; 
			}
		}
		
		if (mainDiagSum != rowSum[0] || secondDiagSum != rowSum[0]) {
			return false;
		}
		
		return true;
	}
}
