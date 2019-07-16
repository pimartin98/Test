package base;

public class ByteBinaire {

	public static void main(String[] args) {
		for (int b = Byte.MIN_VALUE; b <= Byte.MAX_VALUE; ++b) {
			System.out.println(b + " : " + Integer.toBinaryString(b & 0xFF));
		}
	}
}
