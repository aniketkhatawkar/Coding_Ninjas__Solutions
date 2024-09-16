import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {

		// Write your code here
		int n=arr.size();
		int m=arr.get(0).size();

		int pre[][] = new int[n][m];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				pre[i][j]=arr.get(i).get(j);

				if(i>0){
					pre[i][j]+=pre[i-1][j];
				}

				if(j>0){
					pre[i][j]+=pre[i][j-1];
				}

				if(i>0 && j>0){
					pre[i][j]-=pre[i-1][j-1];
				}
			}
		}

		ArrayList<Integer> ans = new ArrayList<>();

		for(ArrayList<Integer> qu: queries){
			int r1=qu.get(0), c1=qu.get(1), r2=qu.get(2), c2=qu.get(3);

			int sum=pre[r2][c2];

			if(r1>0){
				sum-=pre[r1-1][c2];
			}

			if(c1>0){
				sum-=pre[r2][c1-1];
			}

			if(r1>0 && c1>0){
				sum+=pre[r1-1][c1-1];
			}

			ans.add(sum);
		}

		return ans;
	}
}
