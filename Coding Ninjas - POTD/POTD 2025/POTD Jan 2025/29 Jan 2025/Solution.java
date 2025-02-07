import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean reorderedPowerOf2(int n) {
		// Write your code here.
		String str = Integer.toString(n);

		int arr[]=helper(str);

		for(int i=0; i<31; i++){
			String power=Integer.toString(1<<i);

			if(Arrays.equals(arr, helper(power))){
				return true;
			}
		}

		return false;
	}

	public static int[] helper(String str){
		int count[]= new int[10];

		for(char c:str.toCharArray()){
			count[c-'0']++;
		}

		return count;
	}
}

