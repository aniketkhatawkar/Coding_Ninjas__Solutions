import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> allocateCycles(ArrayList<ArrayList<Integer>> students, ArrayList<ArrayList<Integer>> cycles)
	{
		// Write your code here
		int n=students.size(), m=cycles.size();

		List<int []> allpair = new ArrayList<>();

		for(int i=0; i<n; i++){
			int sx=students.get(i).get(0);
			int sy=students.get(i).get(1);
			for(int j=0; j<m; j++){
				int cx=cycles.get(j).get(0);
				int cy=cycles.get(j).get(1);
				int dist=Math.abs(sx-cx)+Math.abs(sy-cy);
				allpair.add(new int[]{dist , i, j});
			}
		}

		Collections.sort(allpair, (a,b)->{
			if(a[0]!=b[0])
				return a[0]-b[0];

			if(a[1]!=b[1])
				return a[1]-b[1];

			return a[2]-b[2];
		});

		boolean assigstud[]= new boolean[n];
		boolean assigcyc[]= new boolean[m];
		int ans[] = new int[n];
		Arrays.fill(ans, -1);

		for(int pair[] : allpair){
			int stu=pair[1];
			int cyc=pair[2];
			if(!assigstud[stu] && !assigcyc[cyc]){
				ans[stu]=cyc;
				assigcyc[cyc]=true;
				assigstud[stu]=true;
			}
		}

		ArrayList<Integer> al = new ArrayList<>();
		for(int value:ans){
			al.add(value);
		}

		return al;
		
	}
}

