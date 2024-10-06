import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String original, String guess) {
		// Write your code here.
		int count=0;
		int n=original.length();

		int ori[] = new int[26];
		int gue[] = new int[26];

		for(int i=0; i<n; i++){
			if(original.charAt(i)==guess.charAt(i)){
				count+=2;
			}
			else {
				ori[original.charAt(i)-'A']++;
				gue[guess.charAt(i)-'A']++;
			}
		}

		for(int i=0; i<26; i++){
			count+=Math.min(ori[i], gue[i]);
		}

		return count;

	}
}