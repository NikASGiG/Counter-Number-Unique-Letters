package ua.foxminded.nikasgig.counternumberuniqueletters;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Counter Number Unique Letters!");
		boolean isInfinityLoop = false;
		Formatter formatter = new Formatter();
		LettersCounter lettersCounter = new LettersCounter();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------");
			System.out.print("Input your String: ");
			String inputLine = scanner.nextLine();
			System.out.println("----------");
			System.out.println(formatter.format(lettersCounter.count(inputLine)));
			System.out.println("----------");
		} while (isInfinityLoop);
		scanner.close();
	}

}
