import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int minNumToWin(int n, int mishaNum) {
        //    Write your code here.
        int mid;
        if(n%2==0){
            mid=n/2;
            if(mishaNum==mid){
                return mishaNum+1;
            }
            else if(mishaNum>mid){
                return mishaNum-1;
            }
            else {
                return mishaNum+1;
            }
        }
        else {
            mid=(n+1)/2;
            if(mishaNum==mid){
                return mishaNum-1;
            }
            else if(mishaNum<mid){
                return mishaNum+1;
            }
            else {
                return mishaNum-1;
            }
        }

    }
}