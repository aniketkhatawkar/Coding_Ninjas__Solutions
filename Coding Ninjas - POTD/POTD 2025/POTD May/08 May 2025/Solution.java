import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> ninjaCity(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		int n=mat.size();
		int m=mat.get(0).size();

		for(int i=0; i<n; i++){
			ArrayList<Integer> temp = new ArrayList<>();

			for(int j=m-1; j>=0; j--){
				temp.add(mat.get(i).get(j));
			}

			ans.add(temp);
		}

		return ans;
	}
}