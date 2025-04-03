import java.util.* ;

public class Solution {

	public static int findSum(int n1, ArrayList<Integer> arr) {

		// Write your code here
		int ans=0;
		int n=arr.size();

		for(int i=0; i<n; i++){
			int ele=arr.get(i);
			if(ele%2==0 || ele%3==0){
				ans+=ele;
			}
		}

		return ans;

	}
}
