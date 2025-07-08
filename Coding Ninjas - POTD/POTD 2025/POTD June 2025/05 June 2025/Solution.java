import java.util.* ;
import java.io.*; 
public class Solution {
	public static int binaryGap(int num) {
		// Write your code here.
		String str=Integer.toBinaryString(num);
		int n=str.length();
		int count=-1, ans=0;

		for(int i=0; i<n; i++){
			if(str.charAt(i)=='1'){
				if(count!=-1)
					ans=Math.max(ans, i-count);
				
				count=i;
			}
		}

		return ans;

	}
}