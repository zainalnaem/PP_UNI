//Gegeben ist eine Variable c vom Datentyp char, welche einen Gro�buchstaben enth�lt. Den jeweiligen Gro�buchstaben (frei w�hlbar) soll der Benutzer von der Tastatur einlesen k�nnen.

//Schreiben Sie ein Javaprogramm, welches den Buchstaben ausgibt, der im Alphabet zwei Positionen hinter dem Wert von c steht. Verwenden Sie dabei eine zyklische Vorgehensweise, d.h. nach "Z" wieder zur�ck zu "A".

//Wenn ein fehlerhafter Wert (kein Gro�buchstabe) eingegeben wurde, dann soll der Benutzer zu einer erneuten korrekten Eingabe aufgefordert werden.

import java.util.Scanner;

public class ppHausaufgabe3 {
//Aufgabe4
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c=0;
		 System.out.print("Bitte geben Sie einen Buchstabe ein: ");
		 String s=Character.toString(c);
	     Scanner sc = new Scanner(System.in);
	     s = sc.nextLine(); 
	 
		while(!s.matches("[A-Z]")){ 
			System.out.println("Bitte geben Sie nur zul�ssige Buchstabe ein. \nVersuchen Sie nochmal");
		 s=sc.nextLine();
		 
		} while(s.matches("[Y]")) {
			System.out.println("Der Buchstabe, der im Alphabet zwei Positionen hinter dem Wert von Y steht, \nist: A");
			s=sc.nextLine();
		} while(s.matches("[Z]")) {
			System.out.println("Der Buchstabe, der im Alphabet zwei Positionen hinter dem Wert von Z steht, \nist: B");
			s=sc.nextLine();
		}
		
		
	   int charErgebnis = s.charAt(0);
	     String S2 = String.valueOf( (char) (charErgebnis + 2));
	     System.out.println("Der Buchstabe, der im Alphabet zwei Positionen hinter dem Wert von " +s + " steht, \nist: " + S2);
	}

}
