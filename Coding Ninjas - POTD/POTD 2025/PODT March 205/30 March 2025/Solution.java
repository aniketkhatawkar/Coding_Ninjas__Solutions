import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> arrangeGame(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int n=arr.size();
        int count=Collections.frequency(arr,1);

        Collections.sort(arr);
        
        if(count+2==n && arr.get(n-1)==3 && arr.get(n-2)==2){
            return arr;
        }

        List<Integer> siblist = arr.subList(count, n);
        Collections.reverse(siblist);

        return arr;
    }
}