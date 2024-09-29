import java.util.* ;
import java.io.*; 
public class Solution {
    public static String[] arrangeAuthors(String[][] S) {
        // Write your code here
        List<String> list = new ArrayList<>();

        int index=1;

        for(String[] str :S){
            String auth=str[0];
            list.add(index +". "+auth);

            char indexchar='A';

            for(int i=1; i<str.length; i++){
                list.add("  " + indexchar + ". "+ str[i]);
                indexchar++;
            }
            index++;
        }
        return list.toArray(new String[0]);
    }
}
