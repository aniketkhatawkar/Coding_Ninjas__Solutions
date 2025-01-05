import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int calculateSquare(int num) 
    {
        //    Write your code here.
        int ans=0;
        int number=Math.abs(num);
        for(int i=1; i<=number; i++){
            ans+=number;
        }

        return ans;
    }
}