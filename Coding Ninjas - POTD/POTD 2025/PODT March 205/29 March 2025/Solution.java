import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int longestMountain(int arr[], int n)
	{
		// Write your code here.
		if(n<3){
			return 0;
		}

		int lon=0;

		for(int i=1; i<n-1; i++){
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
				int left=i-1;
				int rigth=i+1;

				while(left>0 && arr[left]>arr[left-1]){
					left--;
				}

				while(rigth<n-1 && arr[rigth]>arr[rigth+1]){
					rigth++;
				}

				lon=Math.max(lon, rigth-left+1);
			}
		}

		return lon;
	}

}
