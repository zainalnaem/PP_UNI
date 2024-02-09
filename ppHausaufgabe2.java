//Aufgabe2
import java.util.Scanner;
import java.io.*;
public class ppHausaufgabe2 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	    char c1=0, c2=0, c3=0, c4=0;  
	    int m=0;
	    
	     System.out.print("Bitte geben Sie den ersten Buchstabe ein: ");
	     Scanner sc = new Scanner(System.in);
	     c1 = sc.next().charAt(0);  
	     String s=Character.toString(c1);
	     while(!s.matches("[a-zA-Z]")){ 
		System.out.println("Bitte geben Sie nur zulässige Buchstaben ein. \nVersuchen Sie nochmal");
	    s=sc.next();
		}
	     
	    Scanner sc1 = new Scanner(System.in);
         System.out.print("Bitte geben Sie den zweiten Buchstabe ein: ");
         c2 = sc1.next().charAt(0);
         String s1=Character.toString(c2);
         while(!s1.matches("[a-zA-Z]")){ 
				System.out.println("Bitte geben Sie nur zulässige Buchstaben ein. \nVersuchen Sie nochmal");
			 s1=sc1.next();
		}
         
        Scanner sc2 = new Scanner(System.in);
         System.out.print("Bitte geben Sie den dritten Buchstabe ein: ");
         c3 = sc2.next().charAt(0);
         String s2=Character.toString(c3);
         while(!s2.matches("[a-zA-Z]")){ 
				System.out.println("Bitte geben Sie nur zulässige Buchstaben ein. \nVersuchen Sie nochmal");
			 s2=sc2.next();
		}
         
        Scanner sc3 = new Scanner(System.in);
         System.out.print("Bitte geben Sie den vierten Buchstabe ein: ");
         c4 = sc3.next().charAt(0);
         String s3=Character.toString(c4);
         while(!s3.matches("[a-zA-Z]")){ 
				System.out.println("Bitte geben Sie nur zulässige Buchstaben ein. \nVersuchen Sie nochmal");
			 s3=sc3.next();
		}
      
         boolean input = false;
         while (!input) {  
        	 try {
        		 System.out.print("\nBitte geben Sie eine Nummer ein: ");  
        		  Scanner sc4= new Scanner(System.in);
        			 m= sc4.nextInt();
        			 break;
         } catch (Exception e) {
        	 input = false; 
        	 System.out.print("\nBitte nur ganze Zahlen eingeben ");
         }
         }
         
	     
	   int b1 = s.hashCode();  
	   int b2 = s1.hashCode();
	   int b3 = s2.hashCode();
	   int b4 = s3.hashCode();
	    
	   
	    System.out.println("\nDer Hash-Wert des ersten Buchstabens ist: "+b1);  
	    System.out.println("Der Hash-Wert des zweiten Buchstabens ist: "+b2);
	    System.out.println("Der Hash-Wert des dritten Buchstabens ist: "+b3);
	    System.out.println("Der Hash-Wert des vierten Buchstabens ist: "+b4);
	    
	       System.out.println("Das vierbuchstabiges Wort ist: " + s + s1 + s2 + s3); 

	   
        int HashWertResult = (b1+b2+b3+b4)%m;
            System.out.println("Der Hash-Wert des Wortes nach der Formel (c1+c2+c3+c4)mod m ist: " + HashWertResult);
   
	    
           

      
    }

	    
	}

