import java.util.ArrayList;

public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList < ArrayList<Integer>> ans = new ArrayList<>();

        helper(n, 1,3,2, ans);

        return ans;
    }

    public static void helper(int n, int from, int to, int temp, ArrayList < ArrayList<Integer>> ans){
        if(n==0){
            return;
        }

        helper(n-1, from, temp, to, ans);

        ArrayList<Integer> move = new ArrayList<>();

        move.add(from);
        move.add(to);
        ans.add(move);

        helper(n-1, temp, to, from, ans);
    }
}