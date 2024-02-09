import java.util.Scanner;

public class ppHausaufgabe5 {
//Aufgabe5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		String s1,s2,s3;
        
				System.out.print("Bitte geben Sie das erste Wort ein: ");
		Scanner sc = new Scanner(System.in);
		  s1 = sc.next();
		  while(!s1.matches ("[a-zA-Z]+") || s1.length()<2) {
				 
				System.out.println("Bitte geben Sie nur zulässige Buchstaben ein. \nVersuchen Sie nochmal");
				s1=sc.next();
				
			}
		  
		  System.out.print("Bitte geben Sie das zweite Wort ein: ");
			Scanner sc1 = new Scanner(System.in);
			 s2 = sc1.next();
			 while(!s2.matches ("[a-zA-Z]+") || s2.length()<2){ 
					System.out.println("Bitte geben Sie nur zulässige Buchstaben ein. \nVersuchen Sie nochmal");
				 s2=sc1.next();
			}
			 s3 = s1 +" "+ s2;
			 
		  System.out.println("Ihre Wörter sind:"+s3);
	}

}

//