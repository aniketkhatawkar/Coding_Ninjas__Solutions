import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int key: map.keySet()){
            if(map.get(key)>(n/3)){
                ans.add(key);
            }
        }

        return ans;
    }
}