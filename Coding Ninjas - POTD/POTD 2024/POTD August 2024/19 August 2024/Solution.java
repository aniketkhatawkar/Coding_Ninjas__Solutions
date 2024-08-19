import java.util.* ;
import java.io.*; 

public class Solution {
	public static void posAndNeg(int[] arr) {
		// Write your code here
		int len=arr.length;
		int arrpos[] = new int[len/2];
		int arrneg[] = new int[len/2];
		int indexpos=0, indexneg=0;

		for(int i=0; i<len; i++){
			if(arr[i]<0){
				arrneg[indexneg++]=arr[i];
			}
			else {
				arrpos[indexpos++]=arr[i];
			}
		}

		indexneg=0;
		indexpos=0;

		for(int i=0; i<len; i++){
			if(i%2==0){
				arr[i]=arrpos[indexpos++];
			}
			else {
				arr[i]=arrneg[indexneg++];
			}
		}
	}

}
