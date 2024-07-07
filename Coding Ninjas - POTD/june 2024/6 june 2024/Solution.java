import java.util.HashMap;

public class Solution{
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        HashMap<Integer, Integer> hm = new HashMap<>();

        // count occurrence of numbers 
        for(int i: arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        // return number that have an odd occurrence
        for(int i: arr){
            if(hm.getOrDefault(i, 0)%2!=0) {
                return i;
            }
        }

        // return -1 if no such number
        return -1;
    }
}