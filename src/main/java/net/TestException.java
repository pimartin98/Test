package net;

public class TestException {

	public static void main(String[] args) {
		int r = 0;
		try {
			r = divide(4, 0);
		} catch (ArithmeticException | MonException e) {
			r = 7;
			e.printStackTrace();
		}
		System.out.println(r);
	}

	static int divide(int a, int b) throws MonException {
		if (a > 3) {
			throw new MonException();
		}
		return a / b;
	}
}
