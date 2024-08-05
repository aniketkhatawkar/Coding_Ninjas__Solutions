import java.util.* ;

import com.sun.org.apache.xpath.internal.operations.Minus;

import java.io.*; 
public class Solution {
    public static int findAngle(int hour, int minute) {
        //Write your code here

        double hAngle=(hour%12)*30+(minute*0.5);
        double mAngle=minute*6;

        double angle=Math.abs(hAngle-mAngle);
        angle=Math.min(angle, 360-angle);

        return (int)angle;
    }
}