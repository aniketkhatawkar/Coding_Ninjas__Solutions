import java.util.* ;
import java.io.*; 
public class Solution {
	public static int conversion(int N, int M) {
		// Write your code here.
		int x=N^M;
		int count=0;

		while(x>0){
			count+=(x&1);
			x>>=1;
		}

		return count;
	}
}