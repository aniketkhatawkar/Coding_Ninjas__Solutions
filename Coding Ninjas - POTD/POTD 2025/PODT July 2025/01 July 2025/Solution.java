import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {

		// Write your code here
		int n=arr.size();
		int m=arr.get(0).size();

		int sums[][] = new int[n+1][m+1];

		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				sums[i][j]=arr.get(i-1).get(j-1)+sums[i-1][j]+sums[i][j-1]-sums[i-1][j-1];
			}
		}

		ArrayList<Integer> ans = new ArrayList<>();

		for(ArrayList<Integer> q : queries){
			int r1=q.get(0), r2=q.get(2), c1=q.get(1), c2=q.get(3);

			r1++;
			c1++;
			r2++;
			c2++;


			int sum=sums[r2][c2]-sums[r1-1][c2]-sums[r2][c1-1]+sums[r1-1][c1-1];

			ans.add(sum);
		}

		return ans;
	}
}
