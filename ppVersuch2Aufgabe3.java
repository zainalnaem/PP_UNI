public class ppVersuch2Aufgabe3 {
//	Ausgabe einer Zahlenfolge
	public static void main(String[] args) {

//• Ihr Algorithmus enthält nur eine Schleife, deren Laufindex die Zahlenwerte von 0 bis 99 durchläuft               		

		for (int i = 0; i <= 99; i++) {
//|| (i > 70 && i < 80)
			if ((i % 10 == 7)  || (i/10==7) || (i % 7 == 0 && i != 0)) {
				System.out.print(" bumm\n");
			} else {
				System.out.print(" " + i);
			}
		}
		System.out.println("\n---------------------");
//• Ihr Algorithmus enthält zwei geschachtelte Schleifen. Der Laufindex der äußeren Schleife durchläuft für die Zehnerstelle
//der Zahl den Bereich 0 bis 9, der Laufindex der inneren Schleife tut dasselbe für die Einerstelle der Zahl	 	
		int i, j;
		for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				if (j == 7) {
					System.out.println("bumm");
				} else {
					int ausgabe = i * 10 + j; // (ausgabe < 70 && ausgabe > 79)
					if (ausgabe == 0) {
						System.out.println("0");
					
					} else if (ausgabe % 7 == 0 || (ausgabe/10==7) ) {
						System.out.println("bumm");
					} else {
						System.out.println(ausgabe);
					}
				}
			}
		}

	}
}


//System.out.print(123%10);
// if you want to remove the last digit from the number you should /10 ex: 123 ---> 123/10  = 12 so we removed 3 
// if you want to get the last number so %10 ex: 123 ---> 123%10  = 3
//  int count = 0;  count++;   System.out.print(count);  

//for(int y= 0;y<9; y++) {
//	 if (   (y % 100 == 70) ){
//         System.out.print(" bumm1");  
//	 }             
//for(int i=0; i<9; i++) {
//	 if (( i%10==7)&&(i ==y)) {
//		 System.out.print(" bumm"); 
//	 }else  {
//			System.out.print(" " +i);
//		}

//	if (  (i !=y) && ( (i%7!=0) && (!(i>70 && i<79)) )) {
//		 
//		 System.out.print(" " +i);
//		
//	}else  {
//		System.out.print(" bumm");
//	}
	
//	        if((i%10 == 7) || (i>70 && i<80) || ( i % 7 == 0 )  ){
//	            System.out.print(" bumm");  
//	        }else  {
//	            System.out.print(" " +i);
//	       } 
	        
//	 }
//}






//int x=0;
//while (x!=y && !(x%7==0)) {
//	 System.out.print(" " +x);
//}

//int y=0 ;
//for( int i= 0; i<= 9; i++) {
//	 while (((y%10 == 7) || (y>70 && y<80) || ( y % 7 == 0 && y!=0))==true) {
//		 System.out.println(" " +y);
//		 break;
//	 }
//}



//for( i = 0; i < 99; i++) 
//if( i % 7 != 0 && !( ("" + i).contains("7"))) {
//	 
//	 System.out.print(" " +i);
//}  else if (i==0) {
//	 System.out.println(" 0");
//}else {
//	 System.out.println(" Bumm");
//}