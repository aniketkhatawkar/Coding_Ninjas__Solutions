import java.util.* ;
import java.io.*; 
public class Solution {
	public static void print(int n) {
		// Write your code here.
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(i%2);
            }
            System.out.println("");
        }
	}
}