import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static String ticTacToeWinner(ArrayList<ArrayList<Integer>> moves, int n) {
		// Write your code here
		char board[][]= new char[3][3];

		for(char[] ch : board){
			Arrays.fill(ch, '-');
		}

		char p1='X';
		char p2='O';

		for(int i=0; i<n; i++){
			int row=moves.get(i).get(0);
			int col=moves.get(i).get(1);

			board[row][col]=(i%2==0)?p1:p2;

			if(helper(board, board[row][col])){
				return (i%2==0)? "player1":"player2";
			}
		}

		return (n==9)? "draw" : "uncertain";
	}

	public static boolean helper(char board[][], char ch){
		for(int i=0; i<3; i++){
			if((board[i][0]==ch && board[i][1]==ch && board[i][2]==ch) || 
			(board[0][i]==ch && board[1][i]==ch && board[2][i]==ch)) {
				return true;
			}
		}

		if((board[0][0]==ch && board[1][1]==ch && board[2][2]==ch) || 
			(board[0][2]==ch && board[1][1]==ch && board[2][0]==ch)) {
			return true;
		}

		return false;
	}
}