// Zain Aldin Zaher Alnaem, Melvyn Wilbert Tjandra
//Binaere Suche
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Versuch3Aufgabe5 {
	public static void wortsuche(String[] array, int arraygroesse, String suche) {
		int li = 0;
		int mi = arraygroesse / 2;
		int re = arraygroesse - 1;

		while ((li != mi || mi != re)) {
			System.out.println("a");
			if (suche.equals(array[mi])) {
				break;
			} else {
				if (suche.compareTo(array[mi]) > 0) {
					li = mi + 1;
					mi = (li + re) / 2;
				} else if (suche.compareTo(array[mi]) < 0) {
					re = mi - 1;
					mi = (li + re) / 2;
				}
			}
		}

		if (suche.equals(array[mi])) {
			System.out.println("\n>>\"" + suche + "\" an Pos. " + mi + " gefunden");
		} else {
			System.out.println("\n>>\"" + suche + "\" nicht gefunden");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arraygroesse;
		String eingabe;

			System.out.println("\n>>Wie viele Woerter moechten Sie eingeben?");
			System.out.print("Eingabe: ");
			while (true) {
				try {
					arraygroesse = scan.nextInt();
					if (arraygroesse < 6) {
						System.out.println(">>Ihre Eingabe ist kleiner als 6. Bitte geben Sie einen anderen Wert ein.");
						System.out.print("Eingabe: ");
						continue;
					}
					break;
				} catch (InputMismatchException error) {
					System.out.println(">>Ihre Eingabe ist keine ganze Zahl. Bitte geben Sie einen anderen Wert ein.");
					System.out.print("Eingabe: ");
					scan.nextLine();
				}
			}

			scan.nextLine(); // Contains the enter input from the "arraygroesse"
			System.out.print("\n");
			String[] array = new String[arraygroesse];
			for (int i = 0; i < arraygroesse; i++) {
				System.out.print("Wort " + (i) + ": ");
				array[i] = scan.nextLine();
			}

			Arrays.sort(array);
			System.out.println();
			System.out.println("Eingegebene Woerter in alphabetischer Reigenfolge: ");
			System.out.println(Arrays.toString(array));

			do {
			System.out.println("\n>>Bitte geben Sie ein zu suchendes Wort ein.");
			System.out.print("Eingabe: ");
			String suche = scan.nextLine();

			wortsuche(array, arraygroesse, suche);

			System.out.println("\n>>Moechten Sie das Programm erneut ausf�hren?");
			System.out.print("Eingabe: ");
			eingabe = scan.nextLine();
			while (!eingabe.equals("J") && !eingabe.equals("N")) {
				System.out.println(">>Bitte nur entweder \"J\" (ja) oder \"N\" (nein) eingeben.");
				System.out.print("Eingabe: ");
				eingabe = scan.nextLine();
			}
		} while (eingabe.equals("J"));

		System.out.println();
		System.out.println(">>Das Programm ist beendet.");

	}
}
