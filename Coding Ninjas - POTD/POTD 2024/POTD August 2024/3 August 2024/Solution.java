import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int maxOne(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
		int maxrow=-1;
		int maxcount=0;
		int n=arr.size();
		int m=arr.get(0).size();

		for(int i=0; i<n; i++){
			int count=countones(arr.get(i), m);
			if(count>maxcount){
				maxcount=count;
				maxrow=i;
			}
		}

		return maxrow;
	}

	private static int countones(ArrayList<Integer> row, int m){
		int low=0;
		int high=m-1;

		while(low<=high){
			int mid=low+(high-low)/2;

			if(row.get(mid)==1){
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}

		return m-low;
	}
}