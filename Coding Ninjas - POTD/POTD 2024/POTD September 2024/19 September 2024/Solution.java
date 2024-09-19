import java.util.* ;
import java.io.*; 

public class Solution {
    public static List<String> reOrderSentences(String[] sentences) {
        // Write your code here!

        List<String> letter=new ArrayList<>();
        List<String> number=new ArrayList<>();

        for(String str: sentences){
            String[] words=str.split(" ", 2);

            if(Character.isDigit(words[1].charAt(0))){
                number.add(str);
            }
            else {
                letter.add(str);
            }
        }

        Collections.sort(letter, (s1, s2)-> {
            String[] part1=s1.split(" ",2);
            String[] part2=s2.split(" ",2);

            int cmp=part1[1].compareTo(part2[1]);
            if(cmp!=0){
                return cmp;
            }
            else {
                return part1[0].compareTo(part2[0]);
            }
        });

        List<String> ans= new ArrayList<>(letter);

        ans.addAll(number);

        return ans;

    }
}