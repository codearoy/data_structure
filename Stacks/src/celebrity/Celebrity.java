package celebrity;

import java.util.Stack;

public class Celebrity {
	
	
	public static boolean findCelebrity(int[][] mat , int m){
		
	  Stack<Integer> s = new Stack<>() ; 
	  
	  for(int i = 0 ; i < m ; i++) {
		  s.push(i) ; 
	  }
	  
	  while(s.size() > 1){
		  int a = s.pop(); 
		  int b = s.peek(); 
		  
		  if(mat[a][b] == 1) {
			  continue ; 
		  }else if(mat[b][a] == 1) {
			  s.pop() ; 
			  s.push(a) ; 
		  }
	  }
	  int c = s.pop() ; 
	  
	  for(int i = 0 ; i < m ; i++) {
		  if(mat[c][i] == 1) {
			  return false ;
		  }
	  }
	  
	return true; 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int m = 3  ; 
		int[][] mat = {
				{0,1,0},
				{0,0,0},
				{0,1,0}
		} ; 
		
		
		System.out.print(findCelebrity(mat , m)); 
	}

}
