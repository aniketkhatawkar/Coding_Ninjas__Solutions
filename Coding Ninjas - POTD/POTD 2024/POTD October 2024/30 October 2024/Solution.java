import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<ArrayList<Character>> constructMatrix(int n, int m) 
	{
		//    Write your code here.
		ArrayList<ArrayList<Character>> arr= new ArrayList<>();

		for(int i=0; i<n; i++){
			ArrayList<Character> row= new ArrayList<>(Collections.nCopies(m, ' '));
			arr.add(row);
		}

		char ch='X';
		int top=0, bottom=n-1, left=0, right=m-1;

		while(top<=bottom && left<=right){

			for(int i=left; i<=right; i++){
				arr.get(top).set(i, ch);
			}
			top++;

			for(int i=top; i<=bottom; i++){
				arr.get(i).set(right, ch);
			}
			right--;

			if(top<=bottom){
				for(int i=right; i>=left; i--){
					arr.get(bottom).set(i, ch);
				}
				bottom--;
			}

			if(left<=right){
				for(int i=bottom; i>=top; i--){
					arr.get(i).set(left, ch);
				}
				left++;
			}

			ch=(ch=='X')?'0':'X';
		}

		return arr;
	}
}