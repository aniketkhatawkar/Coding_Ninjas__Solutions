import java.util.* ;
import java.io.*; 
public class Solution {
	public static void printPattern(int n){
		// Write your code here.
		int star=1;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				System.out.print(" ");
			}

			for(int j=0; j<star; j++){
				System.out.print("*");
			}

			star+=2;
			System.out.println("");
		}
	}
}
