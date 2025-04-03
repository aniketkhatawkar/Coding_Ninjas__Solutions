import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int swapAdjacent(int n) 
    {
        // Write your code here.
        String str = Integer.toBinaryString(n);
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<32-str.length(); i++) {
            sb.append('0');
        }

        sb.append(str);

        char chararr[] = sb.toString().toCharArray();

        for(int i=0; i<chararr.length; i+=2){
            char ch=chararr[i];
            chararr[i]=chararr[i+1];
            chararr[i+1]=ch;
        }

        return Integer.parseInt(String.valueOf(chararr),2);
    }
}