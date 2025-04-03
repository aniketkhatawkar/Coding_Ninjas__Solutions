import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static boolean ninjaGram(String str) {

		// Write your code here
		str=str.toLowerCase();

		Set<Character> set = new HashSet<>();

		for(int i=0; i<str.length(); i++){
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z'){
				set.add(ch);
			}
		}

		return set.size()==26;
	}
}
