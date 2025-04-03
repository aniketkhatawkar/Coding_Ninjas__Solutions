import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> newInterval)
    {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int i=0, n=intervals.size();

        while(i<n && intervals.get(i).get(1)< newInterval.get(0)){
            ans.add(intervals.get(i));
            i++;
        }

        while(i<n && intervals.get(i).get(0)<= newInterval.get(1)){
            newInterval.set(0, Math.min(newInterval.get(0), intervals.get(i).get(0)));
            newInterval.set(1, Math.max(newInterval.get(1), intervals.get(i).get(1)));
            i++;
        }

        ans.add(newInterval);

        while(i<n){
            ans.add(intervals.get(i));
            i++;
        }

        return ans;
    }
}