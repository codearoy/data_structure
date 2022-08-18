package backtrack;

public class NQueens {
	
	public static void placeNQueens(int n) {
		int board[][] = new int[n][n] ; 
		placeQueeens(board , n , 0) ; 
		
	}

	private static void placeQueeens(int[][] board , int n, int row) {
		// TODO Auto-generated method stub
		if(row == n) {
			// valid board configuration
			for(int r = 0 ; r < n ; r++) {
				for(int c = 0 ; c < n ; c++) {
					System.out.print(board[r][c]);
					board[r][c] = 0 ; 
				}
			}
			System.out.println() ; 
		}
		
		// check for all columns 
		   // check if its safe to place the queen and move to next row 
		for(int j = 0 ; j < n ; j++) {
			board[row][j] = 1 ; 
		}
		
		        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
