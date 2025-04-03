import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> findGoodMatrix(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
		int n=arr.size();
		int m=arr.get(0).size();

		boolean row[] = new boolean[n];
		boolean col[] = new boolean[m];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(arr.get(i).get(j)==0){
					row[i]=true;
					col[j]=true;
				}
			}
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(row[i] || col[j]){
					arr.get(i).set(j, 0);
				}
			}
		}

		return arr;
	}
}