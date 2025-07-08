import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=lower; i<=upper; i++){
            if(helper(i)){
                ans.add(i);
            }
        }

        return ans;
    }

    public static boolean helper(int num) {
        // Write your code here.
        int n=num;

        while(num>0){
            int temp=num%10;
            if(temp==0 || n%temp!=0){
                return false;
            }
            num/=10;
        }

        return true;
    }
}