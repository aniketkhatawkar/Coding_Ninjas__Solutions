import java.util.*;
public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String arr[] = str.trim().split("\\s+");

		int n=arr.length;
		StringBuffer sb = new StringBuffer();

		for(int i=n-1; i>-1; i--){
			sb.append(arr[i]+" ");
		}

		return sb.toString();
	}
}
