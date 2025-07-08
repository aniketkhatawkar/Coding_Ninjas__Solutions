import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean isValidIPv4(String ipAddress) {
		// write your code here
		String arr[]=ipAddress.split("\\.");

		if(arr.length!=4){
			return false;
		}

		for(int i=0; i<4; i++){
			if(!(arr[i].matches("\\d+")) || !(Integer.parseInt(arr[i])>=0 && Integer.parseInt(arr[i])<=255)){
				return false;
			}
		}

		return true;
	}

}
