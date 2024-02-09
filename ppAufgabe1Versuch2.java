import java.util.Scanner;
public class ppAufgabe1Versuch2 {
//Portnummern und Dienste im Internet
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(
					"möchten Sie das Programm beenden?\nWenn ja, geben Sie (ja) ein. Wenn nicht, geben Sie einen beliebigen Buchstaben ein");
			String input1 = scanner.nextLine();
			if (input1.equals("ja")) {
				break;
			}

			long s = 0;
			System.out.print("Bitte geben Sie ein Wert zwischen 0 und 65535 ein:\n");
			Scanner sc = new Scanner(System.in);
			s = sc.nextLong();

			while ((s < 0) || (s > 65535)) {

				boolean input = false;
				while (!input) {
					try {
						System.out.print("Bitte geben Sie ein Wert zwischen 0 und 65535 ein:\n");
						Scanner sc1 = new Scanner(System.in);
						s = sc1.nextLong();

						break;

					} catch (Exception e) {
						input = false;
						System.out.print("Bitte nur ganze Zahlen eingeben\n ");

					}

				}

			}
			if (s <= 1023) {
				System.out.print("\nDie Ports mit der Nummer " + s + " ist Well-known ports.\n");
				if (s == 21) {
					System.out.println("FTP(File Transfer Protocol, Übertragung von Dateien)");
				} else if (s == 23) {
					System.out.println("Telnet(Einloggen in entfernte Rechner)");
				} else if (s == 25) {
					System.out.println("SMTP(Sinple Mail Transfer Protocol,Mailversand)");
				} else if (s == 80) {
					System.out.println("HTTP(Hyper Transfer Protocol,Zugriff auf Web-Server");
				} else if (s == 143) {
					System.out.println("IMAP(Internet Message Access Protocol, Zugriff auf Mail-Server)");
				} else
					System.out.println("Sonstiger Dienst");
			} else if (s >= 1024 && s <= 49151) {
				System.out.print("Die Ports mit der Nummer " + s + " ist registered ports.");
			} else 
				System.out.print("Die Ports mit der Nummer " + s + " ist dynamic ports.");
//			} else
//				s = sc.nextLong();

			System.out.println("\nDas Programm wird erneut gestartet");

		}

		System.out.println("Aufwiedersehen!");

	}
}	

