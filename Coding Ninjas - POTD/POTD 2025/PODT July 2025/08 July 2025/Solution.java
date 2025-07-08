import java.util.* ;
import java.io.*; 
import java.math.*;
public class Solution {
    public static String findDivision(int x, int y, int n) {
        // Write your code here.
        BigDecimal bx = new BigDecimal(x);
        BigDecimal by = new BigDecimal(y);

        BigDecimal bd =bx.divide(by, n, RoundingMode.DOWN);

        if(bd.compareTo(BigDecimal.ZERO)==0 && (bx.signum()<0 ^ by.signum()<0)){
            return "-"+bd.toPlainString();
        }

        return bd.toPlainString();
    }
}