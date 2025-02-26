package Task11;

import java.util.Scanner;

public class Q3InvalidAgeException extends Exception {
	// using parametrised constrctor to set the title
	public Q3InvalidAgeException(String expmesge) {
		super(expmesge);
	}

	public static void ageException() throws Q3InvalidAgeException {
		System.out.println("please enter the age of the user");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("entered age is valid");
		} else {
			throw new Q3InvalidAgeException("invalid age exception");
		}
	}

	public static void main(String[] args) {
		try {
			ageException();
		} catch (Q3InvalidAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			// System.out.println(e.);

		}
	}

}
