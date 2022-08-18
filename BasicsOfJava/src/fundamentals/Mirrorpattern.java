package fundamentals;

import java.util.Scanner;

public class Mirrorpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
       int i=1;
       while(i <= n) {
    	   
    	   int space =1;
    	   while(space <= n-i) {
    		   System.out.print(" ");
    		   space++;
    		   
    	   }
    	   int num =1;
    	   while(num <= i) {
    		   System.out.print(num);
    		   num++;
    		   
    	   }
    	   
    	  System.out.println();
    	  i++;
    	  
    	   
    	   
    	   
       }
       
       
       
       
       
	}

}
