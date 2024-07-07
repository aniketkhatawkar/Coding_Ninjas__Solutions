import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		int n=arr.size();
		ArrayList <Integer> ans = new ArrayList<>();

		for(int i=0; i<=n-k; i++){
			HashSet <Integer> set= new HashSet<>();

			for(int j=i; j<(i+k); j++){
				set.add(arr.get(j));
			}

			ans.add(set.size());

		}

		return ans;
	}
}
