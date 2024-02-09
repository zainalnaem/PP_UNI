
public class PPA3_1V2 {
//Ausgabe einer Zahlenfolge
	public static void main(String[] args) {
		// • Ihr Algorithmus enthält nur eine Schleife, deren Laufindex die Zahlenwerte
		// von 0 bis 99 durchläuft

		for (int i = 0; i <= 99; i++) {

			if ((i % 10 == 7) || (i / 10 == 7) || (i % 7 == 0 && i != 0)) {
				System.out.print(" bumm\n");
			} else {
				System.out.print(" " + i);
			}
		}
		System.out.println("\n---------------------");
		// • Ihr Algorithmus enthält zwei geschachtelte Schleifen. Der Laufindex der
		// äußeren Schleife durchläuft für die Zehnerstelle
		// der Zahl den Bereich 0 bis 9, der Laufindex der inneren Schleife tut dasselbe
		// für die Einerstelle der Zahl
		int i, j;
		for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				if (j == 7) {
					System.out.println("bumm");
				} else {
					int ausgabe = i * 10 + j; 
					if (ausgabe == 0) {
						System.out.println("0");

					} else if (ausgabe % 7 == 0 || (ausgabe / 10 == 7)) {
						System.out.println("bumm");
					} else {
						System.out.println(ausgabe);
					}
				}
			}
		}

	}

}
