package January;

public class NO347 {
	public int[] maxSlidingWindow(int[] nums, int k) {
	      Deque<Integer> deque = new LinkedList<>();
	      int len = nums.length;
	      for(int i=0;i<k;++i)
	      {
	          while(!deque.isEmpty()&&nums[deque.peekLast()]<=nums[i])
	          {
	              deque.pollLast();
	          }
	          deque.offerLast(i);
	      }
	      int []res = new int[len-k+1];
	      res[0]=nums[deque.peek()];
	      for(int i=k;i<len;++i)
	      {
	          while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()])
	          {
	              deque.pollLast();
	          }
	          deque.offerLast(i);
	          while(deque.peekFirst()<=i-k)
	          {
	              deque.pollFirst();
	          }
	          res[i-k+1]=nums[deque.peekFirst()];
	      }
	        return res;
	    }
}
