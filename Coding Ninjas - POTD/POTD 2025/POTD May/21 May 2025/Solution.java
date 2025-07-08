import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int ninjaGarden (ArrayList<Integer> flowers, int n, int k) {
		// Write your code here.
		int arr[] = new int[n+1];

		for(int i=0; i<n; i++){
			arr[flowers.get(i)]=i+1;
		}

		int ans=Integer.MAX_VALUE;

		for(int left=1; left<=n-k-1; left++){
			int right=left+k+1;

			boolean valid=true;
			int maxi=Math.max(arr[left], arr[right]);

			for(int i=left+1; i<right; i++){
				if(arr[i]<maxi){
					valid=false;
					break;
				}
			}

			if(valid){
				ans=Math.min(ans, maxi);
			}
		}

		return ans==Integer.MAX_VALUE?-1:ans;
	}
}