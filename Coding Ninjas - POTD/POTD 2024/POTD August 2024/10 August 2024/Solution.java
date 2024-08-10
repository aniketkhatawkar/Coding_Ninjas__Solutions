import java.util.* ;

import java.io.*; 
public class Solution {
	public static void sortTuples(int[][] arr) {
		// Write your code here.

		Arrays.sort(arr, new Comparator<int[]> (){
			public int compare(int a[], int b[]){
				return Integer.compare(a[a.length-1], b[b.length-1]);
			}
		});

		//This is one of the way but some test cases are not pass

/* 		HashMap<Integer, ArrayList<Integer>> map= new HashMap<>();
		int n=arr.length;
		int m=arr[0].length;
		int [] temp=new int[n];

		for(int i=0; i<n; i++){
			temp[i]=arr[i][m-1];
			ArrayList<Integer> al= new ArrayList<>();
			
			for(int j=0; j<m; j++){
				al.add(arr[i][j]);
			}

			map.put(arr[i][m-1], al);
		}

		Arrays.sort(temp);

		for(int i=0; i<n; i++){
			int ele=temp[i];

			for(int j=0; j<m; j++){
				arr[i][j]=map.get(ele).get(j);
			}
		}*/ 

	}
}