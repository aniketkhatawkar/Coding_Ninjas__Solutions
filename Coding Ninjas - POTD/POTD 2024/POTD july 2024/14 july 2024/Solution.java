import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int even=0, odd=0;

		if(n>0){
			even=arr.get(0);
			for(int i=2; i<n; i+=2){
				even=Math.abs(even-arr.get(i));
			}
		}
		

		
		if(n>1){
			odd=arr.get(1);
			for(int i=3; i<n; i+=2){
				odd=Math.abs(odd-arr.get(i));
			}
		}
		

		ArrayList<Integer> ans=new ArrayList<>();

		ans.add(even);
		ans.add(odd);

		return ans;
	}
}