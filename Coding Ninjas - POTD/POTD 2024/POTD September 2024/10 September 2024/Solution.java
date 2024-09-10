import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] giftsLeft(int n, int k, int q, int[] demands) {
		// Write your code here.

		int[] ans=new int[q];
		int rem=n;

		for(int i=0; i<q; i++){
			if(demands[i]>rem){
				ans[i]=-1;
			}
			else {
				rem-=demands[i];
				if(rem<k){
					rem=n;
				}
				ans[i]=rem;
			}

		}

		return ans;
	}
}