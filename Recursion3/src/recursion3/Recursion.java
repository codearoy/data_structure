package recursion3;

import java.util.Scanner;

public class Recursion {

	public static String[] subsequences(String input) {
		
		if(input.length()==0) {
			String[] output = new String[1] ;
		    output[0] = "" ; 
		    return output ;
		}
		
	    String[] smallOutput = subsequences(input.substring(1)) ; 
		String[] output = new String[smallOutput.length * 2] ;
		
		for(int i = 0 ; i < smallOutput.length ; i++) {
			output[i] = smallOutput[i] ; 
		}
		
		for(int i = 0 ; i < smallOutput.length ; i++) {
			output[i+smallOutput.length] = input.charAt(0) + smallOutput[i] ; 
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ; 
		String input = s.next() ; 
		String[] output = subsequences(input) ; 
		
		for(int i= 0 ; i < output.length ; i++) {
			System.out.println(output[i]);
		}

	}

}
