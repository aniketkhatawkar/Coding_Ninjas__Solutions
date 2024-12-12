import java.util.* ;
import java.io.*; 
public class Solution
{
public static int squareRoot(int a)
    {
        // Write your code here.
        int ans=0;

        for(int i=1; i<=(a+1)/2; i++){
            if(i*i<=a){
                ans=i;
            }
        }

        return ans;
    }
}
