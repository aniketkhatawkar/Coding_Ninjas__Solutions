import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		int count=1;

		for(int i=1; i<=n; i++){
			ArrayList<Integer> temp = new ArrayList<>();

			for(int j=0; j<(n-i); j++){
				temp.add(-1);
			}

			for(int j=1; j<=i; j++){
				if(count>9){
					count=1;
				}
				temp.add(count++);
			}
			al.add(temp);
		}

		return al;
	}
}