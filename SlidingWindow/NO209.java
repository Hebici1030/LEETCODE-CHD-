package SlidingWindow;

public class NO209 {
	 public int minSubArrayLen(int target, int[] nums) {
	        int slowindex = 0,fastindex =0;
	        int size = nums.length;
	        int sum = 0;int res = size+1;
	        while(fastindex<size)
	        {
	            sum +=nums[fastindex];
	             while(sum>=target)
	            {
	                int sublength = fastindex-slowindex+1;
	                res = (res<sublength)?res:sublength;
	                sum -= nums[slowindex++];
	            }
	            fastindex++;
	        }
	        if(res==size+1)res=0;
	        return res;
	        }
}
