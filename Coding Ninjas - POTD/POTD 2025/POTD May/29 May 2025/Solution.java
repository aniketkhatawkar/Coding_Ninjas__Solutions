import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int minimumDistance(int arr[], int n, int x, int y) {
		// Write your code here.
		int ans=Integer.MAX_VALUE;
		int count=-1;

		for(int i=0; i<n; i++){
			if(arr[i]==x || arr[i]==y){
				if(count!=-1 && arr[i]!=arr[count]){
					ans=Math.min(ans, i-count);
				}
				
				count=i;
			}
		}

		return ans==Integer.MAX_VALUE?-1:ans;
	}

}