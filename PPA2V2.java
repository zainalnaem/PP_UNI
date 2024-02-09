import java.util.InputMismatchException;
import java.util.Scanner;
public class PPA2V2 {
//Verschlüsselung von Wörtern mit der Cäsarchiffre
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;

		// User input on how many times the letters are to be shifted
		System.out.println(
				">>Geben Sie einen Wert zwischen 1 bis 25 ein, um den die Buchstaben der Nachricht verschoben werden sollen.");
		System.out.print("Eingabe: ");
		while (true) {
			try {
				n = scan.nextInt();
				if (n > 25 || n < 1) {
					System.out.println();
					System.out.println(">>Der Wert der Eingabe sollte im Bereich von 1 bis 25 liegen.");
					System.out.print("Eingabe: ");
					continue;
				}
				break;
			} catch (InputMismatchException error) {
				System.out.println();
				System.out.println(">>Die Eingabe muss eine ganze Zahl sein. Bitte geben Sie einen anderen Wert an.");
				System.out.print("Eingabe: ");
				scan.nextLine();
			}
		}

		// Input of characters
		System.out.println();
		System.out.println(
				">>Bitte geben Sie einen Text ein, der entweder verschluesselt oder entschluesselt werden soll.");
		System.out.print("Eingabe: ");
		StringBuffer sb = new StringBuffer();
		sb.append(scan.nextLine());
    	sb.append(scan.nextLine());

		// Choice to encrypt or decrypt
		System.out.println();
		System.out.print(">>Entschluesseln (E) oder verschluesseln (V): ");
		String eingabe = scan.nextLine();

		// Checks for encryption or decryption
		while (!eingabe.equals("E") && !eingabe.equals("V")) {
			System.out.println();
			System.out.println(">>Bitte nur entweder \"E\" (entschluesseln) oder \"V\" (verschluesseln) eingeben.");
			System.out.print("Eingabe: ");
			eingabe = scan.nextLine();
		}

		// Encryption process
		if (eingabe.equals("V")) { // Verschluesseln (encrypts)
			System.out.println();
			System.out.println(">>Verschluesselter Text: ");
			for (int i = 0; i <= sb.length() - 1; i++) { // Digit reader
				int asciivalue = sb.charAt(i); // Reads the ASCII value of the character at digit i
				if (asciivalue >= 65 && asciivalue <= 90 || asciivalue >= 97 && asciivalue <= 122) { // To detect only
																										// letters
					String encryptedvalue_string = String.valueOf((asciivalue + n)); // Original ASCII value + n shifts
					int encryptedvalue_int = Integer.parseInt(encryptedvalue_string); // Converts String to int
					if ((asciivalue <= 90 && encryptedvalue_int > 90)
							|| (asciivalue >= 97 && encryptedvalue_int > 122)) { // ASCII parameters for capital and
																					// lower case letters
						int ausgabe_int = encryptedvalue_int - 26; // +26 loops back the alphabet
						System.out.print(String.valueOf((char) (ausgabe_int))); // Shifted value in text form
					} else {
						System.out.print(String.valueOf((char) (asciivalue + n))); // Original ASCII value + n shifts
																					// printed in text form
					}
				} else { // So other characters other than letters remain the same
					System.out.print(String.valueOf((char) (asciivalue))); // Just the original ASCII value printed in
																			// text form
				}
			}
		}
		// Decryption process
		else { // Entschluesseln (decrypts)
			System.out.println();
			System.out.println(">>Entschluesselter Text: ");
			for (int i = 0; i <= sb.length() - 1; i++) { // Digit reader

				int asciivalue = sb.charAt(i); // Reads the ASCII value of the character at digit i
				if (asciivalue >= 65 && asciivalue <= 90 || asciivalue >= 97 && asciivalue <= 122) {
					String decryptedvalue_string = String.valueOf((asciivalue - n)); // Original ASCII value - n shifts
					int decryptedvalue_int = Integer.parseInt(decryptedvalue_string); // Converts String to int
					if ((asciivalue <= 90 && decryptedvalue_int < 65)
							|| (asciivalue >= 97 && decryptedvalue_int < 97)) { // ASCII parameters for capital and
																				// lower case letters
						int ausgabe_int = decryptedvalue_int + 26; // +26 loops back the alphabet
						System.out.print(String.valueOf((char) (ausgabe_int))); // Shifted value in text form
					} else {
						System.out.print(String.valueOf((char) (asciivalue - n))); // Original ASCII value + n shifts
																					// printed in text form
					}
				} else { // So other characters other than letters remain the same
					System.out.print(String.valueOf((char) (asciivalue))); // Just the original ASCII value printed in
																			// text form
				}
			}
		}
	}

}
