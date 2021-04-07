package Assignment_1;

public class StringcontainDigits {
	
	public static void main(String args[]) {

		// • Write a program that checks whether the given string contains only digits.

		String digit = "123789588";

		if (digit.matches("[0-9]+")) {
			System.out.println("String only contain digits");

		} else {
			System.out.println("Does not contain digits");
		}
	}

}
