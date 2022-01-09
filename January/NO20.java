package January;

public class NO20 {
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        for(char temp:s.toCharArray())
	        {
	            if(temp=='(')stack.push(')');
	            else if(temp=='{')stack.push('}');
	            else if(temp=='[')stack.push(']');
	            else if(stack.isEmpty()||stack.pop()!=temp)return false;
	        }
	        return stack.isEmpty();
	    }
}
