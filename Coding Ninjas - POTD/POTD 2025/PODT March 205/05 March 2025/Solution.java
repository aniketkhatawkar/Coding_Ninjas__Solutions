import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=arr.size();

        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        int con=n/3;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int key:map.keySet()){
            if(map.get(key)>con){
                ans.add(key);
            }
        }

        return ans;
    }
}