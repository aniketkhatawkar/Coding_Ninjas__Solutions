public class Solution {
    public static int isCyclicRotation(String p, String q)  {

        if(p.length()!=q.length()){
            return 0;
        }

        int i=0, j=0;
        String str= p + p;

        while(i<str.length()){
            if(str.charAt(i)==q.charAt(j)){
                i++;
                j++;

                if(j==q.length()){
                    return 1;
                }
            }
            else if(j!=0){
                j=0;
            }
            else {
                i++;
            }
        }

        return 0;
    }
}