import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=lower; i<=upper; i++){
            if(helper(i)){
                ans.add(i);
            }
        }

        return ans;
    }

    public static boolean helper(int num){
        boolean flag=true;
        ArrayList<Integer> al= getnum(num);

        if(al.contains(0)){
            return false;
        }

        int n=al.size(), i=0;

        while(i<n && flag){
            if(num%al.get(i)!=0){
                flag=false;
                break;
            }
            i++;
        }

        return flag;
    }

    public static ArrayList<Integer> getnum(int num){
        ArrayList<Integer> al = new ArrayList<>();

        while(num>0){
            al.add(num%10);
            num/=10;
        }

        return al;
    }
}