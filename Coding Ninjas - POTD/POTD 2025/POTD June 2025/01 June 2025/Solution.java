import java.util.* ;
import java.io.*; 

public class Solution {

	public static int numberOfFlips(int a, int b) {
		// Write your code here.
		String abit=String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');
		String bbit=String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0');

		int count=0;

		for(int i=0; i<32; i++){
			if(abit.charAt(i)!=bbit.charAt(i)){
				count++;
			}
		}

		return count;
	}

}
