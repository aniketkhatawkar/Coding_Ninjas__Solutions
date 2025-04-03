import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static boolean ninjaShikanji(ArrayList<Integer> bill, int n) {
		// Write your code here.
		int five=0, ten=0;

		for(int val : bill){
			if(val==5){
				five++;
			}
			else if(val==10){
				if(five==0){
					return false;
				}
				five--;
				ten++;
			}
			else if(val==20){
				if(ten>0 && five>0){
					ten--;
					five--;
				}
				else if(five>2){
					five-=3;
				}
				else {
					return false;
				}
			}
			
		}

		return true;
	}
}