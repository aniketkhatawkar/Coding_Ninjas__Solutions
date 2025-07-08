import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] printPatt(int n) {

		// Write your code here

		String ans[] = new String[n];

		for(int i=0; i<n; i++){
			StringBuffer sb = new StringBuffer();
			for(int j=i; j<n; j++){
				sb.append("*");
			}

			ans[i]=sb.toString();
		}

		return ans;
	}

}
