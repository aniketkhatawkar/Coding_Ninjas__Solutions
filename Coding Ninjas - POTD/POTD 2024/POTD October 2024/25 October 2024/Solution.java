import java.util.ArrayList;

public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        helper(n, 1, 3, 2, al);
        return al;
    }

    public static void helper(int n, int sour, int dest, int auxi, ArrayList<ArrayList<Integer>> al){
        if(n==1){
            ArrayList<Integer> arr= new ArrayList<>();

            arr.add(sour);
            arr.add(dest);
            al.add(arr);
            return;
        }

        helper(n-1, sour, auxi, dest, al);

        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(sour);
        arr.add(dest);
        al.add(arr);

        helper(n-1, auxi, dest, sour, al);
    }
}