
//Berechnung eines "Hash-Wertes"
import java.util.Scanner;
import java.util.InputMismatchException;

public class Versuch3Aufgabe3 {
	public static String hashwert(String s) {
		int buchstabe[] = new int[40];
		int hashvalue = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			buchstabe[i] = s.charAt(i);
			hashvalue = hashvalue + buchstabe[i];
		}
		System.out.print(hashvalue);
		return String.valueOf(hashvalue);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		int m, ausgabe;
		String eingabe;
		String s1 = Character.toString(c1);
		String s2 = Character.toString(c2);
		String s3 = Character.toString(c3);
		String s4 = Character.toString(c4);

		do {
			System.out.println(
					"\n>>Dieses Programm berechnet den Hash-Wert von 4 Benutzereingaben mit der Formel (c1+c2+c3+c4)%m.");
			System.out.println();
			System.out.println(">>Bitte geben Sie den ersten String ein.");
			System.out.print("Einegabe: ");
			s1 = scan.nextLine();
			while (!s1.matches("[a-zA-Z]+")) {
				System.out.println(
						">>Die bereitgestellte Eingabe enthaelt ein Zeichen, das kein Buchstabe ist. Bitte geben Sie nur Buchstaben aus dem englischen Alphabet ein.");
				System.out.print("Eingabe: ");
				s1 = scan.nextLine();
			}

			System.out.println("\n>>Bitte geben Sie den zweiten String ein.");
			System.out.print("Einegabe: ");
			s2 = scan.nextLine();
			while (!s2.matches("[a-zA-Z]+")) {
				System.out.print(
						">>Die bereitgestellte Eingabe enthält ein Zeichen, das kein Buchstabe ist. Bitte geben Sie nur Buchstaben aus dem englischen Alphabet ein.");
				System.out.print("Einegabe: ");
				s2 = scan.nextLine();
			}

			System.out.println("\n>>Bitte geben Sie den dritten String ein.");
			System.out.print("Einegabe: ");
			s3 = scan.nextLine();
			while (!s3.matches("[a-zA-Z]+")) {
				System.out.print(
						">>Die bereitgestellte Eingabe enthält ein Zeichen, das kein Buchstabe ist. Bitte geben Sie nur Buchstaben aus dem englischen Alphabet ein.");
				System.out.print("Einegabe: ");
				s3 = scan.nextLine();
			}

			System.out.println("\n>>Bitte geben Sie den vierten String ein.");
			System.out.print("Einegabe: ");
			s4 = scan.nextLine();
			while (!s4.matches("[a-zA-Z]+")) {
				System.out.print(
						">>Die bereitgestellte Eingabe enthält ein Zeichen, das kein Buchstabe ist. Bitte geben Sie nur Buchstaben aus dem englischen Alphabet ein.");
				System.out.print("Einegabe: ");
				s4 = scan.nextLine();
			}

			System.out.println("\n>>Bitte geben Sie für die Variable \"m\" eine Ganzzahl ein.");
			System.out.print("Eingabe: ");
			while (true) {
				try {
					m = scan.nextInt();
					break;
				} catch (InputMismatchException error) {
					System.out
							.println(">>Die Eingabe muss eine ganze Zahl sein. Bitte geben Sie einen anderen Wert an.");
					System.out.print("Eingabe: ");
					scan.nextLine();
				}
			}

			System.out.println("\n>>Der Hashwert wird mit der Formel (c1+c2+c3+c4)%m berechnet.");
			System.out.println(">>(" + s1 + "+" + s2 + "+" + s3 + "+" + s4 + ")%" + m);
			System.out.print(">>(");
			s1 = hashwert(s1);
			System.out.print("+");
			s2 = hashwert(s2);
			System.out.print("+");
			s3 = hashwert(s3);
			System.out.print("+");
			s4 = hashwert(s4);
			System.out.println(")%" + m);

			ausgabe = (Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3) + Integer.parseInt(s4)) % m; // Converts
																														// String
																														// to
																														// integer

			System.out.println(">>Der Hash-Wert der Eingabe ist " + ausgabe + ".");

			System.out.print("\n>>Moechten Sie das Programm erneut ausfuehren?");
			eingabe = scan.nextLine();
			while (!eingabe.equals("J") && !eingabe.equals("N")) {
				System.out.println();
				System.out.println(">>Bitte nur entweder \"J\" (ja) oder \"N\" (nein) eingeben.");
				System.out.print("Eingabe: ");
				eingabe = scan.nextLine();
			}
		}

		while (eingabe.equals("J"));

		System.out.println();
		System.out.println(">>Das Programm ist beendet.");

	}
}
