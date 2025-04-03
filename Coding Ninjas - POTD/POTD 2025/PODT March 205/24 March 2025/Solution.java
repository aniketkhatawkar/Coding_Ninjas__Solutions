import java.util.* ;
import java.io.*; 
 
public class Solution {
	public static int firstCircularTour(int[] petrol, int[] distance, int n) {
		long bal=0, start=0, kilo=0;

		for(int i=0; i<n; i++){
			bal+=petrol[i]-distance[i];

			if(bal<0){
				kilo+=bal;
				start=i+1;
				bal=0;
			}
		}

		return (int)((bal+kilo>=0) ? start : -1);
	}

}
