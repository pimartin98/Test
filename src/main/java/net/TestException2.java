package net;

import java.util.List;

public class TestException2 {

	public static void main(String[] args) {
		List<String> list = createList();
		try {
			list.add("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("zz");
	}

	static List<String> createList() {
		return null;
	}

}
