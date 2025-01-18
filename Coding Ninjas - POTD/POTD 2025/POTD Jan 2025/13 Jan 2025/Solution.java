import java.util.* ;
import java.io.*; 
public class Solution {
	public static String toHex(int num) {
		// Write your code here.
		if(num==0){
			return "0";
		}

		StringBuilder sb = new StringBuilder();
		char arr[] = "0123456789ABCDEF".toCharArray();

		while(num!=0){
			sb.append(arr[num&15]);
			num>>>=4;
		}

		return sb.reverse().toString();
	}
}