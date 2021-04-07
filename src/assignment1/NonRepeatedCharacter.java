package assignment1;

public class NonRepeatedCharacter {
	

		public static void main(String args[]) {

			// • Write a program that returns the first non-repeated character from a given
			// string.

			String name = "pooojaaaa";

			char c[] = name.toCharArray();

			for (int i = 0; i < name.length(); i++) {

				int count = 0;

				for (int j = i + 1; j < name.length(); j++) {

					if (c[i] != c[j]) {

						count++;

					}

				}

				System.out.println(count);
			}
		}

	}



