import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer> list= new ArrayList<>();

		int n=mat.size();
		int m=mat.get(0).size();

		for(int i=0; i<n; i++){
			if(i%2==0){
				for(int j=0; j<m; j++){
					list.add(mat.get(i).get(j));
				}
			}
			else {
				for(int j=m-1; j>-1; j--){
					list.add(mat.get(i).get(j));
				}
			}
		}
		return list;
	}
}
