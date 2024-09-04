package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordSmith {
	private String sentence; 
	private String[] sentenceArray;
	private Set<String> distinctWords;
	
	public WordSmith(String s) {
		this.sentence = s; 
		this.sentenceArray = splitSentenceIntoWords();
		this.distinctWords = allDistinctWords();
	}
	
	private String[] splitSentenceIntoWords() {
		if (sentence == null || sentence.isEmpty()) {
			return new String[0];
		}
		
		return sentence.split("[ .,;!?:]+");
	}
	
	public String[] getAllWords() {
		return sentenceArray;
		
	}
	
	private Set<String> allDistinctWords() {
		Set<String> distinctWords = new TreeSet<String>();
		for (String word : sentenceArray) {
			String wordLowerCase = word.toLowerCase();
			distinctWords.add(wordLowerCase);
		}
		
		return distinctWords;
	}
	
	public Set<String> getAllDistinctWords() {
		return distinctWords;
	}
	
	public String getLongestWord() {
		String longestWord = "";
		for (String word : distinctWords) {
			if (word.length() > longestWord.length())
				longestWord = word;
		}
		
		return longestWord;
	}
	
	public Map<String, Integer> getMostFrequentWord() {
		Map<String, Integer> wordFrequencyMap = new TreeMap<String, Integer>();
		Map<String, Integer> mostFrequentWordCount = new HashMap<String, Integer>();
		String mostFrequentWord = "";
		int count = 0; 
		
		
		for (String word : sentenceArray) {
			String wordLowerCase = word.toLowerCase();
			if (!wordFrequencyMap.containsKey(wordLowerCase)) {
				wordFrequencyMap.put(wordLowerCase, 1);
			} else {
				int oldCount = wordFrequencyMap.get(wordLowerCase);
				int newCount = oldCount + 1; 
				
				wordFrequencyMap.put(wordLowerCase, newCount);
			}
		}
		
		for (String word : wordFrequencyMap.keySet()) {
			if(wordFrequencyMap.get(word) > count) {
				count = wordFrequencyMap.get(word);
				mostFrequentWord = word;
			}
		}
		mostFrequentWordCount.put(mostFrequentWord, count);
		return mostFrequentWordCount; 
	}
}
