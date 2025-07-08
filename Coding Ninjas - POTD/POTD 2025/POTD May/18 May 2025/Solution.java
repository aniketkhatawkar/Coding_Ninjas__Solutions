import java.util.* ;
import java.io.*; 
public class Solution {
  public static long countOf3(int x) {
      // Write your code here.
      long ans=0;
      long power=1;

      while(power<=x){
        long nextp=power*10;
        long rigth=x%power;
        long curr=(x/power)%10;
        long left=x/nextp;

        if(curr<3){
          ans+=power*left;
        }
        else if(curr==3){
          ans+=power*left+(rigth+1);
        }
        else {
          ans+=power*(left+1);
        }

        power*=10;
      }
      
      return ans;
  }
}