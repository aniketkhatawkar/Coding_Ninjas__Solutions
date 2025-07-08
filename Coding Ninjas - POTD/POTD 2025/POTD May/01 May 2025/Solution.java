import java.util.* ;
import java.io.*; 
public class Solution {
	public static char findAddedCharacter(String s, String t) {
		// Write your code here.
		int n1=s.length();
		int n2=t.length();

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for(int i=0; i<n1; i++){
			char ch=s.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}

		for(int i=0; i<n2; i++){
			char ch=t.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}

		for(char key: map2.keySet()){
			if(!map1.containsKey(key) || !map1.get(key).equals(map2.get(key))){
				return key;
			}
		}

		return 'a';
	}
}