import java.util.* ;
import java.io.*; 
import java.util.List;

public class Solution {

    public static int[] linearProbing(List<Integer> keys) {
        // Write your code here.
        int len=keys.size();

        int arr[] = new int[len];
        Arrays.fill(arr, -1);

        for(int key: keys){
            int in=key%len;

            while(arr[in]!=-1){
                in=(in+1)%len;
            }
            arr[in]=key;
        }
        return arr;
    }

}
