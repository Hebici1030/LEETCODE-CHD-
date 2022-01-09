package January;

public class NO150 {
	public int evalRPN(String[] tokens) {
	       Stack<Integer> numStack = new Stack<>();
	        
	        //�����沨�����ʽ
	        for (String token : tokens) {
	            //ƥ������
	            if (!("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token))) {
	                //������ջ
	                numStack.push(Integer.parseInt(token));
	            }
	            //ƥ�������
	            else {
	                //���ֳ�ջ
	                int num2 = numStack.pop();
	                int num1 = numStack.pop();

	                //��������ջ
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
