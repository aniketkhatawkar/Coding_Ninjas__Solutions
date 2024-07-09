import java.util.* ;
import java.io.*; 

public class Solution {

	public static int getMaximumHouses(int k, int l) {
		// Write your code here.

        return (1<<l)-k;
	}

}