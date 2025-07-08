import java.util.* ;
import java.io.*; 
public class Solution {
	public static void sortTuples(int[][] arr) {
		// Write your code here.
		int n=arr.length;
		int l=arr[0].length;

		for(int i=0; i<n; i++){
			int key=arr[i][l-1];
			int temp[]=arr[i].clone();
			int j=i-1;

			while(j>=0 && arr[j][l-1]>key){
				arr[j+1]=arr[j].clone();
				j--;
			}

			arr[j+1]=temp;
		}
	}
}