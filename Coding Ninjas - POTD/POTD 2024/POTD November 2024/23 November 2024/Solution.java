import java.util.* ;
import java.io.*; 
public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        int n=arr.size();

        while(!arr.isEmpty() && arr.get(0)==0) {
            arr.remove(0);
        }

        if(arr.isEmpty()){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1);
            return ans;
        }

        n=arr.size();

        int carry=1;
        for(int i=n-1; i>-1; i--){
            int sum=arr.get(i)+carry;
            arr.set(i, sum%10);
            carry=sum/10;
        }

        if(carry>0){
            arr.add(0, carry);
        }

        return arr;
    }
}
