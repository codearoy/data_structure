package recursion;

public class Recursion2 {

	// replace char of a with b in given string
	public static String replaceChar(String s , char a , char b) {
		if (s.length()==0) {
			return s ;
		}
		
		String smalloutput = replaceChar(s.substring(1) , a , b);
		if(s.charAt(0)==a) {
			return b + smalloutput ; 
		}
		else return s.charAt(0) + smalloutput; 
		
	}
	
	// replace pi with 3.14 
	public static String replacepi(String s) {
		if (s.length() <= 1) {
			return s ;
		}
		if(s.charAt(0)=='p' && s.charAt(1) == 'i') {
		String smalloutput = replacepi(s.substring(2));
	    return "3.14" + smalloutput; 
		}
		else {
			String smalloutput = replacepi(s.substring(1));
		    return s.charAt(0) + smalloutput; 
			
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//System.out.print(replaceChar("abcdacvdy" , 'a' , 'x'));
		System.out.print(replacepi("abcdpimnipi"));

	}

}
