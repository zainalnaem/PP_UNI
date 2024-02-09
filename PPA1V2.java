import java.util.InputMismatchException;
import java.util.Scanner;
public class PPA1V2 {
//Portnummern und Dienste im Internet
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		  int x; 
		  String eingabe;
		  String j = "J";
		  String n = "N";
	    
		  // do-while loop
		  // Runs the program WHILE the conditions in the while-loop are true
	    
		  do { 
			  System.out.println();
			  System.out.println(">>Wählen Sie eine Portnummer zwischen 0 und 65535.");
			  System.out.print("Eingabe: ");
			  while (true) {
				  try {
					  x = scan.nextInt();
					  if (x<0 || x>65535) {
						  System.out.println();
						  System.out.println(">>Ihre Eingabe lag nicht im Bereich von 0 bis 65535. Bitte geben Sie einen anderen Wert an.");
						  System.out.print("Eingabe: ");
						  continue;
					  }
					  break;
				  } catch (InputMismatchException error){
					  System.out.println();
					  System.out.println(">>Die Eingabe muss eine ganze Zahl sein. Bitte geben Sie einen anderen Wert an.");
					  System.out.print("Eingabe: ");
					  scan.nextLine(); 
				  }
			  }
	    
			  if (x == 21) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"registered port\". Der Dienst dieses Ports ist FTP (File Transfer Protocol, Uebertragung von Dateien).");
			  }
			  else if (x == 23) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"registered port\". Der Dienst dieses Ports ist Telnet (Einloggen in entfernte Rechner).");
			  }
			  else if (x == 25) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"registered port\". Der Dienst dieses Ports ist SMTP (Simple Mail Transfer Protocol, Mailversand).");
			  }
			  else if (x == 80) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"registered port\". Der Dienst dieses Ports ist HTTP (HyperText Tranfer Protocol, Zugriff auf Web-Server).");
			  }
			  else if (x == 143) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"registered port\". Der Dienst dieses Ports ist IMAP (Internet Message Access Protocol, Zugriff auf Mail-Server).");
			  }
			  else if (x <= 1023 && x != 21 && x != 23 && x != 25 && x != 80 && x != 143) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"well-known port\". Der Dienst dieses Ports ist â€žSonstiger Dienst\".");
			  }
			  else if (x >= 1024 && x <= 49151) {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"registered port\".");
			  }
			  else {
				  System.out.println();
				  System.out.println(">>Port " +x +" ist ein \"dynamic port\".");
			  } 
	    
			  System.out.println();
			  System.out.println(">>Möchten Sie dieses Programm erneut ausfähren? Bitten geben Sie \"J\" oder \"N\".");
			  System.out.print("Eingabe: ");
			  eingabe = scan.nextLine();
			  eingabe = scan.nextLine();
	    
			  while (!eingabe.equals(j) && !eingabe.equals(n)) {
				  System.out.println();
				  System.out.println(">>Bitte nur entweder \"J\" (ja) oder \"N\" (nein) eingeben.");
				  System.out.print("Eingabe: ");
				  eingabe = scan.nextLine();
			  }
	    
			  // While-loop condition(s)
		  } while (eingabe.equals(j)); {	
		  }

		  System.out.println();
		  System.out.println(">>Das Programm ist beendet.");

	}

}
