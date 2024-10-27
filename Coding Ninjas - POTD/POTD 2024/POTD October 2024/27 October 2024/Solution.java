import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> roundRobin(ArrayList<Integer> process, int n, int quantum) {
		// Write your code here.
		ArrayList<Integer> wt= new ArrayList<>(Collections.nCopies(n, 0));
		int rt[]= new int[n];
		int tt=0;

		for(int i=0; i<n; i++){
			rt[i]=process.get(i);
		}

		boolean flag;

		do{
			flag=true;

			for(int i=0; i<n; i++){
				if(rt[i]>0){
					flag=false;

					if(rt[i]>quantum){
						tt+=quantum;
						rt[i]-=quantum;
					}
					else {
						tt+=rt[i];
						wt.set(i, tt-process.get(i));
						rt[i]=0;
					}
				}
			}

		}while(!flag);

		return wt;

	}
	
}