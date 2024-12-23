import java.util.* ;
import java.io.*; 
public class Solution {

	public static int longestDangerousRange(ArrayList<Integer> height, int n) {
		// Write your code here
		if(n<2){
			return n;
		}

		int ans=1;
		int maxi=1;

		for(int i=1; i<n; i++){
			boolean flag1=(i>1) && ((height.get(i-2)<height.get(i-1) && height.get(i-1)>height.get(i)));
			boolean flag2=(i>1) && ((height.get(i-2)>height.get(i-1) && height.get(i-1)<height.get(i)));
			
			if(flag1 || flag2){
				maxi++;
			}
			else if(height.get(i-1)==height.get(i)){
				maxi=1;
			}
			else {
				maxi=2;
			}

			ans=Math.max(ans, maxi);
		}

		return ans;
	}
}