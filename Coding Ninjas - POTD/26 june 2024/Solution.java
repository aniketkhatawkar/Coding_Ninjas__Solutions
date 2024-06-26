import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumCost(ArrayList<Integer> rowCost, ArrayList<Integer> colCost, int l, int w) {
		// Write your code here.
		Collections.sort(rowCost, Collections.reverseOrder());
		Collections.sort(colCost, Collections.reverseOrder());

		int totaocost=0, hseg=1, vseg=1;

		int i=0, j=0;

		while(i<rowCost.size() && j<colCost.size()){
			if(rowCost.get(i)>=colCost.get(j)){
				totaocost+=rowCost.get(i)*vseg;
				hseg++;
				i++;
			}
			else {
				totaocost+=colCost.get(j)*hseg;
				vseg++;
				j++;
			}
		}

		while (i<rowCost.size()){
			totaocost+=rowCost.get(i)*vseg;
			i++;
		}

		while(j<colCost.size()){
			totaocost+=colCost.get(j)*hseg;
			j++;
		}

		return totaocost;
	}

}