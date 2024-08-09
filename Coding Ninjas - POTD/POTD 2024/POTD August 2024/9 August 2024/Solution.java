import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<String> prettyJSON(String str) {
        // Write your code here.
        ArrayList<String> result = new ArrayList<>();

        StringBuffer currline = new StringBuffer();
        int inden=0;
        int n=str.length();

        for(int i=0; i<n; i++){
            char c=str.charAt(i);

            if(c=='{' || c=='['){
                if(currline.length()>0){
                    result.add(currline.toString());
                    currline.setLength(0);
                }

                addindent(currline, inden);
                currline.append(c);
                result.add(currline.toString());
                currline.setLength(0);
                inden++;
            }
            else if(c=='}' || c==']'){
                if(currline.length()>0){
                    result.add(currline.toString());
                    currline.setLength(0);
                }
                inden--;
                addindent(currline, inden);
                currline.append(c);

                if(i+1<n&& str.charAt(i+1)==','){
                    currline.append(',');
                    i++;
                }
                result.add(currline.toString());
                currline.setLength(0);
            }
            else if(c==','){
                currline.append(c);
                result.add(currline.toString());
                currline.setLength(0);
            }
            else {
                if(currline.length()==0){
                    addindent(currline, inden);
                }
                currline.append(c);
            }
        }

        for(int i=0; i<result.size(); i++){
            if(result.get(i).equals("{") || result.get(i).equals("[")){
                result.set(i, result.get(i)+"\n");
            }

            if(result.get(i).equals("}") || result.get(i).equals("]")){
                result.set(i, "\n" + result.get(i));
            }
        }

        return result;
    }

    private static void addindent(StringBuffer line, int indent){
        for(int i=0; i<indent; i++){
            line.append("    ");
        }
    }
}