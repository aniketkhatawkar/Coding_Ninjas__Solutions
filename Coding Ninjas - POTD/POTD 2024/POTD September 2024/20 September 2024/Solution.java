import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int longestMountain(int arr[], int n)
	{
		// Write your code here.
		if(n<3){
			return 0;
		}

		int[]up=new int[n];
		int[]down=new int[n];

		for(int i=1; i<n; i++){
			if(arr[i]>arr[i-1]){
				up[i]=up[i-1]+1;
			}
		}

		for(int i=n-2; i>-1; i--){
			if(arr[i]>arr[i+1]){
				down[i]=down[i+1]+1;
			}
		}

		int ans=0;

		for(int i=1; i<n-1; i++){
			if(up[i]>0 && down[i]>0){
				ans=Math.max(ans, up[i]+down[i]+1);
			}
		}

		return ans;
	}

}
