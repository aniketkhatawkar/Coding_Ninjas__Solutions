import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean isValidIPv4(String ipAddress) {
		// write your code here
		String str="\\d+";
		String arr[]=ipAddress.split("\\.");

		if(arr.length != 4){
			return false;
		}

		for(String s:arr){
			if(!s.matches(str) || Integer.parseInt(s)<0 || Integer.parseInt(s)>255){
				return false;
			}
		}

		return true;
	}

}
