import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int maxOne(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
		int ans=-1;
		int maxi=0;
		int n=arr.size();
		int m=arr.get(0).size();

		for(int i=0; i<n; i++){
			int first=helper(arr.get(i));
			int count=m-first;

			if(count>maxi){
				maxi=count;
				ans=i;
			}

		}

		return ans;
	}

	public static int helper(ArrayList<Integer> arr) {
		int low=0;
		int high=arr.size()-1;
		int first=arr.size();

		while(low<=high){
			int mid=low+(high-low)/2;

			if(arr.get(mid)==1){
				first=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}

		return first;
	}
}