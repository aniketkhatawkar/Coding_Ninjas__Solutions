import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList < Integer > corpFlightBookings(ArrayList < ArrayList < Integer >> bookings, int n) {
        // Write your code here.
        int ans[] = new int[n];

        for(ArrayList<Integer> booked:bookings){
            int first=booked.get(0);
            int second=booked.get(1);
            int book=booked.get(2);
            
            for(int j=first-1; j<second; j++){
                ans[j]+=book;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            result.add(ans[i]);
        }

        return result;
    }
}