import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		int n=mat.size();
		int m=mat.get(0).size();

		int ans=0;

		int dx[]={-1,1,0,0};
		int dy[]={0,0,-1,1};

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(mat.get(i).get(j)==0){
					int cover=0;
					for(int z=0; z<4; z++){
						int ni=i+dx[z];
						int nj=j+dy[z];

						if(ni>=0 && ni<n && nj>=0 && nj<m && mat.get(ni).get(nj)==1){
							cover++;
						}
					}
					ans+=cover;
				}
			}
		}

		return ans;
	}
}
