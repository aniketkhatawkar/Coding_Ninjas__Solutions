import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLengthofLongestSubstring(String s, int k) {
		// Write your code here.
		if(s==null || s.length()==0 || k==0){
			return 0;
		}

		int counr=0;
		int left=0;

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0; i<s.length(); i++){
			char ch=s.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);

			while(map.size()>k){
				char c=s.charAt(left);
				map.put(c,map.get(c)-1);

				if(map.get(c)==0){
					map.
				}
			}
		}
	}
}