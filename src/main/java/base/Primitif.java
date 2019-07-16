package base;

public class Primitif {

	public static void main(String[] args) {
		System.out.println("byte [" + Byte.MIN_VALUE + " -> " + Byte.MAX_VALUE + "]");
		byte b = -6;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		int i = b & 0xFF;
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
	}

}
