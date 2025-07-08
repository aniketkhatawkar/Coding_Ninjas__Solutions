import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		// Write your code here.
		String str=s.substring(1)+s;

		return str.indexOf(s)+1;
	}

}