import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String original, String guess) {
		// Write your code here.
		int count=0;

		boolean visitoriginal[]= new boolean[4];
		boolean visitguess[]= new boolean[4];

		for(int i=0; i<4; i++){
			if(guess.charAt(i)==original.charAt(i)){
				count+=2;
				visitoriginal[i]=true;
				visitguess[i]=true;
			}
		}

		for(int i=0; i<4; i++){
			if(!visitguess[i]){
				for(int j=0; j<4; j++){
					if(!visitoriginal[j] && guess.charAt(i)==original.charAt(j)){
						count++;
						visitoriginal[j]=true;
						break;
					}
				}
			}
		}

		return count;
	}
}