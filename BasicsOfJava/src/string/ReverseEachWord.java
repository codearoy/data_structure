package string;

public class ReverseEachWord {
 
	

	
	public static String revword(String str){
		String ans = "" ;
		int i = 0 ;
		int si = 0;
		int n = str.length();
		for(i = 0; i < n ; i++){
			if(str.charAt(i) ==' '){
				int end = i-1;
				String revCurrent ="" ;
				for(int j = si ; j <= end ; j++ ){
					revCurrent = str.charAt(j) + revCurrent ;
				}
				
				
			 ans +=revCurrent+" ";
			 si = i+1;
			}
		}
		int end = i-1;
		String revCurrent ="" ;
		for(int j = si ; j <= end ; j++ ){
			revCurrent = str.charAt(j) + revCurrent ;
		}
		
		
	 ans +=revCurrent ;
		
		return ans ;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "abc def ghi" ;
		 System.out.print(revword(str1));

	}

}
