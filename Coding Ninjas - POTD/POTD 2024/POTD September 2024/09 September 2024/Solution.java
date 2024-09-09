import java.util.ArrayList;

public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList < ArrayList<Integer>> result = new ArrayList<>();
        helper(n, 1, 2, 3, result);

        return result;
    }

    public static void helper(int n, int source, int auxi, int des, ArrayList < ArrayList<Integer>> result){
        if(n==1){
            ArrayList<Integer> move = new ArrayList<>();
            move.add(source);
            move.add(des);
            result.add(move);
            return;
        }

        helper(n-1, source, des, auxi, result);

        ArrayList<Integer> move = new ArrayList<>();
        move.add(source);
        move.add(des);
        result.add(move);

        helper(n-1, auxi, source, des, result);
    }
}