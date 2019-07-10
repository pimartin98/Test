package opcr;

public class Exceptions {

	public static void main(String[] args) {

		int j = 20, i = 0;

		try {
			System.out.println(j / i);
		} catch (Exception e) {
			System.out.println("division par 0");

			System.out.println(e.getMessage());

			e.printStackTrace();
		} finally {
			System.out.println("action faite ");
		}

	}

}
