package January;

public class NO225 {
	 Deque<Integer> queue;
	    public MyStack() {
	        queue = new ArrayDeque<>();
	    }
	    
	    public void push(int x) {
	        queue.addLast(x);
	    }
	    
	    public int pop() {
	         int size = queue.size();
	         --size;
	        // 将 que1 导入 que2 ，但留下最后一个值
	        while (size-- > 0) {
	            queue.addLast(queue.peekFirst());
	            queue.pollFirst();
	        }

	        int res = queue.pollFirst();
	        return res;
	    }
	    
	    public int top() {
	        return queue.peekLast();
	    }
	    
	    public boolean empty() {
	        return queue.isEmpty();
	    }
}
