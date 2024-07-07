import java.util.* ;
import java.io.*; 
public class Solution {
	public static int maxExtraCheese(int n, int k, int[] l, int[] b) {
		// Write your code here.
		int ans=0;

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i]=Math.max(l[i], b[i]);
		}

		Arrays.sort(arr);

		for(int i=0; i<k; i++){
			ans+=2*arr[n-i-1];
		}

		return ans;
	}
}