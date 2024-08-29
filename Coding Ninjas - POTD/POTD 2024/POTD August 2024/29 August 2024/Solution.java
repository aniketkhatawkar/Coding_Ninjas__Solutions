import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		String str=String.valueOf(num);

		int k=str.length();
		int ans=0;

		for(int i=0; i<k; i++){
			int digit=Character.getNumericValue(str.charAt(i));
			ans+=Math.pow(digit, k);
		}

		if(ans==num){
			return true;
		}

		return false;
	}
}

