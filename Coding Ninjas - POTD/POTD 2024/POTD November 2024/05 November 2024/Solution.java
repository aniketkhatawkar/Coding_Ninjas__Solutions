public class Solution {
	public static boolean reachDestination(int sx, int sy, int dx, int dy) {
		// Write your code here
		while(dx!=0 && dy!=0){
			if(sx==dx && sy==dy){
				return true;
			}
			int temp=dx;
			dx=dy;
			dy=Math.abs(temp-dx);

			if(sx==dx && sy==dy || sx==dy && sy==dx){
				return true;
			}
		}

		return false;
	}
}
