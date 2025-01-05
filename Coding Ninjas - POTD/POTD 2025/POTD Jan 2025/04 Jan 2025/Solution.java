import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] giftsLeft(int n, int k, int q, int[] demands) {
		// Write your code here.
		int ans[]= new int[q];
		int ref=n;

		for(int i=0; i<q; i++){
			if(demands[i]<=n){
				n-=demands[i];
				ans[i]=n;
			}
			else{
				ans[i]=-1;
				continue;
			}
			
			if(n<k){
				n=ref;
			}

			ans[i]=n;
		}

		return ans;
	}
}