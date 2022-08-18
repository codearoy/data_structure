package backtrack;

public class RatInMaze{
	
	public static void printAllPaths(int maze[][] , int i , int j , int path[][]) {
		
		 // check if i , j  cell is a valid cell or not 
		int n = maze.length ;
		
		if(i < 0 || i >= n  || j< 0 || j >= n || maze[i][j]==0 || path[i][j]==1 ) {
			return ; 
		}
		
		// include the cell in path cell 
		path[i][j] = 1 ;
		
		// destination cell 
		if(i == n-1 && j == n-1) {
			for(int r=0 ; r < n ; r++) {
				for(int c= 0 ; c < n ; c++ ) {
					System.out.print(path[r][c] + " ");
				//	path[r][c] = 0 ; 
				}
				System.out.println() ;
			}
			System.out.println() ; 
			path[i][j] = 0 ; 
			return; 
		}
		
		// explore in all direction 
		// top 
		printAllPaths(maze , i-1 , j, path) ;
			
		// right
		printAllPaths(maze , i, j+1, path);
	
		// down 
		printAllPaths(maze , i+1 , j, path);
	
		// left 
		printAllPaths(maze , i, j-1 , path);
		
	    path[i][j] = 0 ; 
		
	}
	
	// print all possible paths to reach the destination 
	public static void ratInMazePaths(int maze[][]) {
		int n = maze.length ; 
		int path[][] = new int[n][n] ; 
		printAllPaths(maze , 0 , 0 , path); 
	
	}
	
	// is there any path , solve maze 
	public static boolean solveMaze(int maze[][] , int i , int j , int path[][]) {
	
		 // check if i , j  cell is a valid cell or not 
		int n = maze.length ;
		
		if(i < 0 || i >= n  || j< 0 || j >= n || maze[i][j]==0 || path[i][j]==1 ) {
			return false ; 
		}
		
		// include the cell in path cell 
		path[i][j] = 1 ;
		
		// destination cell 
		if(i == n-1 && j == n-1) {
			for(int r=0 ; r < n ; r++) {
				for(int c= 0 ; c < n ; c++ ) {
					System.out.print(path[r][c] + " ");
				}
				System.out.println() ;
			}
			return true; 
		}
		
		// explore in all direction 
		// top 
		if(solveMaze(maze , i-1 , j, path) ) {
			return true ;
		}
		// right
		if(solveMaze(maze , i, j+1, path) ) {
			return true ;
		}
		// down 
		if(solveMaze(maze , i+1 , j, path) ) {
			return true ;
		}
		// left 
		if(solveMaze(maze , i, j-1 , path) ) {
			return true ;
		}
		
		return false ; 
		
	}
	
	public static boolean ratInMaze(int maze[][]) {
		int n = maze.length ; 
		int path[][] = new int[n][n] ; 
		return solveMaze(maze , 0 , 0 , path) ; 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int maze[][] = {{1,0,1},{1,1,1},{1,1,1}} ;
      
 //      boolean pathPossible = ratInMaze(maze) ; 
  //     System.out.print(pathPossible);
       ratInMazePaths(maze) ; 
		
	}

}
