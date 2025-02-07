import java.util.* ;
import java.io.*; 
public class Solution 
{    
    public static String morseToEnglish(String morsecode) 
	{
        // Write you code here
        List<String> arrchar=Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--."
        , "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..");

        List<String> arrdigit=Arrays.asList("-----", ".----", "..---", "...--"
        , "....-", ".....", "-....", "--...", "---..", "----.");

        String strarr[] = morsecode.split("\\s+");
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<strarr.length; i++){
            if(arrchar.contains(strarr[i])){
                sb.append((char)('a'+ arrchar.indexOf(strarr[i])));
            }
            else {
                sb.append(arrdigit.indexOf(strarr[i]));
            }
        }

        return sb.toString();
    }

}