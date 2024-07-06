import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		StringBuilder sb = new StringBuilder();

		int n=str.length();

		for(int i=0; i<n; i++){
			if(str.charAt(i)==' '){
				sb.append("@40");
			}
			else {
				sb.append(str.charAt(i));
			}
		}

		return sb;
	}
}