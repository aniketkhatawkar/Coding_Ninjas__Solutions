import java.util.* ;
import java.io.*; 
public class Solution {
    public static int kSmallest(int n, int m, int k, int[][] mat){
        // Write your code here.
        List<Integer> ans = sums(toList(mat[0]), toList(mat[1]), k);

        for(int i=2; i<n; i++){
            ans = sums(ans, toList(mat[i]), k);
        }

        return ans.get(k-1);
    }

    public static List<Integer> sums(List<Integer> a, List<Integer> b, int k){
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<a.size(); i++){
            for(int j=0; j<b.size(); j++){
                arr.add(a.get(i)+b.get(j));
            }
        }

        Collections.sort(arr);

        if(arr.size()<k){
            return arr;
        }

        return arr.subList(0, k);
    }

    public static List<Integer> toList(int arr[]){
        List<Integer> list = new ArrayList<>();

        for(int num:arr){
            list.add(num);
        }

        return list;
    }
}