import java.util.InputMismatchException;
	import java.util.Scanner;
public class ppAufgabe3Versuch1 {
	//Aufgabe3
	public static void inBinärZahl(int d) {
	 int binärZahl[] = new int[15];
	 int a = 0;
	 while(d > 0) {
	  binärZahl[a++]= d%2;
	  d = d/2;
	 }
	 for(int i = a-1 ; i>=0 ; i--) {
	 
	  System.out.print(binärZahl[i]);
	 }   
	}
	 public static void main(String[] args) {
	
	  short flags;
	  byte k;
	 
	  System.out.println("Bitte geben Sie eine Zahl zwischen 0 und 32767 ein.");
	   Scanner s = new Scanner(System.in);
	 
	  while(true) {
	   try {
	    flags = s.nextShort();
	    if(flags<0) {
	     System.out.println("Bitte geben Sie nur positive Zahlen ein. Versuchen Sie nochmal:");
	     continue;
	    }
	    break;
	   }catch (InputMismatchException error) {
	    System.out.println("Bitte geben Sie nur zulässige Zahlen ein. Versuchen Sie nochmal:");
	    s.nextLine();
	   }
	   
	  }
	  if (flags==0) {
	   System.out.println("Die Binärzahl ist 0000000000000000.");
	  } else {
	   System.out.print("Die Binärzahl ist: (von Links nach Rechts)\n");
	   inBinärZahl(flags);
	  }
	  String s1 = String.format("%016d", flags);
	  System.out.println("\nBitte geben Sie eine Zahl zwischen 0 und 15 ein, um zu sehen, ob die Lampe ein oder aus ist:");
	  
	  while (true) {
	   try {
	    k= s.nextByte();
	    if (k<0 || k>15) {
	     System.out.println("Bitte geben Sie nur zulässige Zahlen ein. Versuchen Sie nochmal:");
	     continue;
	    }
	    break;
	   } catch (InputMismatchException error) {
	    System.out.println("Bitte geben Sie nur zulässige Zahlen ein. Versuchen Sie nochmal:");
	    s.nextLine();
	   }
	  }
	  int b=k;
	  if (s1.charAt(15-b) == '0') {
	   System.out.println("Die Lampe ist aus."); 
	  }else  {
	   System.out.println("Die Lampe ist ein.");
	  }
	  
	  
	  
	  
	  
	 }

	}

	

