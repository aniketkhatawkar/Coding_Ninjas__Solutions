import java.util.* ;
import java.io.*; 
import java.util.List;

public class Solution {

    public static int[] linearProbing(List<Integer> keys) {
        // Write your code here.
        int n=keys.size();
        int ans[]=new int[n];

        Arrays.fill(ans, -1);

        for(int key: keys){
            int index=key%n;

            while(ans[index]!=-1){
                index=(index+1) %n;
            }

            ans[index]=key;
        }

        return ans;
    }

}
