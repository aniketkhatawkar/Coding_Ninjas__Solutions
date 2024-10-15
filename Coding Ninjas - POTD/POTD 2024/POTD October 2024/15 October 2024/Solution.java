import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		// Write your code here.
		ArrayList<ArrayList<Character>> ans = new ArrayList<>();

		for(int i=N-1; i>=0; i--){
			ArrayList<Character> temp = new ArrayList<>();
			for(int j=i; j<N; j++){
				temp.add((char)('A'+j));
			}
			ans.add(temp);
		}

		return ans;
	}
}