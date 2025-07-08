import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findTwoGroups(int n) {
		// Write your code here.
		int total = n*(n+1)/2;

		return total%2;
	}
}

