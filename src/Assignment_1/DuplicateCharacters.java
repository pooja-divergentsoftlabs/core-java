package Assignment_1;

public class DuplicateCharacters {
	
		public static void main(String args[]) {

			// • Write a program that counts duplicate characters from a given string.

			String name = "pooojaaaa";

			char c[] = name.toCharArray();

			for (int i = 0; i < name.length(); i++) {

				int count = 1;

				for (int j = i + 1; j < name.length(); j++) {

					if (c[i] == c[j] && c[j] != 0) {

						count++;
						c[j] = '0';

					}

				}

				if (count > 1 && c[i] != '0') {
					System.out.println(c[i]);
				}
			}

		}
	}


