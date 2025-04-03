import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> roundRobin(ArrayList<Integer> process, int n, int quantum) {
		// Write your code here.
		int arr[] = new int[n];
		ArrayList<Integer> wt = new ArrayList<>(Collections.nCopies(n,0));

		int rt[]= new int[n];

		for(int i=0; i<n; i++){
			rt[i]=process.get(i);
		}

		int time=0;
		boolean flag;

		do{
			flag=true;

			for(int i=0; i<n; i++){
				if(rt[i]>0){
					flag=false;
					int et=Math.min(rt[i], quantum);
					time+=et;
					rt[i]-=et;

					if(rt[i]==0){
						wt.set(i, time-process.get(i));
					}
				}
			}
		}while(!flag);

		return wt;
		
	}
	
}