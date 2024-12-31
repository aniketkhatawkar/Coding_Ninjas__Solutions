import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> printPattern(int n) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int count=1;
        int revnum=n*n+1;

        for(int i=1; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int j=0; j<n-i+1; j++){
                temp.add(count);
                count++;
            }

            int y=revnum-1;

            for(int j=0; j<n-i+1; j++){
                temp.add(revnum++);
            }
            arr.add(temp);
            
            revnum=y-(n-i-1);

        }

        return arr;
    }
}
