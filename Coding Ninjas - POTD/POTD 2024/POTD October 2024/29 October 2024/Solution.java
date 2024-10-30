import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<String> fittestTrainee(ArrayList<ArrayList<Integer>> oxygen) 
    {
		// Write your code here
		ArrayList<String> al1= new ArrayList<>();
		ArrayList<Integer> al2= new ArrayList<>();

		for(ArrayList<Integer> i: oxygen){
			int sum=0;
			for(int j:i){
				sum+=j;
			}
			al2.add(sum/3);
		}

		int maxavg=0;

		for(int i:al2){
			if(i>=1&&i<=100){
				maxavg=Math.max(maxavg, i);
			}
		}

		for(int i=0; i<al2.size(); i++){
			int avg=al2.get(i);
			if(avg>=1&&avg<=100){
				if(maxavg==avg && avg>=70){
					al1.add("Trainee"+(i+1));
				}
				else if(avg<70){
					al1.add("Unfit");
				}
			}
			else {
				al1.add("Unfit");
			}
		}
		return al1;
	}
}