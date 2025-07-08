import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static boolean ninjaGram(String str1) {

		// Write your code here
		HashMap<Character, Integer> map = new HashMap<>();

		String str=str1.toLowerCase();

		int n=str.length();

		for(int i=0; i<n; i++){
			map.put(str.charAt(i), 1);
		}

		if(map.size()==26){
			return true;
		}

		return false;
	}
}
