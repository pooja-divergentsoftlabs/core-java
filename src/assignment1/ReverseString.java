package assignment1;

public class ReverseString {
	
	//•	Write a program that reverses the letters of each word and a program that
//	reverses the letters of each word and the words themselves.

	public static void main(String args[]) {

		String name = "pooja_patidar";

		for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));
		}

	}

}
