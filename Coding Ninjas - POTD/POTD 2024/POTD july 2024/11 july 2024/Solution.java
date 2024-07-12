import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> firstNegativeInteger(ArrayList<Integer> arr, int k, int n)
    {
        //    Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<=n-k; i++){
            boolean flag=true;
            for(int j=i; j<i+k; j++){
                if(arr.get(j)<0){
                    ans.add(arr.get(j));
                    flag=false;
                    break;
                }
            }

            if(flag){
                ans.add(0);
            }
        }

        return ans;
    }
}