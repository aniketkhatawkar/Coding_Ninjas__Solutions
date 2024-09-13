import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static String ticTacToeWinner(ArrayList<ArrayList<Integer>> moves, int n) {
		// Write your code here
		char grid[][] = new char[3][3];

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				grid[i][j]=' ';
			}
		}

		boolean play1=true;

		for(int i=0; i<n; i++){
			int row=moves.get(i).get(0);
			int col=moves.get(i).get(1);

			grid[row][col]= play1 ? 'X' : 'O';

			if(checkwinner(grid)){
				return play1 ? "player1" : "player2";
			}

			play1=!play1;
		}

		if(n==9){
			return "draw";
		}

		return "uncertain";
	}

	public static boolean checkwinner(char [][]grid){
		for(int i=0; i<3; i++){
			if(grid[i][0] !=' ' && grid[i][0]==grid[i][1] && grid[i][1]==grid[i][2]){
				return true;
			}

			if(grid[0][i] !=' ' && grid[0][i]==grid[1][i] && grid[1][i]==grid[2][i]){
				return true;
			}

			if(grid[0][0] !=' ' && grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2]){
				return true;
			}

			if(grid[0][2] !=' ' && grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0]){
				return true;
			}
		}

		return false;
	}
}