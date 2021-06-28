package bjProblem;

import java.util.Scanner;

public class P2675 {

	 static Scanner scn = new Scanner(System.in);
	   
	   public static void main(String[] args) {
	      int tst = scn.nextInt();
	      for(int i=0; i<tst; i++) {
	   
	         int r = scn.nextInt();
	         String str = scn.next();
	         
	         for(int j=0; j<str.length(); j++) {           
	            for(int k=0; k<r; k++) {
	               System.out.print(str.charAt(j));
	            }
	         }
	            
	         System.out.println();
	      }

	   }
}
