package forLoop;
import java.util.*;


public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      String str = s.next();
      
      int n = str.length();
      int sum = 0 ;
     
      
      for(int i=0 ; i <= n-1 ; i++) {
    	 int product = 1;
    	  
    	 char ch = str.charAt(i);
    	// System.out.println(ch);
    	  
    	 if(ch == '1'){
    		 for(int j=1; j <= n-1-i ; j++) {
    			 product = product * 2;
    		 }
    		  sum = sum + product ;
    	 }
    	 else continue;
    	 
    	 
      }
      System.out.print(sum);
      
	}

}
