import java.util.* ;
import java.io.*; 

public class Solution {
    public static List<String> reOrderSentences(String[] sentences) {
        // Write your code here!
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();

        for(String str : sentences){
            String [] par=str.split(" ", 2);
            if(par.length<2){
                continue;
            }

            if(Character.isDigit(par[1].charAt(0))){
                arr2.add(str);
            }
            else {
                arr1.add(str);
            }
        }

        Collections.sort(arr1, (s1, s2)->{
            String [] p1=s1.split(" ", 2);
            String [] p2=s2.split(" ", 2);
            int temp=p1[1].compareTo(p2[1]);
            return temp!=0 ? temp :p1[0].compareTo(p2[0]);
        });

        List<String> ans= new ArrayList<>(arr1);
        ans.addAll(arr2);

        return ans;

    }
}