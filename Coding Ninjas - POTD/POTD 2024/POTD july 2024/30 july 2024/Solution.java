import java.util.* ;
import java.io.*; 
public class Solution {

    public static String second_repeat(String[] arr, int n) {
        
        // Write your Code here
        if(n<2){
            return "";
        }


        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        for(int value: map.values()){
            if(value>firstmax){
                secondmax=firstmax;
                firstmax=value;
            }
            else if(value>secondmax && value<firstmax){
                secondmax=value;
            }
        }

        if(secondmax==Integer.MIN_VALUE){
            return "";
        }

        for( String key:map.keySet()){
            int val=map.get(key);

            if(secondmax==val){
                return key;
            }
        }

        return "";
    }
}