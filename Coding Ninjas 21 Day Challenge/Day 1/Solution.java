public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch(ch){
            case 1:
                return Math.PI*Math.pow(a[0], 2);
            default:
                return a[0]*a[1];
        }
    }
}