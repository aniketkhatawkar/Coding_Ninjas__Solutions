import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {

		// Write your code here
		int n=arr.size();
		int m= arr.get(0).size();

		int prefix[][] = new int[n][m];

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				prefix[i][j]=arr.get(i).get(j);

				if(i>0){
					prefix[i][j]+=prefix[i-1][j];
				}

				if(j>0){
					prefix[i][j]+=prefix[i][j-1];
				}

				if(i>0 && j>0){
					prefix[i][j]-=prefix[i-1][j-1];
				}
			}
		}

		ArrayList<Integer> ans= new ArrayList<>();

		for(ArrayList<Integer> q:queries){
			int x1=q.get(0);
			int y1=q.get(1);
			int x2=q.get(2);
			int y2=q.get(3);

			int sum=prefix[x2][y2];

			if(x1>0){
				sum-=prefix[x1-1][y2];
			}

			if(y1>0){
				sum-=prefix[x2][y1-1];
			}

			if(x1>0 && y1>0){
				sum+=prefix[x1-1][y1-1];
			}

			ans.add(sum);
		}

		return ans;
	}
}
