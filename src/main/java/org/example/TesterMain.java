package org.example;


public class TesterMain {
	public static void main(String[] args) {
		Tester tester = new Tester("Sasha", "Biziuk", 10, "B1", 500);
		System.out.println(tester.toString());
		System.out.println(Tester.print());
	}

}
