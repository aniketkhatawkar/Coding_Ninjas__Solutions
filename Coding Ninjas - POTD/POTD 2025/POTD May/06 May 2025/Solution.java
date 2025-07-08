import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] anagramMapping(int n, int[] a, int[] b) {
		// Write your code here.
		int ans[] = new int[n];

		for(int i=0; i<n; i++){
			ans[i]=getIndex(b, a[i]);
		}

		return ans;
	}

	public static int getIndex(int arr[], int num){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==num){
				return i;
			}
		}

		return -1;
	}
}