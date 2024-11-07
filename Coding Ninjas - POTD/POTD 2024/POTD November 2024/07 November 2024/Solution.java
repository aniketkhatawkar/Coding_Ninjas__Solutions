import java.util.* ;
import java.io.*; 
public class Solution {
    public static long bobsHomework(int m)
    {
        // Write your code here
        char arr[]=Integer.toString(m).toCharArray();
        int n=arr.length;
        
        int i=n-2;

        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        if(i==-1){
            return -1;
        }

        int j=n-1;

        while(arr[j]<=arr[i]){
            j--;
        }

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        helper(arr, i+1, n-1);

        long ans=Long.parseLong(new String(arr));

        return ans;
    }

    public static void helper(char arr[], int s, int e){
        while(s<e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
    }
}
