import java.util.* ;
import java.io.*; 
public class Solution
{
	public static int differentBitsSumPairwise(ArrayList<Integer> arr, int n)
	{
		// Write Your Code Here.
		int mod=1000000007;
		long ans=0;

		for(int i=0; i<32; i++){
			long temp1=0;
			for(int num : arr){
				if((num&(1<<i))!=0){
					temp1++;
				}
			}

			long temp2=n-temp1;
			ans+=(2*temp1*temp2)%mod;
			ans%=mod;
		}

		return (int)ans;
	}
}
