
//Erzeugen von Pseudozufallszahlen
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Versuch3Aufgabe1 {
	public static void formell(int a, int b, int m, int z) {
		int ausgabe;
		ausgabe = (a * z + b) % m;
		System.out.println("\n>>(" + a + "*" + z + "+" + b + ")%" + m);
		System.out.println(">>Das Ergebnis ist " + ausgabe + ".");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, m;
		int z = (int) (Math.random() * 100);

		System.out.println(
				">>Dieses Programm berechnet die Formel (a*z+b)%m. Jede Variable außer z wird vom Benutzer eingegeben.");
		System.out.println(">>Die Variable \"z\" enthält die Zufallszahl " + z + ".");

		System.out.println("\n>>Bitte geben Sie für die Variable \"a\" eine Ganzzahl ein.");
		System.out.print("Eingabe: ");
		while (true) {
			try {
				a = scan.nextInt();
				break;
			} catch (InputMismatchException error) {
				System.out.println(">>Die Eingabe muss eine ganze Zahl sein. Bitte geben Sie einen anderen Wert an.");
				System.out.print("Eingabe: ");
				scan.nextLine();
			}
		}

		System.out.println("\n>>Bitte geben Sie für die Variable \"b\" eine Ganzzahl ein.");
		System.out.print("Eingabe: ");
		while (true) {
			try {
				b = scan.nextInt();
				break;
			} catch (InputMismatchException error) {
				System.out.println(">>Die Eingabe muss eine ganze Zahl sein. Bitte geben Sie einen anderen Wert an.");
				System.out.print("Eingabe: ");
				scan.nextLine();
			}
		}

		System.out.println("\n>>Bitte geben Sie für die Variable \"m\" eine Ganzzahl ein.");
		System.out.print("Eingabe: ");
		while (true) {
			try {
				m = scan.nextInt();
				break;
			} catch (InputMismatchException error) {
				System.out.println(">>Die Eingabe muss eine ganze Zahl sein. Bitte geben Sie einen anderen Wert an.");
				System.out.print(">>Eingabe: ");
				scan.nextLine();
			}
		}

		formell(a, b, m, z);

	}
}
