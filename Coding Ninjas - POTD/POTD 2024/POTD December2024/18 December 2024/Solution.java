import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static boolean ninjaShikanji(ArrayList<Integer> bill, int n) {
		// Write your code here.
		int five=0, ten=0;

		for(Integer paid:bill){
			if(paid==5){
				five++;
			}
			else if(paid==10 && five>0){
				five--;
				ten++;
			}
			else if(paid==20){
				if(five>0 && ten>0){
					five--;
					ten--;
				}
				else if(five>2){
					five-=3;
				}
				else {
					return false;
				}
			}
			else{
				return false;
			}
		}

		return true;
	}
}