import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] linearEquation(int a, int b, int c) {
		// Write your code here
		int arr[] = new int[2];

		int ans=helper(a, b, arr);

		if(c%ans!=0){
			return new int[]{-1, -1};
		}

		int scale=c/ans;
		arr[0]*=scale;
		arr[1]*=scale;

		return arr;
	}

	public static int helper(int a, int b, int arr[]){
		if(b==0){
			arr[0]=1;
			arr[1]=0;

			return a;
		}

		int next[]= new int[2];
		int temp=helper(b, a%b, next);
		arr[0]=next[1];
		arr[1]=next[0]-(a/b)*next[1];

		return temp;
	}

}
