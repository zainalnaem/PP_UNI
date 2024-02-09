import java.util.InputMismatchException;
	import java.util.Scanner;
public class ppAufgabe3Versuch1 {
	//Aufgabe3
	public static void inBin�rZahl(int d) {
	 int bin�rZahl[] = new int[15];
	 int a = 0;
	 while(d > 0) {
	  bin�rZahl[a++]= d%2;
	  d = d/2;
	 }
	 for(int i = a-1 ; i>=0 ; i--) {
	 
	  System.out.print(bin�rZahl[i]);
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
	    System.out.println("Bitte geben Sie nur zul�ssige Zahlen ein. Versuchen Sie nochmal:");
	    s.nextLine();
	   }
	   
	  }
	  if (flags==0) {
	   System.out.println("Die Bin�rzahl ist 0000000000000000.");
	  } else {
	   System.out.print("Die Bin�rzahl ist: (von Links nach Rechts)\n");
	   inBin�rZahl(flags);
	  }
	  String s1 = String.format("%016d", flags);
	  System.out.println("\nBitte geben Sie eine Zahl zwischen 0 und 15 ein, um zu sehen, ob die Lampe ein oder aus ist:");
	  
	  while (true) {
	   try {
	    k= s.nextByte();
	    if (k<0 || k>15) {
	     System.out.println("Bitte geben Sie nur zul�ssige Zahlen ein. Versuchen Sie nochmal:");
	     continue;
	    }
	    break;
	   } catch (InputMismatchException error) {
	    System.out.println("Bitte geben Sie nur zul�ssige Zahlen ein. Versuchen Sie nochmal:");
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

	

