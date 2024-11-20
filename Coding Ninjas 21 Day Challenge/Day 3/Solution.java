public class Solution {
	public static int countDigits(int n){
	    // Write your code here.
	    int ans=0;
 
	    while(n>0){
		   n/=10;
		   ans++;
	    }
 
	    return ans;
	}
 }
 