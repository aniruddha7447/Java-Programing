package Practice;

public class N_Queen {
	public static boolean isSafe(char board [][],int row,int col) {
		//vertical up
		for(int i=row-1;i>=0;i--) {
			if(board[i][col]=='Q') {
				return false;
			}
		}
		//diagonal left up
		for(int i= row-1, j = col-1; i>=0 && j>=0; i--,j--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		//diagonal right up
		for(int i = row-1,j=col+1;i>=0&&j<board.length;i--,j++) {
			if((board[i][j])=='Q') {
				return false;
			}
		}
		return true;
	}
	public static void nQueen(char board [][],int row) {
		//base
		if(board.length==row) {
			printboard(board);
			return;
		}
		//column loop(Going column wise using row)
		for(int j=0;j<board.length;j++) {
			if(isSafe(board,row,j)) {
				board[row][j]='Q';
				nQueen(board,row+1);
				board[row][j]= '*';//Backtracking Step (to remove Q while backtracking)
			}
			
		}
	}
	public static void printboard(char board[] []) {
		System.out.println("------------0-----------");
		for(int i =0;i<board.length;i++) {
			for(int j =0;j<board.length;j++) {
				System.out.print(board [i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 4;
		char board[][] = new char [n][n];
		//initialization
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='*';
			}
			
		}
		nQueen(board,0);
	}

}
