package model;

import java.util.Arrays;

public class StringExercise {
    private String string; 
    
    public StringExercise(String s) {
        this.string = s; 
    }
    
    public String getString() {
        return this.string; 
    }
    
    public void setString(String s) {
        this.string = s; 
    }
    
    public int repeatCount(char c) {
        int count = 0;
        int index = this.string.indexOf(c);
        
        while (index != -1) {
            count++;
            index = this.string.indexOf(c, index+1);
        }
        
        return count;
    }
    
    public int repeatCount(String c) {
        if (c.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = this.string.indexOf(c);
        
        while (index != -1) {
            count++;
            index = this.string.indexOf(c, index + c.length());
        }
        
        return count;
    }
    
    public static String toDayName(int d) {
        if (d < 0 || d > 6) {
            return "Invalid day number";
        }
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        return days[d];
    }
    
    public String trimLeadingBlanks() {
        return this.string.replaceFirst("^\\s+", "");
    }
}
