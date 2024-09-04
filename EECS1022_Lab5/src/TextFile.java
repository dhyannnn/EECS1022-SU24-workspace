
/**
 * @author <Dhyan Thakkar 218046946>
 * This class implements an object that stores text contents loaded from a file.
 * It also contains methods that:
 * - return the text contents as a List of words
 * - compute the word and letter frequencies and return those as a Map
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextFile {
	
	private String filePath;
	private List<String> words;
	
	
	//add a constructor which takes the file name as a parameter
	public TextFile(String filePath) {
		this.filePath = filePath;
		this.words = new ArrayList<>();
		
		loadText();
	}

	//add a method that returns a List where each item is a word from a file
	//a word is any sequence of one or more characters separated with spaces
	//or punctuation characters
	private void loadText() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\W+");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<String> getWords() {
        return new ArrayList<>(words);
    }
    
	//add a method that computes letter frequencies in the text file
	//it treats lowercase and upppercase characters as one character
	//the method returns a Map object of Character to Integer (characters are
	//uppercase letters
	
    public Map<Character, Integer> getLetterFrequencies() {
        Map<Character, Integer> letterFrequencies = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                char upperChar = Character.toUpperCase(c);
                if (Character.isLetter(upperChar)) {
                    if (letterFrequencies.containsKey(upperChar)) {
                        int count = letterFrequencies.get(upperChar);
                        letterFrequencies.put(upperChar, count + 1);
                    } else {
                        letterFrequencies.put(upperChar, 1);
                    }
                }
            }
        }
        return letterFrequencies;
    }

	//add a method that computes word frequencies in the text file
	//the method returns a Map object of String to Integer
    public Map<String, Integer> getWordFrequencies() {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (wordFrequencies.containsKey(lowerWord)) {
                int count = wordFrequencies.get(lowerWord);
                wordFrequencies.put(lowerWord, count + 1);
            } else {
                wordFrequencies.put(lowerWord, 1);
            }
        }
        return wordFrequencies;
    }
}
