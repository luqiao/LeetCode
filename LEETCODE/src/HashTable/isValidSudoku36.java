package HashTable;

import java.util.HashSet;

/*
 [".87654321","2........","3........","4........","5........","6........","7........","8........","9........"]
 Note:
A valid Sudoku board (partially filled) is not necessarily solvable.
 Only the filled cells need to be validated.
 */
public class isValidSudoku36 {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
        	HashSet hsW=new HashSet();
        	for(int j=0;j<9;j++){       		
        		if(board[i][j]!='.')
        			if(hsW.add(board[i][j])==false)
        				return false;
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
