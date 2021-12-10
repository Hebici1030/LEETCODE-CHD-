package SlidingWindow;

public class NO209_BADtime {
	//两个循环遍历 花费 N^2
	 public int minSubArrayLen(int target, int[] nums) {
	        int res=nums.length+1;
	        int size= nums.length;
	        int sum ;
	        for(int i=0;i<size;i++)
	        {
	            sum = 0;
	            for(int j=i;j<size;j++)
	            {
	                //补充：
	                sum += nums[j];
	                //这里编译错误 应该是有一个值来累加 而不是 单独i j相加
	                if(sum<target)continue;
	                else
	                {
	                    if(res>=(j-i+1))res=(j-i)+1;
	                    break;
	                }

	            }
	        }
	        if(res==nums.length+1)res=0;
	        return res;
	    }
}
