import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static ArrayList<String> minRemovaltoMakeStringValid(String str) 
	{
		// Write your code here.
		ArrayList<String> ans = new ArrayList<>();

		if(str==null){
			return ans;
		}

		Set<String> set = new HashSet<>();
		Queue<String> que = new LinkedList<>();

		set.add(str);
		que.add(str);

		boolean flag=false;

		while(!que.isEmpty()){
			String curr=que.poll();
			if(isValid(curr)){
				ans.add(curr);
				flag=true;
			}

			if(flag){
				continue;
			}

			for(int i=0; i<curr.length(); i++){
				if(Character.isLetter(curr.charAt(i))){
					continue;
				}

				String next=curr.substring(0, i)+curr.substring(i+1);

				if(!set.contains(next)){
					que.add(next);
					set.add(next);
				}
			}
		}

		Collections.sort(ans);

		return ans;
	}

	public static boolean isValid(String str){
		int count=0;

		for(char ch : str.toCharArray()){
			if(ch=='('){
				count++;
			}
			else if(ch==')'){
				if(count==0){
					return false;
				}
				count--;
			}
		}

		return count==0;
	}
}
