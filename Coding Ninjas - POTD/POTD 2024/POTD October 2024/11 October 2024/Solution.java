import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] getAverage(int n, int q, int[] arr, int[][] queries) {
		// Write your code here.
		ArrayList<Integer> al = new ArrayList<>();

		for(int i: arr){
			al.add(i);
		}

		ArrayList<Long> pre = new ArrayList<>();
		long sum=0;
		for(int i: arr){
			sum+=i;
			pre.add(sum);
		}

		ArrayList<Integer> res = new ArrayList<>();

		for(int [] que: queries){
			if(que[0]==1){
				int x=que[1];
				al.add(x);

				sum+=x;
				pre.add(sum);
			}
			else if(que[0]==2){
				int l=que[1]-1;
				int r=que[2]-1;
				
				long sumrang=pre.get(r);

				if(l>0){
					sumrang-=pre.get(l-1);
				}

				int numl=r-l+1;
				int avg=(int)(sumrang/numl);

				res.add(avg);
			}
		}

		int ans[]= new int[res.size()];

		for(int i=0; i<res.size(); i++){
			ans[i]=res.get(i);
		}

		return ans;
	}
}