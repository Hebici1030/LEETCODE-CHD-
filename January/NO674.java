package January;

public class NO674 {
	 public int findLengthOfLCIS(int[] nums) {
	        if(nums.length==0) return 0;
	        int result =1;int  count =1;
	        for(int  i =1;i<nums.length;++i)
	        {
	            if(nums[i]>nums[i-1])
	            {
	                count++;
	            }else
	            {
	                count=1;
	            }
	            result = Math.max(result,count);
	        }
	        return result;
	    }
}
