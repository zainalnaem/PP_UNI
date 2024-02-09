
// Aufgabe 1 Autor Zain Aldin Zaher Alnaem
import java.util.*;

public class ppHausaufgabe1 {
	
	public static void main(String[] args) {

		Random rand = new Random();
		int max = 1000;
		int a = 0, b = 0, m = 0, d;
		int z =rand.nextInt(max);
		System.out.println("Die Zufallszahl zwischen 0 und " + (max) + " ist" + " : " + z);

		boolean input = false;
		while (!input) {
			try {
				System.out.print("Bitte geben Sie die erste Zahl ein: ");
				Scanner sc = new Scanner(System.in);
				a = sc.nextInt();

				break;

			} catch (Exception e) {
				input = false;
				System.out.print("\nBitte nur ganze Zahlen eingeben ");

			}

		}

		while (!input) {
			try {
				System.out.print("\nBitte geben Sie die zweite Zahl ein: ");
				Scanner sc = new Scanner(System.in);
				b = sc.nextInt();
				break;
			} catch (Exception e) {
				input = false;
				System.out.print("\nBitte nur ganze Zahlen eingeben ");

			}

		}

		while (!input) {
			try {
				System.out.print("\nBitte geben Sie die dritte Zahl ein: ");
				Scanner sc = new Scanner(System.in);
				m = sc.nextInt();

				break;
			} catch (Exception e) {
				input = false;
				System.out.print("\nBitte nur ganze Zahlen eingeben ");

			}

		}
		for (int i = 0; i < 10; i++) {
			z = (a * z + b) % m;
			System.out.println("\nDas Ergebnis " + z);
		}

	}

}
