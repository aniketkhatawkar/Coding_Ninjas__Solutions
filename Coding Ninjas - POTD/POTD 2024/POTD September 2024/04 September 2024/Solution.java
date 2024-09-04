import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList < Integer > corpFlightBookings(ArrayList < ArrayList < Integer >> bookings, int n) {
        // Write your code here.
        int arr[]= new int[n+1];

        for(ArrayList<Integer> book : bookings){
            int f=book.get(0);
            int l=book.get(1);
            int s=book.get(2);

            arr[f-1]+=s;

            if(l<n){
                arr[l]-=s;
            }
        }

        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
        }

        ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0; i<n; i++){
            ans.add(arr[i]);
        }

        return ans;
    }
}