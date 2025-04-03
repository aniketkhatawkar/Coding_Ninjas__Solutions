import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findInteger(int n, int k) {
		// Write your code here
		int odd=(n+1)/2;

		if(k<=odd){
			return 2*k-1;
		}
		else {
			return 2*(k-odd);
		}
	}

}
