import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int ans=0;

		while(n>0){
			if(n%2!=0){
				ans++;
			}

			n/=2;
		}

		return ans;
	}
}