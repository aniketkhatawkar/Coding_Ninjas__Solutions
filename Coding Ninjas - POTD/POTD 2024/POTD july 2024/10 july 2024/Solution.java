import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static boolean matrixGame(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
		int n=arr.size();

		ArrayList<ArrayList<Integer>> result = new ArrayList<>(n);

		for(int i=0; i<n; i++){
			result.add(new ArrayList<>(Collections.nCopies(n, 0)));
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int sum=0;

				for(int k=0; k<n; k++){
					sum+=arr.get(i).get(k)*arr.get(k).get(j);
				}

				result.get(i).set(j, sum);
			}
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(!arr.get(i).get(j).equals(result.get(i).get(j))){
					return false;
				}
			}
		}

		return true;
	}
}