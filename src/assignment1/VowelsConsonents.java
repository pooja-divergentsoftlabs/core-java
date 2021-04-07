package assignment1;

public class VowelsConsonents {
	public static void main(String args[]) {
		
		//•	Write a program that counts the number of vowels and consonants in a given string.
				// Do this for the English language, which has five vowels (a, e, i, o, and u).

				String str = "Assingnemt";
				str = str.toLowerCase();

				int vcount = 0;
				int ccount = 0;

				for (int i = 0; i < str.length(); i++) {

					if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
							|| str.charAt(i) == 'u') {

						vcount++;
					}

					else {
						ccount++;
					}

				}

				System.out.println("vowels=" + vcount);
				System.out.println("consonents=" + ccount);

			}


}
