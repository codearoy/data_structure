package recursion3;

public class SubsetsOfArray {
	
	    public static int[][] subsetsHelp(int input[] , int si){
	        if(si == input.length){
	          int[][] newOut = new int[1][0] ;
	            return newOut ; 
	        }
	        
	        int cn = input[si] ; 
	        int smallOut[][] = subsetsHelp(input , si+1) ; 
	        int newOut[][] = new int[2 * smallOut.length][] ; 
	        
	        int k = 0 ; 
	        for(int i = 0 ; i < smallOut.length ; i++){
	        	newOut[k] = new int[smallOut[i].length] ; 
 	            for(int j = 0 ; j < smallOut[i].length ; j++){
	                newOut[k][j] = smallOut[i][j] ; 
	            }
	            k++ ; 
	        }
	        
	         for(int i = 0 ; i < smallOut.length ; i++){
	        	 newOut[k] = new int[smallOut[i].length + 1] ; 
	             newOut[k][0] = cn ;  
	            for(int j = 0 ; j < smallOut[i].length ; j++){
	                newOut[k][j+1] = smallOut[i][j] ; 
	            }
	            k++ ; 
	        }
	        
	        return newOut ; 
	    }
		// Return a 2D array that contains all the subsets
		public static int[][] subsets(int input[]) {
			// Write your code here
	        int[][] ans = subsetsHelp(input , 0 ) ; 
	        return ans ; 

		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {15,30,20} ; 
		int ans[][] = subsets(input) ; 
		
		for(int i = 0 ; i < ans.length ; i++) {
			for(int j = 0 ; j < ans[i].length ; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println() ; 
		} 

	}

}
