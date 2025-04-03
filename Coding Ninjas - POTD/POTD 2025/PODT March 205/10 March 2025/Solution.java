import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int flipSomeBits(int num, int[] arr, int n) {
		// Write your code here.
		String str=String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
		StringBuffer sb = new StringBuffer(str);

		for(int i=0; i<n; i++){
			int place=32-arr[i];

			sb.setCharAt(place,sb.charAt(place)=='1'?'0':'1');
		}

		return (int)Long.parseLong(sb.toString(), 2);
	}
	
}	