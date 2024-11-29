import java.util.* ;
import java.io.*; 
public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 1;

        for (int i = arr.size() - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }
}
