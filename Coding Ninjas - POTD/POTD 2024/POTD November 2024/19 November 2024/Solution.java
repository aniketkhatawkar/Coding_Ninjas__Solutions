import java.util.* ;
import java.io.*; 
public class Solution {
	public static int specialSum(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int fsum=0, lsum=0, ssum=0;
		int mini=Integer.MAX_VALUE;

		for(int i=0; i<n; i++){
			fsum+=arr.get(i);
			lsum+=arr.get(n-i-1);
			ssum=fsum+lsum;
			mini=Math.min(mini, ssum);
		}

		return mini;
	}
}

