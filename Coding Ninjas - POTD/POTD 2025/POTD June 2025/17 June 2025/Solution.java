import java.util.* ;
import java.io.*; 

public class Solution {

    public static List<String> generateBinaryNumbers(int n) {
        //Write your code here
        List<String> ans = new ArrayList<>();

        for(int i=1; i<=n; i++){
            ans.add(Integer.toBinaryString(i));
        }

        return ans;
    }

}
