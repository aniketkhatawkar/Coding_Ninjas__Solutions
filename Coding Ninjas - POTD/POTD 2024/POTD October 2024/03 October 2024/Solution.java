import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static ArrayList<Integer> searchWords(String booklet, String[] diary) {
        // Write your code here
        ArrayList<Integer> al = new ArrayList<>();

        for(String str:diary){
            int i=booklet.indexOf(str);

            while(i!=-1){
                al.add(i);
                i=booklet.indexOf(str, i+1);
            }
        }

        Collections.sort(al);

        return al;
    }

}
