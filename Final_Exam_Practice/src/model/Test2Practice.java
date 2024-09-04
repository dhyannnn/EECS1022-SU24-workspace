package model;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;

public class Test2Practice {
	public String calc(int m) {
		String x = "Paris is in France";
		int p = x.length() - m;
		
		String y = x.substring(p, p+2);
		return y;
	}
	
	public int calc2(int m) {
		final int STEP = 3;
		int result = m;
		boolean select = (m > STEP);
		if (select) {
			result = result + STEP;
		} else if (m == STEP) {
			result = 18 - result;
		} else {
			result = result * STEP;
		}
		
		return result;
	}
	
	public int calc3(int m) {
		int r = m;
		for (int i = 11; i > 5; i = i - 2) {
			
			r = r + i;
		}
		
		return r;
	}
	
	public int calc4(int m) {
		int c = -1;
		int b = 1; 
		while (b < m) {
			c++;
			b++;
		}
		
		return c; 
	}
	
	public String calc5(String s) {
		String result = "";
		int n = Integer.parseInt(s);
		n++;
		result = "July " + n;
		return result; 
	}
	
	public String calc6(String m) {
		final String DAYS = "SunMonTueWedThuFriSat";
		final String NOS = "0 1 2 3 4 5 6 ";
		String result = "";
		if (m.length() != 3) {
			m = "";
		}
		
		int n = DAYS.indexOf(m);
		if (n >=0) {
			result = NOS.substring(n, n+1);
		}
		
		return result;
	} 
	
	public static String findOccurrences(String s1, String s2) {
		String positions = "";
		int index = s1.indexOf(s2);
		
		while (index != -1) {
			if (!positions.isEmpty()) {
				positions += ",";
			}
			
			positions += index;
			index = s1.indexOf(s2, index + 1);
		}
		
		return positions; 		
	}
	
	public static double sumReciprocals(int n) {
		double sum = 0; 
		for (double i = n; i > 0; i--) {
			sum = sum + (1/i);
		}
		
		return sum;
	}
	
	
	public static String findLicensePlate(String s) {
	    // Combine both regexes into one pattern, using non-capturing groups
	    String combinedRegex = "(?:[A-Z]{3}\\d{3})|(?:[A-Z]{4}\\d{3})";
	    
	    Pattern pattern = Pattern.compile(combinedRegex);
	    Matcher matcher = pattern.matcher(s);

	    if (matcher.find()) {
	        return "Found match " + matcher.group();
	    } else {
	        return "-1";
	    }
	}
	
	public static List<String> findTelephoneNumbers(String s) {
		String phoneRegex = "\\+?1?[-.\\s]?\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
		
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher matcher = pattern.matcher(s);
		
		List<String> phoneNumbers = new ArrayList<>();
		
		while(matcher.find()) {
			phoneNumbers.add(matcher.group());
		}
		
		return phoneNumbers;
	}
	
	public static List<String> findHeights(String s) {
		String heightRegex = "\\d{1,2}'\\d{1,2}\"";
		
		Pattern pattern = Pattern.compile(heightRegex);
		Matcher matcher = pattern.matcher(s);
		
		List<String> heights = new ArrayList<>();
		
		while(matcher.find()) {
			heights.add(matcher.group());
		}
		
		return heights;
	}
	
	public static String findLargestWord(String s) {
		String[] words = s.split("\\s+");
		
		String largestWord = "";
		
		// Iterate through the array of words
		for (String word : words) {
			if(word.length() > largestWord.length()) {
				largestWord = word;
			}
		}
		
		return largestWord;
	}
	
	public static String findMostFrequenceAminoAcid(String s) {
		if (!s.matches("[ACGT]+")) {
			return "Invalid DNA strand";
		}
		
		if (!s.startsWith("ATG")) {
			return "Invalid DNA strand";
		}
		
		if (s.length() % 3 != 0) {
			return "Invalid DNA strand";
		}
		
		Map<String, Integer> aminoAcidCounts = new HashMap<>();
		for (int i = 0; i < s.length(); i += 3) {
			String codon = s.substring(i, i+3);
			aminoAcidCounts.put(codon, aminoAcidCounts.getOrDefault(codon, 0) + 1);
		}
		
		String mostFrequentAminoAcid = null;
		int maxCount = 0;
		
		for (Map.Entry<String, Integer> entry : aminoAcidCounts.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFrequentAminoAcid = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		
		return mostFrequentAminoAcid;
	}
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<Integer>();
		
		
		for (int element : set1) {
			if (set2.contains(element)) {
				result.add(element);
			}
		}
		
		return result;
	}
	
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<Integer>();
		
		for (int element : set1) {
			result.add(element);
		}
		
		for (int element : set2) {
			result.add(element);
		}
		
		return result;
	}
	
	public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
		Map<Integer, List<String>> result = new TreeMap<Integer, List<String>>();
		
		for (String k : map.keySet()) {
			int v = map.get(k);
			if(!result.containsKey(v)) {
				List<String> list = new ArrayList<String>();
				list.add(k);
				result.put(v, list);
			} else {
				List<String> existing = result.get(v);
				existing.add(k);
			}
		}
		
		return result; 
	}
	
 }
