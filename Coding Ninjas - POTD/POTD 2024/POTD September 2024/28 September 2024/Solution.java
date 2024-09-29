import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution {

    public static Map<String, List<Integer>> mp= new HashMap<>();
    public static void receiveMessage(String user, int time){
    	// Write your code here
        mp.putIfAbsent(user, new ArrayList<>());
        mp.get(user).add(time);
    }

 	public static ArrayList<Integer> getMessageCount(int l, int r, String user, int k){
    	// Write your code here
        List<Integer> times=mp.get(user);

        Collections.sort(times);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=l; i<=r; i+=k){
            int end=Math.min(i + k-1, r);

            int startin=Collections.binarySearch(times, i);

            if(startin<0){
                startin=-(startin+1);
            }

            int endin=Collections.binarySearch(times, end+1);

            if(endin<0){
                endin=-(endin+1);
            }

            ans.add(endin-startin);
        }

        return ans;
    }
       
}