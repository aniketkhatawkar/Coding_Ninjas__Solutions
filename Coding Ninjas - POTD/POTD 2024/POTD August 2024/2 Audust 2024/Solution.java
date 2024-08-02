import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		// Write your code here.
		String str=s;

		for(int i=1; i<n; i++){

			s=s.substring(1)+s.charAt(0);

			if(s.equals(str)){
				return i;
			}
		}

		return n;
	}

}