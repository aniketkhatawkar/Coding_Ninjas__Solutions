import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		// Write your code here.
		ArrayList<ArrayList<Character>> arr = new ArrayList<>();

		for(int i=0; i<N; i++){
			ArrayList<Character> temp = new ArrayList<>();
			int ch=64+N;
			for(int j=0; j<=i; j++){
				temp.add((char)ch--);
			}
			Collections.reverse(temp);
			arr.add(temp);
		}

		return arr;
	}
}