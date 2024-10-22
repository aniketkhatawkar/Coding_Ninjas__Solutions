import java.util.* ;
import java.io.*; 
public class Solution {
	public static int binaryGap(int num) {
		// Write your code here.
		String str = Integer.toBinaryString(num);

		int ans=0;
		int index=-1;
		int n=str.length();

		for(int i=0; i<n; i++){
			if(str.charAt(i)=='1'){
				if(index!=-1){
					ans=Math.max(ans, i-index);
				}
				index=i;
			}
		}

		return ans;
	}
}