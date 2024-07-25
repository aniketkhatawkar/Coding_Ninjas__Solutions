import java.util.*;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static double tossStrangeCoins(ArrayList<Double> prob, int target)
	{
		// Write your code here
		int n=prob.size();

		double dp[][]= new double[n+1][target+1];

		dp[0][0]=1.0;

		for(int i=1; i<=n; i++){
			for(int j=0; j<=target; j++){
				dp[i][j]=dp[i-1][j]*(1-prob.get(i-1));
				if(j>0){
					dp[i][j]+=dp[i-1][j-1]*prob.get(i-1);
				}
			}
		}

		return dp[n][target];
	}
}

