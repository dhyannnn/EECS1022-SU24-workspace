package model;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {
	
	// Method 1: Sort the list and then traverse it to check for adjacent duplicates
	public static <T> boolean hasDuplicates(List<T> list) {
	    Set<T> set = new HashSet<>();
	    for (T element : list) {
	        if (!set.add(element)) {
	            return true; // Duplicate found
	        }
	    }
	    return false; // No duplicates found
	}
	
	public static <T> boolean setCheck(List<T> list) {
	    Set<T> tmp = new HashSet<>();

	    // Add elements to the set and check if they were already present
	    for (T element : list) {
	        if (!tmp.add(element)) {
	            return true; // Duplicate found
	        }
	    }
	    
	    return false; // No duplicates found
	}
	
	// Method 3a: Traverse the list, and for each element, traverse the list again to check for duplicates
	public static <T> boolean traverseCheck(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					return true; 
				}
			}
		}
		
		return false;
	}
	
	// Method 3b: Traverse the list, and for each element, traverse the list again to check for duplicates 
	public static <T> boolean iteratorCheck(List <T> list) {
		Iterator<T> outer = list.iterator();
		while(outer.hasNext()) {
			T x = outer.next();
			Iterator<T> inner = list.iterator();
			
			// Skip elements up to the current element in the outer loop
	        while (inner.hasNext()) {
	            T y = inner.next();
	            if(x.equals(y)) {
	            	break;
	            }
	        }
	        
			while(inner.hasNext()) {
				T y = inner.next();
				if (x.equals(y)) {
					return true; 
				}
			}
		}
		
		return false; 
	}
}
