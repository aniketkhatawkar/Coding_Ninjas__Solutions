import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] positiveIntegers(int n) {

        // WRite your Code here
        int arr[] = new int[3];
        if(n%2==1){
            arr[0]=n/2;
            arr[1]=n/2;
            arr[2]=1;
        }
        else if(n%4==0){
            arr[0]=n/2;
            arr[1]=n/4;
            arr[2]=n/4;
        }
        else {
            arr[0]=n/2-1;
            arr[1]=n/2-1;
            arr[2]=2;
        }

        return arr;
    }
}