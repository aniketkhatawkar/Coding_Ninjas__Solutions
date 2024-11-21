import java.util.ArrayList;
import java.util.Collections;

public class Solution{
    public static ArrayList<Long> createSequence(long n){
        // Write your code here.
        ArrayList<Long> arr = new ArrayList<>();

        helper(0, n, arr);
        Collections.sort(arr);
        return arr;
    }

    public static void helper(long num, long n, ArrayList<Long> arr){
        if(num>n){
            return;
        }

        if(num>0){
            arr.add(num);
        }

        helper(num*10+2, n, arr);
        helper(num*10+5, n, arr);
    }
}