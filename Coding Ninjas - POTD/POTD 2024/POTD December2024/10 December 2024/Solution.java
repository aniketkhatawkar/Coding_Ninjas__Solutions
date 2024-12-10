import java.io.*;
import java.util.* ;

public class Solution {
	public static ArrayList<Integer> getAllDivisors(int n){
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();

		for(int i=1; i*i<=n; i++){
			if(n%i==0){
				ans.add(i);
				if(i!=n/i){
					ans.add(n/i);
				}
			}
		}

		Collections.sort(ans);
		return ans;
	}
}