import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean amicablePair(int x, int y){
        // Write your code here.
        boolean a=getDiv(x)==y;
        boolean b=getDiv(y)==x;

        return a && b;
    }

    public static int getDiv(int n){
        int sum=0;

        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum+=i;
            }
        }

        return sum;
    }
}