import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static boolean ninjaGram(String str) {

		// Write your code here
		HashMap<Character, Integer> map = new HashMap<>();
		int n=str.length();
		 String st= str.toLowerCase();

		for(int i=0; i<n; i++) {
			map.put(st.charAt(i), 1);
		}

		if(map.size()<26){
			return false;
		}

		return true;
	}
}
