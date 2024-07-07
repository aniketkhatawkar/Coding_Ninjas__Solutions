import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findFirstRepeatingDigit(String digitPattern) {
        // Write your code here.
        HashMap<Integer, Integer> mp= new HashMap<>();

        // get String length
        int n=digitPattern.length();

        // itrate char by char
        for(int i=0; i<n; i++){

            // convert char into int
            int value=Character.getNumericValue(digitPattern.charAt(i));

            // put int map with count
            mp.put(value, mp.getOrDefault(value, 0)+1);

            // return value if count is greter than 1
            if(mp.get(value)>1){
                return value;
            }
        }

        // return -1 if no repeating value is present
        return -1;
    }
}
