import java.util.* ;
import java.io.*;
import java.math.BigInteger; 
public class Solution 
{
    public static int compareVersions(String a, String b) 
    {
        // Write your code here
        String arr1[]=a.split("\\.");
        String arr2[]=b.split("\\.");

        int max=Math.max(arr1.length, arr2.length);

        for(int i=0; i<max; i++){
            BigInteger avalue=i<arr1.length ? new BigInteger(arr1[i]) : BigInteger.ZERO;
            BigInteger bvalue=i<arr2.length ? new BigInteger(arr2[i]) : BigInteger.ZERO;

            int com= avalue.compareTo(bvalue);

            if(com>0){
                return 1;
            }
            else if(com<0){
                return -1;
            }
            
        }
        return 0;
    }

    public static boolean isgreter(String arr[], int min, int max){
        for(int i=min; i<max; i++){
            int value=Integer.valueOf(arr[i]);
            if(value>0){
                return true;
            }
        }
        return false;
    }
}