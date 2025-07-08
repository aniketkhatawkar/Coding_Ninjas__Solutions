import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		String str=Integer.toBinaryString(n);

		int count=0, index=0;

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='1'){
				count++;
				index=i+1;
			}
		}

		if(count==1){
			return str.length();
		}

		return -1;
	}
}