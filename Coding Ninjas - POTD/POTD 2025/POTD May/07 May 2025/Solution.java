import java.util.* ;
import java.io.*; 
public class Solution {
	public static int specialSum(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int fsum[] = new int[n];
		int lsum[] = new int[n];

		int curr=0;

		for(int i=0; i<n; i++){
			curr+=arr.get(i);
			fsum[i]=curr;
		}

		curr=0;

		for(int i=n-1; i>=0; i--){
			curr+=arr.get(i);
			lsum[i]=curr;
		}

		int ans=Integer.MAX_VALUE;

		for(int i=0, j=n-1; i<n; i++, j--){
			ans=Math.min(ans, fsum[i]+lsum[j]);
		}

		return ans;
	}
}

