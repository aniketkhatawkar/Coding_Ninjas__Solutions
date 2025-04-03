import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] printPatt(int n) {

		// Write your code here

		String arr[] = new String[n];

		for(int i=0; i<n; i++){

			StringBuffer sb = new StringBuffer();

			for(int j=i; j<n; j++){
				sb.append("*");
			}

			arr[i]=sb.toString();
		}

		return arr;
	}

}
