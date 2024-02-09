import java.util.InputMismatchException;
import java.util.Scanner;

public class PPVersuch2Aufgabe2 {
//Verschlüsselung von Wörtern mit der Cäsarchiffre
	public static void main(String[] args) {

		int n = 0;

		System.out.println("Bitte geben Sie eine Ganzzahl(n) zwischen 1 und 25 ein:");
		boolean input = false;
		while (!input) {
			try {
				Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
				if (n > 25 || n < 1) {
					System.out.println("Bitte nur Zahlen zwischen 1 und 25 eingeben.");

					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Bitte nur ganze Zahlen eingeben. Versuchen Sie nochmal.");

			}
		}

		StringBuffer sb = new StringBuffer();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zeichenkette.");
		sb.append(scan1.nextLine());

		System.out.print("Soll die Zeichenkette entschlüsselt(E) oder verschlüsselt(V) werden? ");
		Scanner scan2 = new Scanner(System.in);
		String eingabe = scan2.nextLine();

		while (!eingabe.equals("E") && !eingabe.equals("V")) {
			System.out.println("Bitte nur (E) für Entschlüsseln, oder (V) für Verschlüsseln eingeben.");
			eingabe = scan2.nextLine();
		}
		if (eingabe.equals("V")) {
			for (int i = 0; i < sb.length(); i++) {
				int charErgebnis = sb.charAt(i);

				if (charErgebnis >= 65 && charErgebnis <= 90 || charErgebnis >= 97 && charErgebnis <= 122) {
					String ausgabe = String.valueOf((char) (charErgebnis + n));
					if (((charErgebnis) >= 65 && (charErgebnis) <= 90 && (charErgebnis + n) >= 91
							&& (charErgebnis + n) <= 115) || (charErgebnis + n) >= 123) {
						int charErgebnis1 = (charErgebnis + n) - 26;
						ausgabe = String.valueOf((char) (charErgebnis1));
					}
					StringBuffer sb1 = new StringBuffer();
					sb1.append(ausgabe);
					System.out.print(sb1);
				} else {
					String ausgabe = String.valueOf((char) (charErgebnis));
					StringBuffer sb1 = new StringBuffer();
					sb1.append(ausgabe);
					System.out.print(sb1);
				}
			}

		} else {
			for (int j = 0; j < sb.length(); j++) {
				int charErgebnis = sb.charAt(j);
				if (charErgebnis >= 65 && charErgebnis <= 90 || charErgebnis >= 97 && charErgebnis <= 122) {
					String ausgabe = String.valueOf((char) (charErgebnis - n));
					if ((charErgebnis<=90 && (charErgebnis - n)>=97) || (charErgebnis>=97 && (charErgebnis - n)<97) )
					
//					if ((((charErgebnis) >= 97 && (charErgebnis) <= 122 && (charErgebnis - n) >= 72
//							&& (charErgebnis - n) <= 96)) || (charErgebnis - n) >= 123)
						{
						int charErgebnis1 = (charErgebnis - n) + 26;
						ausgabe = String.valueOf((char) (charErgebnis1));
					}
					StringBuffer sb1 = new StringBuffer();
					sb1.append(ausgabe);
					System.out.print(sb1);
				} else {
					String ausgabe = String.valueOf((char) (charErgebnis));
					StringBuffer sb1 = new StringBuffer();
					sb1.append(ausgabe);
					System.out.print(sb1);
				}
			}
		}

	}
}
	
