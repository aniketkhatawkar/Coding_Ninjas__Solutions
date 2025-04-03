import java.util.* ;
import java.io.*; 
public class Solution {

	public static void rearrangeArray(int arr[], int n) {
		// Write your code here.

		int ans[] = new int[n];

		for(int i=0; i<n; i++){
			ans[i]=arr[arr[i]];
		}

		for(int i=0; i<n; i++){
			arr[i]=ans[i];
		}

	}

}