import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<String> prettyJSON(String str) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        int space=0;

        for(char ch:str.toCharArray()){
            if(ch=='[' || ch=='{') {
                addspace(sb, space);
                space++;
                sb.append(ch);
                addspace(sb, space);
            }
            else if(ch==']' || ch=='}'){
                space--;
                addspace(sb, space);
                sb.append(ch);
            }
            else {
                sb.append(ch);
                if(ch==','){
                    addspace(sb, space);
                }
            }
        }

        String arr[]=sb.toString().split("\n");
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void addspace(StringBuilder sb, int space){
        if(sb.length()>0){
            sb.append("\n");
        }

        while(space>0){
            sb.append(" ");
            space--;
        }
    }
}