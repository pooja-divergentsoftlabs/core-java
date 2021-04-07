package assignment1;

public class OccurenceofCharacter {

	public static void main(String args[]) {
		// • Write a program that counts the occurrences of a certain character in a
		// given string.

		String str = "Neverever";
		str = str.toLowerCase();

		char c[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {

				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}

			System.out.print(c[i]);
			System.out.print(" =" + count);

		}

	}

}
