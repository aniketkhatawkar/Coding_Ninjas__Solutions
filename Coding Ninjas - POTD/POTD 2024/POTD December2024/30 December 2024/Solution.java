import java.util.Stack;

public class Solution {

	static final long mod=1000000007;

	public static int evaluatePostfix(String[] exp) {
		// Write your code here.
		Stack<Long> stack = new Stack<>();

		for(String str : exp){
			switch(str){
				case "*":
					stack.push((stack.pop()*stack.pop())%mod);
					break;
				case "-":
					long b=stack.pop();
					long a=stack.pop();
					stack.push((a-b+mod)%mod);
					break;
				case "+":
					stack.push((stack.pop()+stack.pop())%mod);
					break;
				case "/":
					long d=stack.pop();
					long c=stack.pop();
					long inverse= modinv(d);
					stack.push((c*inverse)%mod);
					break;
				default:
					stack.push(Long.parseLong(str));
					break;
			}
		}

		return stack.peek().intValue();
	}

	public static long modinv(long num){
		long m=mod;
		long y=0,x=1;
		while(num>1){
			long q=num/m;
			long r=num%m;
			num=m;
			m=r;

			long temp=y;
			y=x-q*y;
			x=temp;
			
		}
		return (x+mod)%mod;
	}
}