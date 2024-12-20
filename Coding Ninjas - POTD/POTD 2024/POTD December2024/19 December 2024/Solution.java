import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean oneSegment(String str) 
	{
		// Write your code here.
		int count=0;
		int n=str.length();

		for(int i=0; i<n-1; i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				count++;
			}
		}

		if(count<2){
			return true;
		}

		return false;
	}
}