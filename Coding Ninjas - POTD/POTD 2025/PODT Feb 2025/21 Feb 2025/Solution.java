import java.util.* ;
import java.io.*; 
 
public class Solution {
	public static int firstCircularTour(int[] petrol, int[] distance, int n) {
		int start=0;
		long count=0, curr=0;

		for(int i=0; i<n; i++){
			long temp=petrol[i]-distance[i];
			count+=temp;
			curr+=temp;

			if(curr<0){
				start=i+1;
				curr=0;
			}
		}

		if(count<0 || n==0){
			return -1;
		}

		return start;
		
	}

}
