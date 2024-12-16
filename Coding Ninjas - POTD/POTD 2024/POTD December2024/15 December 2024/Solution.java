import java.util.* ;
import java.io.*;

public class Solution 
{
	public static int countCustomers(ArrayList<Integer> arr, int k) 
    {
		//    Write your code here
		int list[] = new int[arr.size()];
		Arrays.fill(list, 0);

		int count=0, ans=0;

		for(int cus:arr){
			if(list[cus]==0){
				list[cus]=1;
				if(count<k){
					count++;
					list[cus]=2;
				}
				else {
					ans++;
				}
			}
			else {
				if(list[cus]==2){
					count--;
				}
				list[cus]=0;
			}
		}

		return ans;
	}
}