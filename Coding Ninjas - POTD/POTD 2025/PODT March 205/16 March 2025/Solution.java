import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int minCashFlow(ArrayList<ArrayList<Integer>> money, int n)
    {
        //    Write your code here.
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i]-=money.get(i).get(j);
                arr[j]+=money.get(i).get(j);
            }
        }

        int ans=0;

        for(int value: arr){
            if(value<0){
                ans+=(-value);
            }
        }

        return ans;
    }
}