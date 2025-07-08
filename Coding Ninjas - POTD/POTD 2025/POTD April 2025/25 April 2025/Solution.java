public class Solution {
    public static int makeBeautiful(String str) {
        int zero=0;
        int one=0;

        for(int i=0; i<str.length(); i++){
            char ch1=(i%2==0)?'0':'1';
            char ch2=(i%2==0)?'1':'0';

            if(str.charAt(i)!=ch1){
                zero++;
            }

            if(str.charAt(i)!=ch2){
                one++;
            }
        }

        return Math.min(zero, one);
    }
}