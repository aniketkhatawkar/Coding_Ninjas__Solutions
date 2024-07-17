import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int concatLargestDigit(int a, int b, int c)
    {
        //    Write your code here.
        int ans=0;

        ans=ans*10 + higher(a);
        ans=ans*10 + higher(b);
        ans=ans*10 + higher(c);

        return ans;

    }

    public static int higher(int num){
        int ans=0;

        while(num>0){
            if(num%10>ans){
                ans=num%10;
            }
            num/=10;
        }

        return ans;
    }
}