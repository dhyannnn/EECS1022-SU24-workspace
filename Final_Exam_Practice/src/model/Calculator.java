package model;

public class Calculator {
	private int total;
	
	public void add(int value) {
		this.total += value;
	}
	
	public int getTotal() {
		return total;
	}
}