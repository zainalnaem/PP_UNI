// f(x) = 20x²-100x+129.5 in the interval [2,4] with the increment 0.1
import java.text.DecimalFormat;
public class PPA4V2 {
//Abtastung und Quantisierung von Funktionen
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##"); // Formats number to 2 decimal points
		double x = 2;
		while (x < 4.1) {
		     if (x == 2.5000000000000004) { // The value of 2.5 as double is actually 2.5000000000000004
		    	 System.out.print("x = 2.5 , ");
		    	 System.out.println("y = Minimum!");
		    	 x += 0.1;
		     }
		     else {
		    	 System.out.print("x = " +df.format(x) +" , "); // Because some numbers like 2.3 are actually 2.3000000000000003
		    	 System.out.println("y = " +df.format(Math.floor((20*x*x) - (100*x) + 129.5))); // Math.floor rounds down the number
		    	 x += 0.1;
		     }

		}

	}

}
