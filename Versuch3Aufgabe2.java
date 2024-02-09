
//Erzeugen von Pseudozufallszahlen
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Versuch3Aufgabe2 {
	public static int formell(int a, int b, int m, int z) {
		int ausgabe;
			z = (a * z + b) % m;
			System.out.println("Das Ergebnis ist " + z + ".");
		return z;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, m;
		int z = (int) (Math.random() * 100);

		System.out.println(
				">>Dieses Programm berechnet die Formel (a*z+b)%m. Jede Variable au�er z wird vom Benutzer eingegeben.");
		System.out.println(">>Die Variable \"z\" enth�lt die Zufallszahl " + z + ".");

		System.out.println("\n>>Bitte geben Sie f�r die Variable \"a\" eine Ganzzahl ein.");
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

		System.out.println("\n>>Bitte geben Sie f�r die Variable \"b\" eine Ganzzahl ein.");
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

		System.out.println("\n>>Bitte geben Sie f�r die Variable \"m\" eine Ganzzahl ein.");
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
		for (int i = 0; i < 20; i++) {
		z=formell(a, b, m, z);
		}

	}
}
