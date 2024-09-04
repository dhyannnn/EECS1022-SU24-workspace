package console_apps;

import model.Calculator;
import model.EnergyCalculator;
import model.LogCompute;
import model.MC;
import model.StaticAdd;
import model.StringExercise;
import model.TempCheck;
import model.Test2Practice;
import model.FindDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.*;


public class PracticeApp {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("John", 23);
		m.put("Mary", 22);
		m.put("Paul", 19);
		m.put("Kyle", 19);
		m.put("Monroe", 22);
		
		List<String> list = new ArrayList<>();
		list.add("Jon");
		list.add("Jon");
		list.add("Mary");
		list.add("Paul");
		
		System.out.println(FindDuplicates.hasDuplicates(list));
		System.out.println(FindDuplicates.iteratorCheck(list));
		System.out.println(FindDuplicates.setCheck(list));
		System.out.println(FindDuplicates.traverseCheck(list));
		
		System.out.println(Test2Practice.invertMap(m));
		
		System.out.println('A'+ 4);
		
		
	}
}
