package model;

public class MC {
	private int n;
	private int q;
	
	public MC(int value) {
		this.n = value - 6;
		this.q = 23;
	}
	
	public int getn() {
		return this.n;
	}
	
	public static void show(int n) {
		try {
			int m = 2/n;
			System.out.println(m == 2 * n);
		} catch (ArithmeticException e) {
			System.out.println("bad argument");
		}
	}
}
