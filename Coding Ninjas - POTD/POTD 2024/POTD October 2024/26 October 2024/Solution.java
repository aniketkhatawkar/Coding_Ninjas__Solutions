import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        int [] coins={1000, 500, 100, 50, 20, 10, 5, 2, 1};
        
        List<Integer> list= new ArrayList<>();

        for(int coin:coins){
            while(n>=coin){
                n-=coin;
                list.add(coin);
            }
        }

        return list;
    }
}
