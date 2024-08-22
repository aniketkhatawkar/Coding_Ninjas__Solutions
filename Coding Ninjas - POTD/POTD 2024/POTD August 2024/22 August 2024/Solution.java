import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int index=0;
		int n=1;
		int ans[] = new int[x];

		while(index<x){
			if(((n*3)+2)%4!=0){
				ans[index++]=(n*3)+2;
			}
			n++;
		}

		return ans;
	}
}
