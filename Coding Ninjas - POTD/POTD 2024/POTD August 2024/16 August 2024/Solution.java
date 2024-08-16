import java.util.* ;
import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode; 
public class Solution {
    public static String findDivision(double x, double y, int n) {
        // Write your code here.
        BigDecimal x1=new BigDecimal(Double.toString(x));
        BigDecimal y1=new BigDecimal(Double.toString(y));

        BigDecimal div= x1.divide(y1, 10000, RoundingMode.FLOOR);

        String str=div.toPlainString();
        int index=str.indexOf(".");

        return str.substring(0, index+n+1);
    }
}