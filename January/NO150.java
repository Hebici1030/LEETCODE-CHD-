package January;

public class NO150 {
	public int evalRPN(String[] tokens) {
	       Stack<Integer> numStack = new Stack<>();
	        
	        //遍历逆波兰表达式
	        for (String token : tokens) {
	            //匹配数字
	            if (!("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token))) {
	                //数字入栈
	                numStack.push(Integer.parseInt(token));
	            }
	            //匹配运算符
	            else {
	                //数字出栈
	                int num2 = numStack.pop();
	                int num1 = numStack.pop();

	                //计算结果入栈
	                if (token.equals("+")) {
	                    numStack.push(num1 + num2);
	                } else if (token.equals("-")) {
	                    numStack.push(num1 - num2);
	                } else if (token.equals("*")) {
	                    numStack.push(num1 * num2);
	                } else if (token.equals("/")) {
	                    numStack.push(num1 / num2);
	                }
	            }
	        }
	        return numStack.pop();
	    }
}
