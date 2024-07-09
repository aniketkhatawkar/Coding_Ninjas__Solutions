import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static int countCustomers(ArrayList<Integer> arr, int k) 
    {
		//    Write your code here
		int n=arr.size();

		int p[]= new int[n];
		Arrays.fill(p, 0);

		int occu=0, ans=0;

		for(int i=0; i<n; i++){
			if(p[arr.get(i)]==0){
				p[arr.get(i)]=1;
				if(occu<k){
					occu++;
					p[arr.get(i)]=2;
				}
				else {
					ans++;
				}
			}
			else {
				if(p[arr.get(i)]==2){
					occu--;
				}
				p[arr.get(i)]=0;
			}
		}
		return ans;
	}
}