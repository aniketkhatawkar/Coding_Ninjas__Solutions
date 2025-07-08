import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer> ans = new ArrayList<>();

		int n=mat.size();
		int m=mat.get(0).size();
		int count=0;

		for(int i=0; i<n; i++){
			if(count%2==0){
				for(int j=0; j<m; j++){
					ans.add(mat.get(i).get(j));
				}
			}
			else {
				for(int j=m-1; j>=0; j--){
					ans.add(mat.get(i).get(j));
				}
			}
			count++;
		}

		return ans;
	}
}
