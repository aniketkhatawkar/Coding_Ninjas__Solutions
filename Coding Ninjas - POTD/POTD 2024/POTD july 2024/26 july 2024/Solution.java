import java.util.* ;
import java.io.*; 
public class Solution {

    public static boolean countPlatesOnTable(int n,int R,int r) {
        // Write your code here
        if(n==1){
            return r<=R;
        }

        if(r>R){
            return false;
        }

        double angel=2*Math.asin((double)r/(R-r));

        double totalangel=n*angel;

        return totalangel<=2*Math.PI;

    }

}