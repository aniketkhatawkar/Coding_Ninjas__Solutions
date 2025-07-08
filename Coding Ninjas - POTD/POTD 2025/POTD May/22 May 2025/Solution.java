import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAngle(int hour, int minute) {
        //Write your code here
        double h=(hour%12)*30+(minute*0.5);
        double m=minute*6;

        double ans=Math.abs(h-m);

        ans=Math.min(ans, 360-ans);

        return (int)ans;
    }
}