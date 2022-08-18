package fundamentals;

import java.util.Scanner;

public class Mirrorpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
       int i=1;
       while(i <= n) {
    	   
    	   int space =1;
    	   while(space <= n-i + 1) {
    		   System.out.print("*");
    		   space++;
    		   
    	   }
    	   
    	   
    	  System.out.println();
    	  i++;
    	  
    	   
    	   
    	   
       }
       
       
       
       
       
	}

}
