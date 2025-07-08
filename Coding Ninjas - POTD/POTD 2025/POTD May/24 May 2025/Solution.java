import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {

		// Write your code here
		ArrayList<Integer> ans = new ArrayList<>();

		for(int index=0; index<queries.size(); index++){
			int a=queries.get(index).get(0);
			int b=queries.get(index).get(1);
			int c=queries.get(index).get(2);
			int d=queries.get(index).get(3);

			int sum=0;

			for(int i=a; i<=c; i++){
				for(int j=b; j<=d; j++){
					sum+=arr.get(i).get(j);
				}
			}

			ans.add(sum);

		}

		return ans;
	}
}
