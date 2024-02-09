//Berechung einer Zufallszahl

import java.util.Random;
import java.util.Scanner;

public class PPVersuch3Aufgabe1 {
	static void myMethod(int a, int b, int m, int z) {

		z = (a * z + b) % m;
		System.out.println("\nDas Ergebnis nach der Formel (a*z+b)%m ist: " + z);

	}

	public static void main(String[] args) {

		Random rand = new Random();
		int max = 1000;
		int a = 0, b = 0, m = 0;
		int z = rand.nextInt(max);
		System.out.println("Die Zufallszahl (z) zwischen 0 und " + (max) + " ist" + " : " + z);

		boolean input = false;
		while (!input) {
			try {
				System.out.print("Bitte geben Sie die erste Zahl ein (a): ");
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
				System.out.print("\nBitte geben Sie die zweite Zahl ein (b): ");
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
				System.out.print("\nBitte geben Sie die dritte Zahl ein (m): ");
				Scanner sc = new Scanner(System.in);
				m = sc.nextInt();

				break;
			} catch (Exception e) {
				input = false;
				System.out.print("\nBitte nur ganze Zahlen eingeben ");

			}

		}

		myMethod(a, b, m, z);
	}

}
