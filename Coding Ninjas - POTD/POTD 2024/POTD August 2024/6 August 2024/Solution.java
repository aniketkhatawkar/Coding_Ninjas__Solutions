import java.util.* ;
import java.io.*; 
public class Solution 
{    
    public static String morseToEnglish(String morsecode) 
	{
        // Write you code here

        ArrayList <String> al = new ArrayList<>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
        "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
        "---..", "----."));

        String split[] = morsecode.split(" ");

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<split.length; i++){
            int ele=al.indexOf(split[i]);
            if(ele<26)
                sb.append((char)(ele+97));
            else 
                sb.append((char)(ele+22));
        }

        return sb.toString();
    }

}